package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  /**
    * The label string. 
    */
  var Name: LabelName
}
object Label {
  
  inline def apply(Name: LabelName): Label = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setName(value: LabelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

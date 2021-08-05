package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClassifierRequest extends StObject {
  
  /**
    * Name of the classifier to retrieve.
    */
  var Name: NameString
}
object GetClassifierRequest {
  
  inline def apply(Name: NameString): GetClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClassifierRequest]
  }
  
  extension [Self <: GetClassifierRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

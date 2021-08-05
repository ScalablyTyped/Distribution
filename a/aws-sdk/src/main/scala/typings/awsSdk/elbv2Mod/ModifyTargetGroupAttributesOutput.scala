package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTargetGroupAttributesOutput extends StObject {
  
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined
}
object ModifyTargetGroupAttributesOutput {
  
  inline def apply(): ModifyTargetGroupAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTargetGroupAttributesOutput]
  }
  
  extension [Self <: ModifyTargetGroupAttributesOutput](x: Self) {
    
    inline def setAttributes(value: TargetGroupAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: TargetGroupAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}

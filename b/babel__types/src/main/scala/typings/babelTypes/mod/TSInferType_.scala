package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInferType_
  extends StObject
     with BaseNode {
  
  var typeParameter: TSTypeParameter_
  
  @JSName("type")
  var type_TSInferType_ : "TSInferType"
}
object TSInferType_ {
  
  inline def apply(typeParameter: TSTypeParameter_): TSInferType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[TSInferType_]
  }
  
  extension [Self <: TSInferType_](x: Self) {
    
    inline def setType(value: "TSInferType"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameter(value: TSTypeParameter_): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}

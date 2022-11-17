package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSArrayType__
  extends StObject
     with BaseNode {
  
  var elementType: TSType
  
  @JSName("type")
  var type_TSArrayType__ : "TSArrayType"
}
object TSArrayType__ {
  
  inline def apply(elementType: TSType): TSArrayType__ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[TSArrayType__]
  }
  
  extension [Self <: TSArrayType__](x: Self) {
    
    inline def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSArrayType"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

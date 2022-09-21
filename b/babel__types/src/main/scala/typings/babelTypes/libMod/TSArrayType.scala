package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSArrayType
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var elementType: TSType
  
  @JSName("type")
  var type_TSArrayType: typings.babelTypes.babelTypesStrings.TSArrayType
}
object TSArrayType {
  
  inline def apply(elementType: TSType): TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[TSArrayType]
  }
  
  extension [Self <: TSArrayType](x: Self) {
    
    inline def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

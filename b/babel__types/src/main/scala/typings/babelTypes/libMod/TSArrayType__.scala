package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSArrayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSArrayType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var elementType: TSType
  
  @JSName("type")
  var type_TSArrayType__ : TSArrayType
}
object TSArrayType__ {
  
  inline def apply(elementType: TSType): TSArrayType__ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[TSArrayType__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSArrayType__] (val x: Self) extends AnyVal {
    
    inline def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

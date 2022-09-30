package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTupleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTupleType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var elementTypes: js.Array[TSType | TSNamedTupleMember__]
  
  @JSName("type")
  var type_TSTupleType__ : TSTupleType
}
object TSTupleType__ {
  
  inline def apply(elementTypes: js.Array[TSType | TSNamedTupleMember__]): TSTupleType__ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[TSTupleType__]
  }
  
  extension [Self <: TSTupleType__](x: Self) {
    
    inline def setElementTypes(value: js.Array[TSType | TSNamedTupleMember__]): Self = StObject.set(x, "elementTypes", value.asInstanceOf[js.Any])
    
    inline def setElementTypesVarargs(value: (TSType | TSNamedTupleMember__)*): Self = StObject.set(x, "elementTypes", js.Array(value*))
    
    inline def setType(value: TSTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

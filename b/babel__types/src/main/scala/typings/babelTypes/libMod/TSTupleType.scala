package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTupleType
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var elementTypes: js.Array[TSType | TSNamedTupleMember]
  
  @JSName("type")
  var type_TSTupleType: typings.babelTypes.babelTypesStrings.TSTupleType
}
object TSTupleType {
  
  inline def apply(elementTypes: js.Array[TSType | TSNamedTupleMember]): TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[TSTupleType]
  }
  
  extension [Self <: TSTupleType](x: Self) {
    
    inline def setElementTypes(value: js.Array[TSType | TSNamedTupleMember]): Self = StObject.set(x, "elementTypes", value.asInstanceOf[js.Any])
    
    inline def setElementTypesVarargs(value: (TSType | TSNamedTupleMember)*): Self = StObject.set(x, "elementTypes", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

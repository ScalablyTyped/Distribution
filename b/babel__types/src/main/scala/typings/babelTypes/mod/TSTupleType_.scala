package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTupleType_
  extends StObject
     with BaseNode {
  
  var elementTypes: js.Array[TSType | TSNamedTupleMember_]
  
  @JSName("type")
  var type_TSTupleType_ : "TSTupleType"
}
object TSTupleType_ {
  
  inline def apply(elementTypes: js.Array[TSType | TSNamedTupleMember_]): TSTupleType_ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[TSTupleType_]
  }
  
  extension [Self <: TSTupleType_](x: Self) {
    
    inline def setElementTypes(value: js.Array[TSType | TSNamedTupleMember_]): Self = StObject.set(x, "elementTypes", value.asInstanceOf[js.Any])
    
    inline def setElementTypesVarargs(value: (TSType | TSNamedTupleMember_)*): Self = StObject.set(x, "elementTypes", js.Array(value*))
    
    inline def setType(value: "TSTupleType"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

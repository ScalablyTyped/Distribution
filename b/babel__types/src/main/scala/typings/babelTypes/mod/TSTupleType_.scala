package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTupleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTupleType_
  extends StObject
     with BaseNode
     with TSType {
  
  var elementTypes: js.Array[TSType | TSNamedTupleMember_]
  
  @JSName("type")
  var type_TSTupleType_ : TSTupleType
}
object TSTupleType_ {
  
  @scala.inline
  def apply(elementTypes: js.Array[TSType | TSNamedTupleMember_]): TSTupleType_ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[TSTupleType_]
  }
  
  @scala.inline
  implicit class TSTupleType_MutableBuilder[Self <: TSTupleType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementTypes(value: js.Array[TSType | TSNamedTupleMember_]): Self = StObject.set(x, "elementTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypesVarargs(value: (TSType | TSNamedTupleMember_)*): Self = StObject.set(x, "elementTypes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

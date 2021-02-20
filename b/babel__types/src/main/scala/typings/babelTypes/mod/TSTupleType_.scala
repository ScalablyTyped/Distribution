package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTupleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSTupleType_
  extends TSType
     with BaseNode {
  
  var elementTypes: js.Array[TSType | TSNamedTupleMember_] = js.native
  
  @JSName("type")
  var type_TSTupleType_ : TSTupleType = js.native
}
object TSTupleType_ {
  
  @scala.inline
  def apply(elementTypes: js.Array[TSType | TSNamedTupleMember_], `type`: TSTupleType): TSTupleType_ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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

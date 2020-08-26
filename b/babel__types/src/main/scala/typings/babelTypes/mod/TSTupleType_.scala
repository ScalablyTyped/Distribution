package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTupleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class TSTupleType_Ops[Self <: TSTupleType_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElementTypesVarargs(value: (TSType | TSNamedTupleMember_)*): Self = this.set("elementTypes", js.Array(value :_*))
    @scala.inline
    def setElementTypes(value: js.Array[TSType | TSNamedTupleMember_]): Self = this.set("elementTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSTupleType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


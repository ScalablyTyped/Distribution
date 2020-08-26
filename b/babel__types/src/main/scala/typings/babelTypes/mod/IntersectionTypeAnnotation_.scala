package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait IntersectionTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  @JSName("type")
  var type_IntersectionTypeAnnotation_ : IntersectionTypeAnnotation = js.native
  var types: js.Array[FlowType] = js.native
}

object IntersectionTypeAnnotation_ {
  @scala.inline
  def apply(`type`: IntersectionTypeAnnotation, types: js.Array[FlowType]): IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionTypeAnnotation_]
  }
  @scala.inline
  implicit class IntersectionTypeAnnotation_Ops[Self <: IntersectionTypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setType(value: IntersectionTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: FlowType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[FlowType]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}


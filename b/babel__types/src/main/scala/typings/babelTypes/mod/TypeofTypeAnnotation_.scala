package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeofTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TypeofTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var argument: FlowType = js.native
  @JSName("type")
  var type_TypeofTypeAnnotation_ : TypeofTypeAnnotation = js.native
}

object TypeofTypeAnnotation_ {
  @scala.inline
  def apply(argument: FlowType, `type`: TypeofTypeAnnotation): TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTypeAnnotation_]
  }
  @scala.inline
  implicit class TypeofTypeAnnotation_Ops[Self <: TypeofTypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setArgument(value: FlowType): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TypeofTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


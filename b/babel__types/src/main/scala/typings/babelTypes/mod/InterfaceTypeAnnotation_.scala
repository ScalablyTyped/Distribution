package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait InterfaceTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var body: ObjectTypeAnnotation_ = js.native
  var `extends`: js.Array[InterfaceExtends_] | Null = js.native
  @JSName("type")
  var type_InterfaceTypeAnnotation_ : InterfaceTypeAnnotation = js.native
}

object InterfaceTypeAnnotation_ {
  @scala.inline
  def apply(body: ObjectTypeAnnotation_, `type`: InterfaceTypeAnnotation): InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeAnnotation_]
  }
  @scala.inline
  implicit class InterfaceTypeAnnotation_Ops[Self <: InterfaceTypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setBody(value: ObjectTypeAnnotation_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: InterfaceTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtends_ *): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtends_]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendsNull: Self = this.set("extends", null)
  }
  
}


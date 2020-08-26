package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait NullableTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var typeAnnotation: FlowType = js.native
  @JSName("type")
  var type_NullableTypeAnnotation_ : NullableTypeAnnotation = js.native
}

object NullableTypeAnnotation_ {
  @scala.inline
  def apply(`type`: NullableTypeAnnotation, typeAnnotation: FlowType): NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableTypeAnnotation_]
  }
  @scala.inline
  implicit class NullableTypeAnnotation_Ops[Self <: NullableTypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setType(value: NullableTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: FlowType): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
  }
  
}


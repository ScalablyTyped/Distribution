package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait MixedTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  @JSName("type")
  var type_MixedTypeAnnotation_ : MixedTypeAnnotation = js.native
}

object MixedTypeAnnotation_ {
  @scala.inline
  def apply(`type`: MixedTypeAnnotation): MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedTypeAnnotation_]
  }
  @scala.inline
  implicit class MixedTypeAnnotation_Ops[Self <: MixedTypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setType(value: MixedTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


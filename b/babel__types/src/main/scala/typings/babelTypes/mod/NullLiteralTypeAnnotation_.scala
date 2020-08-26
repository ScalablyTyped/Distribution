package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait NullLiteralTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  @JSName("type")
  var type_NullLiteralTypeAnnotation_ : NullLiteralTypeAnnotation = js.native
}

object NullLiteralTypeAnnotation_ {
  @scala.inline
  def apply(`type`: NullLiteralTypeAnnotation): NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteralTypeAnnotation_]
  }
  @scala.inline
  implicit class NullLiteralTypeAnnotation_Ops[Self <: NullLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setType(value: NullLiteralTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


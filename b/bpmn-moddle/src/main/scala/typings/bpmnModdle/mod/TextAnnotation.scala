package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAnnotation extends BaseElement {
  var text: String = js.native
  var textFormat: String = js.native
}

object TextAnnotation {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, text: String, textFormat: String): TextAnnotation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textFormat = textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAnnotation]
  }
  @scala.inline
  implicit class TextAnnotationOps[Self <: TextAnnotation] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextFormat(value: String): Self = this.set("textFormat", value.asInstanceOf[js.Any])
  }
  
}


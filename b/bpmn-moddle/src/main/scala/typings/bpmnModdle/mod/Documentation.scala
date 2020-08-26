package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Documentation extends BaseElement {
  var text: String = js.native
  /**
    * @default "text/plain"
    */
  var textFormat: String = js.native
}

object Documentation {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, text: String, textFormat: String): Documentation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textFormat = textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentation]
  }
  @scala.inline
  implicit class DocumentationOps[Self <: Documentation] (val x: Self) extends AnyVal {
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


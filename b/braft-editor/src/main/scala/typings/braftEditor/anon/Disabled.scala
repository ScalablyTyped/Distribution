package typings.braftEditor.anon

import typings.braftEditor.braftEditorStrings.modal
import typings.braftEditor.mod.ExtendControlType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled extends ExtendControlType {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var html: js.UndefOr[String | Null] = js.native
  var key: String = js.native
  var modal: BottomText = js.native
  var onClick: js.UndefOr[js.Function] = js.native
  var text: js.UndefOr[String | ReactNode] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: modal = js.native
}

object Disabled {
  @scala.inline
  def apply(key: String, modal: BottomText, `type`: modal): Disabled = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setModal(value: BottomText): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: modal): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setHtmlNull: Self = this.set("html", null)
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setText(value: String | ReactNode): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


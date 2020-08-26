package typings.braftEditor.anon

import typings.braftEditor.braftEditorStrings.dropdown
import typings.braftEditor.mod.ExtendControlType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowActive extends ExtendControlType {
  var arrowActive: js.UndefOr[Boolean] = js.native
  var autoHide: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var component: ReactNode = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var html: js.UndefOr[String | Null] = js.native
  var key: String = js.native
  var showArrow: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String | ReactNode] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: dropdown = js.native
}

object ArrowActive {
  @scala.inline
  def apply(key: String, `type`: dropdown): ArrowActive = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowActive]
  }
  @scala.inline
  implicit class ArrowActiveOps[Self <: ArrowActive] (val x: Self) extends AnyVal {
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
    def setType(value: dropdown): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowActive(value: Boolean): Self = this.set("arrowActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowActive: Self = this.set("arrowActive", js.undefined)
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponent(value: ReactNode): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
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
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
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


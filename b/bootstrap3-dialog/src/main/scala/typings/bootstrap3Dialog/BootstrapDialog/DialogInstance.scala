package typings.bootstrap3Dialog.BootstrapDialog

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogInstance extends js.Object {
  @JSName("$modal")
  var $modal: JQuery[HTMLElement] = js.native
  @JSName("$modalBody")
  var $modalBody: JQuery[HTMLElement] = js.native
  @JSName("$modalContent")
  var $modalContent: JQuery[HTMLElement] = js.native
  @JSName("$modalDialog")
  var $modalDialog: JQuery[HTMLElement] = js.native
  @JSName("$modalFooter")
  var $modalFooter: JQuery[HTMLElement] = js.native
  @JSName("$modalHeader")
  var $modalHeader: JQuery[HTMLElement] = js.native
  var opened: Boolean = js.native
  var options: DialogOptions = js.native
}

object DialogInstance {
  @scala.inline
  def apply(
    $modal: JQuery[HTMLElement],
    $modalBody: JQuery[HTMLElement],
    $modalContent: JQuery[HTMLElement],
    $modalDialog: JQuery[HTMLElement],
    $modalFooter: JQuery[HTMLElement],
    $modalHeader: JQuery[HTMLElement],
    opened: Boolean,
    options: DialogOptions
  ): DialogInstance = {
    val __obj = js.Dynamic.literal($modal = $modal.asInstanceOf[js.Any], $modalBody = $modalBody.asInstanceOf[js.Any], $modalContent = $modalContent.asInstanceOf[js.Any], $modalDialog = $modalDialog.asInstanceOf[js.Any], $modalFooter = $modalFooter.asInstanceOf[js.Any], $modalHeader = $modalHeader.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogInstance]
  }
  @scala.inline
  implicit class DialogInstanceOps[Self <: DialogInstance] (val x: Self) extends AnyVal {
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
    def set$modal(value: JQuery[HTMLElement]): Self = this.set("$modal", value.asInstanceOf[js.Any])
    @scala.inline
    def set$modalBody(value: JQuery[HTMLElement]): Self = this.set("$modalBody", value.asInstanceOf[js.Any])
    @scala.inline
    def set$modalContent(value: JQuery[HTMLElement]): Self = this.set("$modalContent", value.asInstanceOf[js.Any])
    @scala.inline
    def set$modalDialog(value: JQuery[HTMLElement]): Self = this.set("$modalDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def set$modalFooter(value: JQuery[HTMLElement]): Self = this.set("$modalFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def set$modalHeader(value: JQuery[HTMLElement]): Self = this.set("$modalHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpened(value: Boolean): Self = this.set("opened", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: DialogOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}


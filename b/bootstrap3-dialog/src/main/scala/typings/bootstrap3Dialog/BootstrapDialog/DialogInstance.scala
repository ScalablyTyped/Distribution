package typings.bootstrap3Dialog.BootstrapDialog

import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInstance extends js.Object {
  @JSName("$modal")
  var $modal: JQuery_[HTMLElement]
  @JSName("$modalBody")
  var $modalBody: JQuery_[HTMLElement]
  @JSName("$modalContent")
  var $modalContent: JQuery_[HTMLElement]
  @JSName("$modalDialog")
  var $modalDialog: JQuery_[HTMLElement]
  @JSName("$modalFooter")
  var $modalFooter: JQuery_[HTMLElement]
  @JSName("$modalHeader")
  var $modalHeader: JQuery_[HTMLElement]
  var opened: Boolean
  var options: DialogOptions
}

object DialogInstance {
  @scala.inline
  def apply(
    $modal: JQuery_[HTMLElement],
    $modalBody: JQuery_[HTMLElement],
    $modalContent: JQuery_[HTMLElement],
    $modalDialog: JQuery_[HTMLElement],
    $modalFooter: JQuery_[HTMLElement],
    $modalHeader: JQuery_[HTMLElement],
    opened: Boolean,
    options: DialogOptions
  ): DialogInstance = {
    val __obj = js.Dynamic.literal($modal = $modal.asInstanceOf[js.Any], $modalBody = $modalBody.asInstanceOf[js.Any], $modalContent = $modalContent.asInstanceOf[js.Any], $modalDialog = $modalDialog.asInstanceOf[js.Any], $modalFooter = $modalFooter.asInstanceOf[js.Any], $modalHeader = $modalHeader.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogInstance]
  }
}


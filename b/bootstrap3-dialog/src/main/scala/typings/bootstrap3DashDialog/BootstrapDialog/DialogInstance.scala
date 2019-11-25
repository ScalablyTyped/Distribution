package typings.bootstrap3DashDialog.BootstrapDialog

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInstance extends js.Object {
  @JSName("$modal")
  var $modal: JQuery[HTMLElement]
  @JSName("$modalBody")
  var $modalBody: JQuery[HTMLElement]
  @JSName("$modalContent")
  var $modalContent: JQuery[HTMLElement]
  @JSName("$modalDialog")
  var $modalDialog: JQuery[HTMLElement]
  @JSName("$modalFooter")
  var $modalFooter: JQuery[HTMLElement]
  @JSName("$modalHeader")
  var $modalHeader: JQuery[HTMLElement]
  var opened: Boolean
  var options: DialogOptions
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
}


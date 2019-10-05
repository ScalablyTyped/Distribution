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
    val __obj = js.Dynamic.literal($modal = $modal, $modalBody = $modalBody, $modalContent = $modalContent, $modalDialog = $modalDialog, $modalFooter = $modalFooter, $modalHeader = $modalHeader, opened = opened, options = options)
  
    __obj.asInstanceOf[DialogInstance]
  }
}


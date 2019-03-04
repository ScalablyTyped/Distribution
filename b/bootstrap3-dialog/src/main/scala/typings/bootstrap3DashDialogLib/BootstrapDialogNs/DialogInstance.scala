package typings
package bootstrap3DashDialogLib.BootstrapDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInstance extends js.Object {
  @JSName("$modal")
  var $modal: jqueryLib.JQuery[stdLib.HTMLElement]
  @JSName("$modalBody")
  var $modalBody: jqueryLib.JQuery[stdLib.HTMLElement]
  @JSName("$modalContent")
  var $modalContent: jqueryLib.JQuery[stdLib.HTMLElement]
  @JSName("$modalDialog")
  var $modalDialog: jqueryLib.JQuery[stdLib.HTMLElement]
  @JSName("$modalFooter")
  var $modalFooter: jqueryLib.JQuery[stdLib.HTMLElement]
  @JSName("$modalHeader")
  var $modalHeader: jqueryLib.JQuery[stdLib.HTMLElement]
  var opened: scala.Boolean
  var options: DialogOptions
}

object DialogInstance {
  @scala.inline
  def apply(
    $modal: jqueryLib.JQuery[stdLib.HTMLElement],
    $modalBody: jqueryLib.JQuery[stdLib.HTMLElement],
    $modalContent: jqueryLib.JQuery[stdLib.HTMLElement],
    $modalDialog: jqueryLib.JQuery[stdLib.HTMLElement],
    $modalFooter: jqueryLib.JQuery[stdLib.HTMLElement],
    $modalHeader: jqueryLib.JQuery[stdLib.HTMLElement],
    opened: scala.Boolean,
    options: DialogOptions
  ): DialogInstance = {
    val __obj = js.Dynamic.literal($modal = $modal, $modalBody = $modalBody, $modalContent = $modalContent, $modalDialog = $modalDialog, $modalFooter = $modalFooter, $modalHeader = $modalHeader, opened = opened, options = options)
  
    __obj.asInstanceOf[DialogInstance]
  }
}


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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$modal")($modal)
    __obj.updateDynamic("$modalBody")($modalBody)
    __obj.updateDynamic("$modalContent")($modalContent)
    __obj.updateDynamic("$modalDialog")($modalDialog)
    __obj.updateDynamic("$modalFooter")($modalFooter)
    __obj.updateDynamic("$modalHeader")($modalHeader)
    __obj.updateDynamic("opened")(opened)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[DialogInstance]
  }
}


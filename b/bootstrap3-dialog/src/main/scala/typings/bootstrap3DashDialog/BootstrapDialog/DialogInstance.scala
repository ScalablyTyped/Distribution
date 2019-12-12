package typings.bootstrap3DashDialog.BootstrapDialog

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


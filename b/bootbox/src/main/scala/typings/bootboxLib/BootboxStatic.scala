package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootboxStatic extends js.Object {
  def addLocale(name: java.lang.String, values: BootboxLocaleValues): scala.Unit = js.native
  def alert(message: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def alert(message: java.lang.String, callback: js.Function0[scala.Unit]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def alert(options: BootboxAlertOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def confirm(message: java.lang.String, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def confirm(options: BootboxConfirmOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def dialog(message: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def dialog(message: java.lang.String, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def dialog(options: BootboxDialogOptions[java.lang.String]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def hideAll(): scala.Unit = js.native
  def prompt(message: java.lang.String, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def prompt(options: BootboxPromptOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def removeLocale(name: java.lang.String): scala.Unit = js.native
  def setDefaults(options: BootboxDefaultOptions): scala.Unit = js.native
  def setLocale(name: java.lang.String): scala.Unit = js.native
}


package typings.bootbox

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootboxStatic extends js.Object {
  
  def addLocale(name: String, values: BootboxLocaleValues): Unit = js.native
  
  def alert(message: String): JQuery[HTMLElement] = js.native
  def alert(message: String, callback: js.Function0[Unit]): JQuery[HTMLElement] = js.native
  def alert(options: BootboxAlertOptions): JQuery[HTMLElement] = js.native
  
  def confirm(message: String, callback: js.Function1[/* result */ Boolean, Unit]): JQuery[HTMLElement] = js.native
  def confirm(options: BootboxConfirmOptions): JQuery[HTMLElement] = js.native
  
  def dialog(message: String): JQuery[HTMLElement] = js.native
  def dialog(message: String, callback: js.Function1[/* result */ String, Unit]): JQuery[HTMLElement] = js.native
  def dialog(options: BootboxDialogOptions[String]): JQuery[HTMLElement] = js.native
  
  def hideAll(): Unit = js.native
  
  def prompt(message: String, callback: js.Function1[/* result */ String, Unit]): JQuery[HTMLElement] = js.native
  def prompt(options: BootboxPromptOptions): JQuery[HTMLElement] = js.native
  
  def removeLocale(name: String): Unit = js.native
  
  def setDefaults(options: BootboxDefaultOptions): Unit = js.native
  
  def setLocale(name: String): Unit = js.native
}

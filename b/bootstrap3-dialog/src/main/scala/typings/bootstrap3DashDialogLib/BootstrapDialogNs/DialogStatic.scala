package typings
package bootstrap3DashDialogLib.BootstrapDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogStatic extends js.Object {
  var BUTTONS_ORDER_CANCEL_OK: java.lang.String = js.native
  var BUTTONS_ORDER_OK_CANCEL: java.lang.String = js.native
  var BUTTON_SIZES: js.Any = js.native
  var DEFAULT_TEXTS: js.Any = js.native
                   /** For text localization. */ var ICON_SPINNER: java.lang.String = js.native
  var NAMESPACE: java.lang.String = js.native
  var SIZE_LARGE: java.lang.String = js.native
  var SIZE_NORMAL: java.lang.String = js.native
  var SIZE_SMALL: java.lang.String = js.native
  var SIZE_WIDE: java.lang.String = js.native
  var TYPE_DANGER: java.lang.String = js.native
  var TYPE_DEFAULT: java.lang.String = js.native
  var TYPE_INFO: java.lang.String = js.native
  var TYPE_PRIMARY: java.lang.String = js.native
  var TYPE_SUCCESS: java.lang.String = js.native
  var TYPE_WARNING: java.lang.String = js.native
  def apply(options: DialogOptions): DialogContext = js.native
  def alert(message: java.lang.String): scala.Unit = js.native
  def alert(message: java.lang.String, closeCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def confirm(message: java.lang.String): scala.Unit = js.native
  def confirm(message: java.lang.String, closeCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def show(options: DialogOptions): DialogInstance = js.native
}


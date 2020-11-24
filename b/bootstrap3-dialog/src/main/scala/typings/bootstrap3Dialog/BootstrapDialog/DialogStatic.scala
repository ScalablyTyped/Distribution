package typings.bootstrap3Dialog.BootstrapDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogStatic extends js.Object {
  
  def apply(options: DialogOptions): DialogContext = js.native
  
  var BUTTONS_ORDER_CANCEL_OK: String = js.native
  
  var BUTTONS_ORDER_OK_CANCEL: String = js.native
  
  var BUTTON_SIZES: js.Any = js.native
  
  var DEFAULT_TEXTS: js.Any = js.native
  
                   /** For text localization. */ var ICON_SPINNER: String = js.native
  
  var NAMESPACE: String = js.native
  
  var SIZE_LARGE: String = js.native
  
  var SIZE_NORMAL: String = js.native
  
  var SIZE_SMALL: String = js.native
  
  var SIZE_WIDE: String = js.native
  
  var TYPE_DANGER: String = js.native
  
  var TYPE_DEFAULT: String = js.native
  
  var TYPE_INFO: String = js.native
  
  var TYPE_PRIMARY: String = js.native
  
  var TYPE_SUCCESS: String = js.native
  
  var TYPE_WARNING: String = js.native
  
  def alert(message: String): Unit = js.native
  def alert(message: String, closeCallback: js.Function0[Unit]): Unit = js.native
  
  def confirm(message: String): Unit = js.native
  def confirm(message: String, closeCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  def show(options: DialogOptions): DialogInstance = js.native
}

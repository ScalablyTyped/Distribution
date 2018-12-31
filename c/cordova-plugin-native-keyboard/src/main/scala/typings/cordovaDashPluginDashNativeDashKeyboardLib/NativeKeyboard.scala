package typings
package cordovaDashPluginDashNativeDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeKeyboard extends js.Object {
  /**
    * It's likely your app only has 1 one page where you want to show the messenger,
    * so you want to hide it when the user navigates away. You can choose to do this
    * either animated (a quick slide down animation) or not.
    */
  def hideMessenger(): scala.Unit = js.native
  def hideMessenger(options: NativeKeyboardHideOptions): scala.Unit = js.native
  def hideMessenger(options: NativeKeyboardHideOptions, onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def hideMessenger(
    options: NativeKeyboardHideOptions,
    onSuccess: js.Function0[scala.Unit],
    onError: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Hide the keyboard, but not the messenger bar
    */
  def hideMessengerKeyboard(): scala.Unit = js.native
  def hideMessengerKeyboard(onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def hideMessengerKeyboard(onSuccess: js.Function0[scala.Unit], onError: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Show the messenger, the bare minimum which has to be passed to the function is
    * the onSubmit callback
    */
  def showMessenger(options: NativeKeyboardShowOptions): scala.Unit = js.native
  /**
    * Show a previously hidden keyboard
    */
  def showMessengerKeyboard(): scala.Unit = js.native
  def showMessengerKeyboard(onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def showMessengerKeyboard(onSuccess: js.Function0[scala.Unit], onError: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Manipulate the messenger while it's open. For instance if you want to
    * update the text programmatically based on what the user typed (by responding to
    * onTextChanged events).
    */
  def updateMessenger(options: NativeKeyboardUpdateOptions): scala.Unit = js.native
  def updateMessenger(options: NativeKeyboardUpdateOptions, onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def updateMessenger(
    options: NativeKeyboardUpdateOptions,
    onSuccess: js.Function0[scala.Unit],
    onError: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}


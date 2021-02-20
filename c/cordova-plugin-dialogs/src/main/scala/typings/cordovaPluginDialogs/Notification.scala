package typings.cordovaPluginDialogs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This plugin provides access to some native dialog UI elements. */
@js.native
trait Notification extends StObject {
  
  /**
    * Shows a custom alert or dialog box. Most Cordova implementations use a native dialog box for this feature,
    * but some platforms use the browser's alert function, which is typically less customizable.
    * @param message       Dialog message.
    * @param alertCallback Callback to invoke when alert dialog is dismissed.
    * @param title         Dialog title, defaults to 'Alert'.
    * @param buttonName    Button name, defaults to OK.
    */
  def alert(message: String, alertCallback: js.Function0[Unit]): Unit = js.native
  def alert(
    message: String,
    alertCallback: js.Function0[Unit],
    title: js.UndefOr[scala.Nothing],
    buttonName: String
  ): Unit = js.native
  def alert(message: String, alertCallback: js.Function0[Unit], title: String): Unit = js.native
  def alert(message: String, alertCallback: js.Function0[Unit], title: String, buttonName: String): Unit = js.native
  
  /**
    * The device plays a beep sound.
    * @param times The number of times to repeat the beep. 
    */
  def beep(times: Double): Unit = js.native
  
  /**
    * Displays a customizable confirmation dialog box.
    * @param message           Dialog message.
    * @param confirmCallback   Callback to invoke with index of button pressed (1, 2, or 3)
    *                                   or when the dialog is dismissed without a button press (0).
    * @param title             Dialog title, defaults to Confirm.
    * @param buttonLabels      Array of strings specifying button labels, defaults to [OK,Cancel].
    */
  def confirm(message: String, confirmCallback: js.Function1[/* choice */ Double, Unit]): Unit = js.native
  def confirm(
    message: String,
    confirmCallback: js.Function1[/* choice */ Double, Unit],
    title: js.UndefOr[scala.Nothing],
    buttonLabels: js.Array[String]
  ): Unit = js.native
  def confirm(message: String, confirmCallback: js.Function1[/* choice */ Double, Unit], title: String): Unit = js.native
  def confirm(
    message: String,
    confirmCallback: js.Function1[/* choice */ Double, Unit],
    title: String,
    buttonLabels: js.Array[String]
  ): Unit = js.native
  
  /**
    * Displays a native dialog box that is more customizable than the browser's prompt function.
    * @param message           Dialog message.
    * @param promptCallback    Callback to invoke when a button is pressed.
    * @param title             Dialog title, defaults to "Prompt".
    * @param buttonLabels      Array of strings specifying button labels, defaults to ["OK","Cancel"].
    * @param defaultText       Default textbox input value, default: "".
    */
  def prompt(message: String, promptCallback: js.Function1[/* result */ NotificationPromptResult, Unit]): Unit = js.native
  def prompt(
    message: String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, Unit],
    title: js.UndefOr[scala.Nothing],
    buttonLabels: js.UndefOr[scala.Nothing],
    defaultText: String
  ): Unit = js.native
  def prompt(
    message: String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, Unit],
    title: js.UndefOr[scala.Nothing],
    buttonLabels: js.Array[String]
  ): Unit = js.native
  def prompt(
    message: String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, Unit],
    title: js.UndefOr[scala.Nothing],
    buttonLabels: js.Array[String],
    defaultText: String
  ): Unit = js.native
  def prompt(
    message: String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, Unit],
    title: String
  ): Unit = js.native
  def prompt(
    message: String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, Unit],
    title: String,
    buttonLabels: js.UndefOr[scala.Nothing],
    defaultText: String
  ): Unit = js.native
  def prompt(
    message: String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, Unit],
    title: String,
    buttonLabels: js.Array[String]
  ): Unit = js.native
  def prompt(
    message: String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, Unit],
    title: String,
    buttonLabels: js.Array[String],
    defaultText: String
  ): Unit = js.native
}

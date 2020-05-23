package typings.azdata.mod.window

import typings.azdata.mod.BackgroundOperationInfo
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends ModelViewPanel {
  /**
    * The cancel button
    */
  var cancelButton: Button = js.native
  /**
    * The content of the dialog. If multiple tabs are given they will be displayed with tabs
    * If a string is given, it should be the ID of the dialog's model view content
    */
  var content: String | js.Array[DialogTab] = js.native
  /**
    * Any additional buttons that should be displayed
    */
  var customButtons: js.Array[Button] = js.native
  /**
    * Set the dialog name when opening
    * the dialog for telemetry
    */
  var dialogName: js.UndefOr[String] = js.native
  /**
    * Indicates the width of the dialog
    */
  var isWide: Boolean = js.native
  /**
    * Set the informational message shown in the dialog. Hidden when the message is
    * undefined or the text is empty or undefined. The default level is error.
    */
  var message: DialogMessage = js.native
  /**
    * The ok button
    */
  var okButton: Button = js.native
  /**
    * The title of the dialog
    */
  var title: String = js.native
  /**
    * Register a callback that will be called when the user tries to click done. Only
    * one callback can be registered at once, so each registration call will clear
    * the previous registration.
    * @param validator The callback that gets executed when the user tries to click
    * done. Return true to allow the dialog to close or false to block it from closing
    */
  def registerCloseValidator(validator: js.Function0[Boolean | Thenable[Boolean]]): Unit = js.native
  /**
    * Register an operation to run in the background when the dialog is done
    * @param operationInfo Operation Information
    */
  def registerOperation(operationInfo: BackgroundOperationInfo): Unit = js.native
}


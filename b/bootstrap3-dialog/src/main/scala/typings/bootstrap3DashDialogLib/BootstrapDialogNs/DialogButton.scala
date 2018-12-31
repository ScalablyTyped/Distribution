package typings
package bootstrap3DashDialogLib.BootstrapDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButton extends js.Object {
  /**
    * If provided, the callback will be invoked after the button is clicked, and the dialog instance
    * will be passed to the callback function.
    */
  var action: js.UndefOr[js.Function1[/* dialog */ DialogContext, scala.Unit]] = js.undefined
  /**  If it's true, after clicked the button a spinning icon appears. */
  var autospin: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional css class to be added to the button. */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Object containing data attributes to be added to the button. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Hotkey char code */
  var hotkey: js.UndefOr[scala.Double] = js.undefined
  /** If set, the specified icon will be added to the button. */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** If id is set, you can use dialogInstance.getButton(id) to get the button later. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
}


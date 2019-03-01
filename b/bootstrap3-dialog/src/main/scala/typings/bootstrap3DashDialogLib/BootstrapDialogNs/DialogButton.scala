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

object DialogButton {
  @scala.inline
  def apply(
    action: js.Function1[/* dialog */ DialogContext, scala.Unit] = null,
    autospin: js.UndefOr[scala.Boolean] = js.undefined,
    cssClass: java.lang.String = null,
    data: js.Any = null,
    hotkey: scala.Int | scala.Double = null,
    icon: java.lang.String = null,
    id: java.lang.String = null,
    label: java.lang.String = null
  ): DialogButton = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(autospin)) __obj.updateDynamic("autospin")(autospin)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (data != null) __obj.updateDynamic("data")(data)
    if (hotkey != null) __obj.updateDynamic("hotkey")(hotkey.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[DialogButton]
  }
}


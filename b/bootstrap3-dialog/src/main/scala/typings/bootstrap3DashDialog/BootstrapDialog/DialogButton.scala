package typings.bootstrap3DashDialog.BootstrapDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButton extends js.Object {
  /**
    * If provided, the callback will be invoked after the button is clicked, and the dialog instance
    * will be passed to the callback function.
    */
  var action: js.UndefOr[js.Function1[/* dialog */ DialogContext, Unit]] = js.undefined
  /**  If it's true, after clicked the button a spinning icon appears. */
  var autospin: js.UndefOr[Boolean] = js.undefined
  /** Additional css class to be added to the button. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Object containing data attributes to be added to the button. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Hotkey char code */
  var hotkey: js.UndefOr[Double] = js.undefined
  /** If set, the specified icon will be added to the button. */
  var icon: js.UndefOr[String] = js.undefined
  /** If id is set, you can use dialogInstance.getButton(id) to get the button later. */
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object DialogButton {
  @scala.inline
  def apply(
    action: /* dialog */ DialogContext => Unit = null,
    autospin: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    data: js.Any = null,
    hotkey: Int | Double = null,
    icon: String = null,
    id: String = null,
    label: String = null
  ): DialogButton = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (!js.isUndefined(autospin)) __obj.updateDynamic("autospin")(autospin.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (hotkey != null) __obj.updateDynamic("hotkey")(hotkey.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogButton]
  }
}


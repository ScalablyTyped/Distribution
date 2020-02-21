package typings.cathoQuantum.snackBarMod

import typings.cathoQuantum.AnonBaseFontSizeBreakpointsColors
import typings.cathoQuantum.AnonCallback
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackBarProps[T] extends js.Object {
  var actionTrigger: js.UndefOr[AnonCallback[T]] = js.undefined
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var secondsToClose: js.UndefOr[Double] = js.undefined
  var skin: js.UndefOr[primary | success | error | neutral | warning] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSizeBreakpointsColors] = js.undefined
}

object SnackBarProps {
  @scala.inline
  def apply[T](
    actionTrigger: AnonCallback[T] = null,
    closeButtonAriaLabel: String = null,
    id: String = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    onClose: MouseEvent[T, NativeMouseEvent] => Unit = null,
    secondsToClose: Int | Double = null,
    skin: primary | success | error | neutral | warning = null,
    text: String = null,
    theme: AnonBaseFontSizeBreakpointsColors = null
  ): SnackBarProps[T] = {
    val __obj = js.Dynamic.literal()
    if (actionTrigger != null) __obj.updateDynamic("actionTrigger")(actionTrigger.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (secondsToClose != null) __obj.updateDynamic("secondsToClose")(secondsToClose.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackBarProps[T]]
  }
}


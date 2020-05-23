package typings.cathoQuantum.modalMod

import typings.cathoQuantum.anon.BreakpointsColors
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var theme: js.UndefOr[BreakpointsColors] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    closeButtonAriaLabel: String = null,
    onClose: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    theme: BreakpointsColors = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}


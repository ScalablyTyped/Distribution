package typings.cathoQuantum.alertMod

import typings.cathoQuantum.anon.Colors
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  var children: ReactNode
  var icon: js.UndefOr[String] = js.undefined
  var onClose: MouseEventHandler[HTMLButtonElement]
  var skin: js.UndefOr[primary | success | error | neutral | warning] = js.undefined
  var theme: js.UndefOr[Colors] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    onClose: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    children: ReactNode = null,
    icon: String = null,
    skin: primary | success | error | neutral | warning = null,
    theme: Colors = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
}


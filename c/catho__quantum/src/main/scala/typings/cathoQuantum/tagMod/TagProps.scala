package typings.cathoQuantum.tagMod

import typings.cathoQuantum.anon.ColorsComponentsSpacing
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
  var skin: js.UndefOr[neutral | primary | success | warning | error] = js.undefined
  var stroked: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[ColorsComponentsSpacing] = js.undefined
}

object TagProps {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    onClose: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    size: small | medium | large = null,
    skin: neutral | primary | success | warning | error = null,
    stroked: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    theme: ColorsComponentsSpacing = null
  ): TagProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(stroked)) __obj.updateDynamic("stroked")(stroked.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
}


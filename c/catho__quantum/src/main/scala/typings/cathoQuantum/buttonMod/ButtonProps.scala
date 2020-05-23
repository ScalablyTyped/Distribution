package typings.cathoQuantum.buttonMod

import typings.cathoQuantum.anon.Breakpoints
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.reset
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.submit
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  @JSName("$as")
  var $as: js.UndefOr[Element | String] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var full: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.undefined
  var stroked: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[Breakpoints] = js.undefined
  var `type`: js.UndefOr[button | reset | submit] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    $as: Element | String = null,
    center: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[ReactNode] | ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    full: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    id: String = null,
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    size: xsmall | small | medium | large | xlarge = null,
    skin: neutral | primary | secondary | success | warning | error = null,
    stroked: js.UndefOr[Boolean] = js.undefined,
    theme: Breakpoints = null,
    `type`: button | reset | submit = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if ($as != null) __obj.updateDynamic("$as")($as.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(stroked)) __obj.updateDynamic("stroked")(stroked.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}


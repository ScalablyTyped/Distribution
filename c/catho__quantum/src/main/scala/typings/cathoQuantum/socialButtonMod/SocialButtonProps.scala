package typings.cathoQuantum.socialButtonMod

import typings.cathoQuantum.AnonBreakpoints
import typings.cathoQuantum.buttonMod.ButtonProps
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
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialButtonProps extends ButtonProps {
  var provider: String
}

object SocialButtonProps {
  @scala.inline
  def apply(
    provider: String,
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
    theme: AnonBreakpoints = null,
    `type`: button | reset | submit = null
  ): SocialButtonProps = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if ($as != null) __obj.updateDynamic("$as")($as.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(stroked)) __obj.updateDynamic("stroked")(stroked.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialButtonProps]
  }
}


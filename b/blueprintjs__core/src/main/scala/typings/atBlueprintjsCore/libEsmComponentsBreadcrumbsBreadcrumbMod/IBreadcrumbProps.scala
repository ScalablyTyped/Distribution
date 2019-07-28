package typings.atBlueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod

import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IActionProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.ILinkProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumbProps
  extends IActionProps
     with ILinkProps {
  /** Whether this breadcrumb is the current breadcrumb. */
  var current: js.UndefOr[Boolean] = js.undefined
}

object IBreadcrumbProps {
  @scala.inline
  def apply(
    className: String = null,
    current: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    onClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    target: String = null,
    text: ReactNode = null
  ): IBreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbProps]
  }
}


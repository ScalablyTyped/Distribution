package typings.blueprintjsCore.propsMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionProps
  extends IIntentProps
     with IProps {
  /** Whether this action is non-interactive. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render before the text. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** Click event handler. */
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  /** Action text. Can be any single React renderable. */
  var text: js.UndefOr[ReactNode] = js.undefined
}

object IActionProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[Null | IconName | MaybeElement] = js.undefined,
    intent: Intent = null,
    onClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    text: ReactNode = null
  ): IActionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionProps]
  }
}


package typings.atBlueprintjsCore.libEsmComponentsCardCardMod

import typings.atBlueprintjsCore.libEsmCommonElevationMod.Elevation
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait ICardProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Controls the intensity of the drop shadow beneath the card: the higher
    * the elevation, the higher the drop shadow. At elevation `0`, no drop
    * shadow is applied.
    *
    * @default 0
    */
  var elevation: js.UndefOr[Elevation] = js.undefined
  /**
    * Whether the card should respond to user interactions. If set to `true`,
    * hovering over the card will increase the card's elevation
    * and change the mouse cursor to a pointer.
    *
    * Recommended when `onClick` is also defined.
    *
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback invoked when the card is clicked.
    * Recommended when `interactive` is `true`.
    */
  @JSName("onClick")
  var onClick_ICardProps: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
}

object ICardProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    elevation: Elevation = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    onClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null
  ): ICardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ICardProps]
  }
}


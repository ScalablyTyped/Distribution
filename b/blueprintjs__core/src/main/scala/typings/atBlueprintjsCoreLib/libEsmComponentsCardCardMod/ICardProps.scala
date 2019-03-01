package typings
package atBlueprintjsCoreLib.libEsmComponentsCardCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait ICardProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
    * Controls the intensity of the drop shadow beneath the card: the higher
    * the elevation, the higher the drop shadow. At elevation `0`, no drop
    * shadow is applied.
    *
    * @default 0
    */
  var elevation: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonElevationMod.Elevation] = js.undefined
  /**
    * Whether the card should respond to user interactions. If set to `true`,
    * hovering over the card will increase the card's elevation
    * and change the mouse cursor to a pointer.
    *
    * Recommended when `onClick` is also defined.
    *
    * @default false
    */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback invoked when the card is clicked.
    * Recommended when `interactive` is `true`.
    */
  @JSName("onClick")
  var onClick_ICardProps: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
}

object ICardProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    elevation: atBlueprintjsCoreLib.libEsmCommonElevationMod.Elevation = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null
  ): ICardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[ICardProps]
  }
}


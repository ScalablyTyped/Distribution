package typings
package atBlueprintjsCoreLib.libEsmComponentsTooltipTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProps
  extends atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverSharedPropsMod.IPopoverSharedProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
    * The content that will be displayed inside of the tooltip.
    */
  var content: reactLib.reactMod.Global.JSXNs.Element | java.lang.String
  /**
    * The kind of hover interaction that triggers the display of the tooltip.
    * Tooltips do not support click interactions.
    * @default PopoverInteractionKind.HOVER_TARGET_ONLY
    */
  var interactionKind: js.UndefOr[
    atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.hover | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.`hover-target`
  ] = js.undefined
}


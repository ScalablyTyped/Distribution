package typings
package atBlueprintjsCoreLib.libEsmComponentsButtonButtonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IButtonGroupProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
    * Text alignment within button. By default, icons and text will be centered
    * within the button. Passing `"left"` or `"right"` will align the button
    * text to that side and push `icon` and `rightIcon` to either edge. Passing
    * `"center"` will center the text and icons together.
    */
  var alignText: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonAlignmentMod.Alignment] = js.undefined
  /**
    * Whether the button group should take up the full width of its container.
    * @default false
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the child buttons should appear with large styling.
    * @default false
    */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the child buttons should appear with minimal styling.
    * @default false
    */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the button group should appear with vertical styling.
    * @default false
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}


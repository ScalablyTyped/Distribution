package typings
package atBlueprintjsCoreLib.libEsmComponentsButtonButtonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IButtonGroupProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] {
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

object IButtonGroupProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    alignText: atBlueprintjsCoreLib.libEsmCommonAlignmentMod.Alignment = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    minimal: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): IButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (alignText != null) __obj.updateDynamic("alignText")(alignText)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[IButtonGroupProps]
  }
}


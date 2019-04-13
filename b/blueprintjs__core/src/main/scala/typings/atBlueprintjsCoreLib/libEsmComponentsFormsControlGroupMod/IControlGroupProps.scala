package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsControlGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IControlGroupProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  /**
    * Whether the control group should take up the full width of its container.
    * @default false
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the control group should appear with vertical styling.
    * @default false
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object IControlGroupProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): IControlGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[IControlGroupProps]
  }
}


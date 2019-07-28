package typings.atBlueprintjsCore.libEsmComponentsFormsControlGroupMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IControlGroupProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Whether the control group should take up the full width of its container.
    * @default false
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the control group should appear with vertical styling.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object IControlGroupProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    IProps: IProps = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): IControlGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[IControlGroupProps]
  }
}


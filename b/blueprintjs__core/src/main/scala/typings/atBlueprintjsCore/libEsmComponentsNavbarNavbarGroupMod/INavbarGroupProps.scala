package typings.atBlueprintjsCore.libEsmComponentsNavbarNavbarGroupMod

import typings.atBlueprintjsCore.libEsmCommonAlignmentMod.Alignment
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait INavbarGroupProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * The side of the navbar on which the group should appear.
    * The `Alignment` enum provides constants for these values.
    * @default Alignment.LEFT
    */
  var align: js.UndefOr[Alignment] = js.undefined
}

object INavbarGroupProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    IProps: IProps = null,
    align: Alignment = null
  ): INavbarGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (align != null) __obj.updateDynamic("align")(align)
    __obj.asInstanceOf[INavbarGroupProps]
  }
}


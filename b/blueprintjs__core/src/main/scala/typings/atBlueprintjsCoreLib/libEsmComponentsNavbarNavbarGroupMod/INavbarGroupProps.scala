package typings
package atBlueprintjsCoreLib.libEsmComponentsNavbarNavbarGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait INavbarGroupProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
    * The side of the navbar on which the group should appear.
    * The `Alignment` enum provides constants for these values.
    * @default Alignment.LEFT
    */
  var align: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonAlignmentMod.Alignment] = js.undefined
}

object INavbarGroupProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    align: atBlueprintjsCoreLib.libEsmCommonAlignmentMod.Alignment = null
  ): INavbarGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (align != null) __obj.updateDynamic("align")(align)
    __obj.asInstanceOf[INavbarGroupProps]
  }
}


package typings
package atBlueprintjsCoreLib.libEsmComponentsNavbarNavbarHeadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait INavbarHeadingProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]

object INavbarHeadingProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null
  ): INavbarHeadingProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    __obj.asInstanceOf[INavbarHeadingProps]
  }
}


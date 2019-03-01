package typings
package atBlueprintjsCoreLib.libEsmComponentsNavbarNavbarDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait INavbarDividerProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]

object INavbarDividerProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null
  ): INavbarDividerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    __obj.asInstanceOf[INavbarDividerProps]
  }
}


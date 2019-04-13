package typings
package atBlueprintjsCoreLib.libEsmComponentsNavbarNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait INavbarProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  /**
    * Whether this navbar should be fixed to the top of the viewport (using CSS `position: fixed`).
    */
  var fixedToTop: js.UndefOr[scala.Boolean] = js.undefined
}

object INavbarProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    fixedToTop: js.UndefOr[scala.Boolean] = js.undefined
  ): INavbarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (!js.isUndefined(fixedToTop)) __obj.updateDynamic("fixedToTop")(fixedToTop)
    __obj.asInstanceOf[INavbarProps]
  }
}


package typings.atBlueprintjsCore.libEsmComponentsNavbarNavbarMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait INavbarProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Whether this navbar should be fixed to the top of the viewport (using CSS `position: fixed`).
    */
  var fixedToTop: js.UndefOr[Boolean] = js.undefined
}

object INavbarProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    IProps: IProps = null,
    fixedToTop: js.UndefOr[Boolean] = js.undefined
  ): INavbarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (!js.isUndefined(fixedToTop)) __obj.updateDynamic("fixedToTop")(fixedToTop)
    __obj.asInstanceOf[INavbarProps]
  }
}


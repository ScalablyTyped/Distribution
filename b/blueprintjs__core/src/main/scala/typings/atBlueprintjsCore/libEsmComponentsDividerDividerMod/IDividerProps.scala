package typings.atBlueprintjsCore.libEsmComponentsDividerDividerMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IDividerProps extends HTMLAttributes[HTMLElement] {
  /**
    * HTML tag to use for element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
}

object IDividerProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    IProps: IProps = null,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any = null
  ): IDividerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IDividerProps]
  }
}


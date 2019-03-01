package typings
package atBlueprintjsCoreLib.libEsmComponentsMenuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IMenuProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLUListElement] {
  /** Whether the menu items in this menu should use a large appearance. */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /** Ref handler that receives the HTML `<ul>` element backing this component. */
  var ulRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLUListElement | scala.Null, _]] = js.undefined
}

object IMenuProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLUListElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    ulRef: js.Function1[/* ref */ reactLib.HTMLUListElement | scala.Null, _] = null
  ): IMenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (ulRef != null) __obj.updateDynamic("ulRef")(ulRef)
    __obj.asInstanceOf[IMenuProps]
  }
}


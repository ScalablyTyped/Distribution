package typings.atBlueprintjsCore.libEsmComponentsMenuMenuMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IMenuProps extends HTMLAttributes[HTMLUListElement] {
  /** Whether the menu items in this menu should use a large appearance. */
  var large: js.UndefOr[Boolean] = js.undefined
  /** Ref handler that receives the HTML `<ul>` element backing this component. */
  var ulRef: js.UndefOr[js.Function1[/* ref */ HTMLUListElement | Null, _]] = js.undefined
}

object IMenuProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLUListElement] = null,
    large: js.UndefOr[Boolean] = js.undefined,
    ulRef: /* ref */ HTMLUListElement | Null => _ = null
  ): IMenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (ulRef != null) __obj.updateDynamic("ulRef")(js.Any.fromFunction1(ulRef))
    __obj.asInstanceOf[IMenuProps]
  }
}


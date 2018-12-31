package typings
package atBlueprintjsCoreLib.libEsmComponentsCollapsibleDashListCollapsibleListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapsibleListProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Which direction the items should collapse from: start or end of the children.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary] = js.undefined
  /**
    * Props to pass to the dropdown.
    */
  var dropdownProps: js.UndefOr[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps] = js.undefined
  /**
    * Element to render as dropdown target with `CLICK` interaction to show collapsed menu.
    */
  var dropdownTarget: reactLib.reactMod.Global.JSXNs.Element
  /**
    * CSS class names to add to `<li>` tags containing each visible item and the dropdown.
    */
  var visibleItemClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Exact number of visible items.
    * @default 3
    */
  var visibleItemCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback invoked to render each visible item. The item will be wrapped in an `li` with
    * the optional `visibleItemClassName` prop.
    */
  def visibleItemRenderer(props: atBlueprintjsCoreLib.libEsmComponentsMenuMenuItemMod.IMenuItemProps, index: scala.Double): reactLib.reactMod.Global.JSXNs.Element
}


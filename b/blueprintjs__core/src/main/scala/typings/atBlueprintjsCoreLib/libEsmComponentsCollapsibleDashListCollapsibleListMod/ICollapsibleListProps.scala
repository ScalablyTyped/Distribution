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

object ICollapsibleListProps {
  @scala.inline
  def apply(
    dropdownTarget: reactLib.reactMod.Global.JSXNs.Element,
    visibleItemRenderer: (atBlueprintjsCoreLib.libEsmComponentsMenuMenuItemMod.IMenuItemProps, scala.Double) => reactLib.reactMod.Global.JSXNs.Element,
    className: java.lang.String = null,
    collapseFrom: atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary = null,
    dropdownProps: atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps = null,
    visibleItemClassName: java.lang.String = null,
    visibleItemCount: scala.Int | scala.Double = null
  ): ICollapsibleListProps = {
    val __obj = js.Dynamic.literal(dropdownTarget = dropdownTarget, visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom)
    if (dropdownProps != null) __obj.updateDynamic("dropdownProps")(dropdownProps)
    if (visibleItemClassName != null) __obj.updateDynamic("visibleItemClassName")(visibleItemClassName)
    if (visibleItemCount != null) __obj.updateDynamic("visibleItemCount")(visibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollapsibleListProps]
  }
}


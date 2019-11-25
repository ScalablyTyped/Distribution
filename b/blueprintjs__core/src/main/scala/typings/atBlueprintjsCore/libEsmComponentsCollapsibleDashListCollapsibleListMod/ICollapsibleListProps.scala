package typings.atBlueprintjsCore.libEsmComponentsCollapsibleDashListCollapsibleListMod

import typings.atBlueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmComponentsMenuMenuItemMod.IMenuItemProps
import typings.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapsibleListProps extends IProps {
  /**
    * Which direction the items should collapse from: start or end of the children.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  /**
    * Props to pass to the dropdown.
    */
  var dropdownProps: js.UndefOr[IPopoverProps] = js.undefined
  /**
    * Element to render as dropdown target with `CLICK` interaction to show collapsed menu.
    */
  var dropdownTarget: Element
  /**
    * CSS class names to add to `<li>` tags containing each visible item and the dropdown.
    */
  var visibleItemClassName: js.UndefOr[String] = js.undefined
  /**
    * Exact number of visible items.
    * @default 3
    */
  var visibleItemCount: js.UndefOr[Double] = js.undefined
  /**
    * Callback invoked to render each visible item. The item will be wrapped in an `li` with
    * the optional `visibleItemClassName` prop.
    */
  def visibleItemRenderer(props: IMenuItemProps, index: Double): Element
}

object ICollapsibleListProps {
  @scala.inline
  def apply(
    dropdownTarget: Element,
    visibleItemRenderer: (IMenuItemProps, Double) => Element,
    className: String = null,
    collapseFrom: Boundary = null,
    dropdownProps: IPopoverProps = null,
    visibleItemClassName: String = null,
    visibleItemCount: Int | Double = null
  ): ICollapsibleListProps = {
    val __obj = js.Dynamic.literal(dropdownTarget = dropdownTarget.asInstanceOf[js.Any], visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (dropdownProps != null) __obj.updateDynamic("dropdownProps")(dropdownProps.asInstanceOf[js.Any])
    if (visibleItemClassName != null) __obj.updateDynamic("visibleItemClassName")(visibleItemClassName.asInstanceOf[js.Any])
    if (visibleItemCount != null) __obj.updateDynamic("visibleItemCount")(visibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollapsibleListProps]
  }
}


package typings.atBlueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbsMod

import typings.atBlueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod.IBreadcrumbProps
import typings.atBlueprintjsCore.libEsmComponentsOverflowDashListOverflowListMod.IOverflowListProps
import typings.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumbsProps extends IProps {
  /**
    * Callback invoked to render visible breadcrumbs. Best practice is to
    * render a `<Breadcrumb>` element. If `currentBreadcrumbRenderer` is also
    * supplied, that callback will be used for the current breadcrumb instead.
    * @default Breadcrumb
    */
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.undefined
  /**
    * Which direction the breadcrumbs should collapse from: start or end.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  /**
    * Callback invoked to render the current breadcrumb, which is the last
    * element in the `items` array.
    *
    * If this prop is omitted, `breadcrumbRenderer` will be invoked for the
    * current breadcrumb instead.
    */
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.undefined
  /**
    * All breadcrumbs to display. Breadcrumbs that do not fit in the container
    * will be rendered in an overflow menu instead.
    */
  var items: js.Array[IBreadcrumbProps]
  /**
    * The minimum number of visible breadcrumbs that should never collapse into
    * the overflow menu, regardless of DOM dimensions.
    * @default 0
    */
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  /**
    * Props to spread to `OverflowList`. Note that `items`,
    * `overflowRenderer`, and `visibleItemRenderer` cannot be changed.
    */
  var overflowListProps: js.UndefOr[Partial[IOverflowListProps[IBreadcrumbProps]]] = js.undefined
  /**
    * Props to spread to the `Popover` showing the overflow menu.
    */
  var popoverProps: js.UndefOr[IPopoverProps] = js.undefined
}

object IBreadcrumbsProps {
  @scala.inline
  def apply(
    items: js.Array[IBreadcrumbProps],
    breadcrumbRenderer: /* props */ IBreadcrumbProps => Element = null,
    className: String = null,
    collapseFrom: Boundary = null,
    currentBreadcrumbRenderer: /* props */ IBreadcrumbProps => Element = null,
    minVisibleItems: Int | Double = null,
    overflowListProps: Partial[IOverflowListProps[IBreadcrumbProps]] = null,
    popoverProps: IPopoverProps = null
  ): IBreadcrumbsProps = {
    val __obj = js.Dynamic.literal(items = items)
    if (breadcrumbRenderer != null) __obj.updateDynamic("breadcrumbRenderer")(js.Any.fromFunction1(breadcrumbRenderer))
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom)
    if (currentBreadcrumbRenderer != null) __obj.updateDynamic("currentBreadcrumbRenderer")(js.Any.fromFunction1(currentBreadcrumbRenderer))
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (overflowListProps != null) __obj.updateDynamic("overflowListProps")(overflowListProps)
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps)
    __obj.asInstanceOf[IBreadcrumbsProps]
  }
}


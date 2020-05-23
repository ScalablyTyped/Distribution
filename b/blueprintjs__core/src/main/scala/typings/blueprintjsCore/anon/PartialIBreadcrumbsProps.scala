package typings.blueprintjsCore.anon

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs.IBreadcrumbsProps> */
trait PartialIBreadcrumbsProps extends js.Object {
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.undefined
  var items: js.UndefOr[js.Array[IBreadcrumbProps]] = js.undefined
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  var overflowListProps: js.UndefOr[PartialIOverflowListProps] = js.undefined
  var popoverProps: js.UndefOr[IPopoverProps] = js.undefined
}

object PartialIBreadcrumbsProps {
  @scala.inline
  def apply(
    breadcrumbRenderer: /* props */ IBreadcrumbProps => Element = null,
    className: String = null,
    collapseFrom: Boundary = null,
    currentBreadcrumbRenderer: /* props */ IBreadcrumbProps => Element = null,
    items: js.Array[IBreadcrumbProps] = null,
    minVisibleItems: js.UndefOr[Double] = js.undefined,
    overflowListProps: PartialIOverflowListProps = null,
    popoverProps: IPopoverProps = null
  ): PartialIBreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (breadcrumbRenderer != null) __obj.updateDynamic("breadcrumbRenderer")(js.Any.fromFunction1(breadcrumbRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (currentBreadcrumbRenderer != null) __obj.updateDynamic("currentBreadcrumbRenderer")(js.Any.fromFunction1(currentBreadcrumbRenderer))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(minVisibleItems)) __obj.updateDynamic("minVisibleItems")(minVisibleItems.get.asInstanceOf[js.Any])
    if (overflowListProps != null) __obj.updateDynamic("overflowListProps")(overflowListProps.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIBreadcrumbsProps]
  }
}


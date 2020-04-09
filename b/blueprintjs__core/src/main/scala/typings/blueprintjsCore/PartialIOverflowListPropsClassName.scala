package typings.blueprintjsCore

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/overflow-list/overflowList.IOverflowListProps<any>> */
trait PartialIOverflowListPropsClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  var observeParents: js.UndefOr[Boolean] = js.undefined
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[_], Unit]] = js.undefined
  var overflowRenderer: js.UndefOr[js.Function1[/* overflowItems */ js.Array[_], ReactNode]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
  var visibleItemRenderer: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, ReactChild]] = js.undefined
}

object PartialIOverflowListPropsClassName {
  @scala.inline
  def apply(
    className: String = null,
    collapseFrom: Boundary = null,
    items: js.Array[_] = null,
    minVisibleItems: Int | Double = null,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    onOverflow: /* overflowItems */ js.Array[_] => Unit = null,
    overflowRenderer: /* overflowItems */ js.Array[_] => ReactNode = null,
    style: CSSProperties = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any = null,
    visibleItemRenderer: (/* item */ js.Any, /* index */ Double) => ReactChild = null
  ): PartialIOverflowListPropsClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.asInstanceOf[js.Any])
    if (onOverflow != null) __obj.updateDynamic("onOverflow")(js.Any.fromFunction1(onOverflow))
    if (overflowRenderer != null) __obj.updateDynamic("overflowRenderer")(js.Any.fromFunction1(overflowRenderer))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (visibleItemRenderer != null) __obj.updateDynamic("visibleItemRenderer")(js.Any.fromFunction2(visibleItemRenderer))
    __obj.asInstanceOf[PartialIOverflowListPropsClassName]
  }
}


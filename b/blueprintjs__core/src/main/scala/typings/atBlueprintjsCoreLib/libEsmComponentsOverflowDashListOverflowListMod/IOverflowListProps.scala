package typings
package atBlueprintjsCoreLib.libEsmComponentsOverflowDashListOverflowListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverflowListProps[T]
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Which direction the items should collapse from: start or end of the
    * children. This also determines whether `overflowRenderer` appears before
    * (`START`) or after (`END`) the visible items.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary] = js.undefined
  /**
    * All items to display in the list. Items that do not fit in the container
    * will be rendered in the overflow instead.
    */
  var items: js.Array[T]
  /**
    * The minimum number of visible items that should never collapse into the
    * overflow menu, regardless of DOM dimensions.
    * @default 0
    */
  var minVisibleItems: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, all parent DOM elements of the container will also be
    * observed. If changes to a parent's size is detected, the overflow will be
    * recalculated.
    *
    * Only enable this prop if the overflow should be recalculated when a
    * parent element resizes in a way that does not also cause the
    * `OverflowList` to resize.
    * @default false
    */
  var observeParents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback invoked when the overflowed items change. This is called once
    * after the DOM has settled, rather that on every intermediate change. It
    * is not invoked if resizing produces an unchanged overflow state.
    */
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[T], scala.Unit]] = js.undefined
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * HTML tag name for the container element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any
  ] = js.undefined
  /**
    * Callback invoked to render the overflowed items. Unlike
    * `visibleItemRenderer`, this prop is invoked once with all items that do
    * not fit in the container.
    *
    * Typical use cases for this prop will put overflowed items in a dropdown
    * menu or display a "+X items" label.
    */
  def overflowRenderer(overflowItems: js.Array[T]): reactLib.reactMod.ReactNs.ReactNode
  /**
    * Callback invoked to render each visible item.
    * Remember to set a `key` on the rendered element!
    */
  def visibleItemRenderer(item: T, index: scala.Double): reactLib.reactMod.ReactNs.ReactChild
}

object IOverflowListProps {
  @scala.inline
  def apply[T](
    items: js.Array[T],
    overflowRenderer: js.Function1[js.Array[T], reactLib.reactMod.ReactNs.ReactNode],
    visibleItemRenderer: js.Function2[T, scala.Double, reactLib.reactMod.ReactNs.ReactChild],
    className: java.lang.String = null,
    collapseFrom: atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary = null,
    minVisibleItems: scala.Int | scala.Double = null,
    observeParents: js.UndefOr[scala.Boolean] = js.undefined,
    onOverflow: js.Function1[/* overflowItems */ js.Array[T], scala.Unit] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null
  ): IOverflowListProps[T] = {
    val __obj = js.Dynamic.literal(items = items, overflowRenderer = overflowRenderer, visibleItemRenderer = visibleItemRenderer)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom)
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents)
    if (onOverflow != null) __obj.updateDynamic("onOverflow")(onOverflow)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IOverflowListProps[T]]
  }
}


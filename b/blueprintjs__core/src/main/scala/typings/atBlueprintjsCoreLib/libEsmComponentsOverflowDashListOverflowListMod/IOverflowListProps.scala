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
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 170 */ java.lang.String
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


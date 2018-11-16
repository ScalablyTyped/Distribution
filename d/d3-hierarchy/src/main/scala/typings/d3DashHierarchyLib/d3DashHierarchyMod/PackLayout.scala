package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackLayout[Datum] extends js.Object {
  /**
       * Lays out the specified root hierarchy.
       * You must call `root.sum` before passing the hierarchy to the pack layout.
       * You probably also want to call `root.sort` to order the hierarchy before computing the layout.
       *
       * @param root The specified root hierarchy.
       */
  def apply(root: HierarchyNode[Datum]): HierarchyCircularNode[Datum] = js.native
  /**
       * Returns the current padding accessor, which defaults to the constant zero.
       */
  def padding(): js.Function1[/* node */ HierarchyCircularNode[Datum], scala.Double] = js.native
  /**
       * Sets this pack layout’s padding accessor to the specified function and returns this pack layout.
       * Returns the current padding accessor, which defaults to the constant zero.
       *
       * When siblings are packed, tangent siblings will be separated by approximately the specified padding;
       * the enclosing parent circle will also be separated from its children by approximately the specified padding.
       * If an explicit radius is not specified, the padding is approximate because a two-pass algorithm
       * is needed to fit within the layout size: the circles are first packed without padding;
       * a scaling factor is computed and applied to the specified padding; and lastly the circles are re-packed with padding.
       *
       * @param padding The specified padding function.
       */
  def padding(padding: js.Function1[/* node */ HierarchyCircularNode[Datum], scala.Double]): this.type = js.native
  /**
       * Sets this pack layout’s padding accessor to the specified number and returns this pack layout.
       * Returns the current padding accessor, which defaults to the constant zero.
       *
       * When siblings are packed, tangent siblings will be separated by approximately the specified padding;
       * the enclosing parent circle will also be separated from its children by approximately the specified padding.
       * If an explicit radius is not specified, the padding is approximate because a two-pass algorithm
       * is needed to fit within the layout size: the circles are first packed without padding;
       * a scaling factor is computed and applied to the specified padding; and lastly the circles are re-packed with padding.
       *
       * @param padding The specified padding value.
       */
  def padding(padding: scala.Double): this.type = js.native
  /**
       * Returns the current radius accessor, which defaults to null.
       */
  def radius(): scala.Null | (js.Function1[/* node */ HierarchyCircularNode[Datum], scala.Double]) = js.native
  /**
       * Sets the pack layout’s radius accessor to the specified function and returns this pack layout.
       * If the radius accessor is null, the radius of each leaf circle is derived from the leaf `node.value` (computed by `node.sum`);
       * the radii are then scaled proportionally to fit the layout size.
       * If the radius accessor is not null, the radius of each leaf circle is specified exactly by the function.
       *
       * @param radius The specified radius accessor.
       */
  def radius(radius: js.Function1[/* node */ HierarchyCircularNode[Datum], scala.Double]): this.type = js.native
  /**
       * Sets the pack layout’s radius accessor to the specified function and returns this pack layout.
       * If the radius accessor is null, the radius of each leaf circle is derived from the leaf `node.value` (computed by `node.sum`);
       * the radii are then scaled proportionally to fit the layout size.
       * If the radius accessor is not null, the radius of each leaf circle is specified exactly by the function.
       *
       * @param radius The specified radius accessor.
       */
  @JSName("radius")
  def `radius_<this>`(): this.type = js.native
  /**
       * Returns the current size, which defaults to [1, 1].
       */
  def size(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Sets this pack layout’s size to the specified [width, height] array and returns this pack layout.
       *
       * @param size The specified two-element size array.
       */
  def size(size: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
}


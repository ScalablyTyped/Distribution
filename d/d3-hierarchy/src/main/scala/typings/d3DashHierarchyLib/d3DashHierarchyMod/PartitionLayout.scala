package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionLayout[Datum] extends js.Object {
  /**
    * Lays out the specified root hierarchy.
    * You must call `root.sum` before passing the hierarchy to the partition layout.
    * You probably also want to call `root.sort` to order the hierarchy before computing the layout.
    *
    * @param root The specified root hierarchy.
    */
  def apply(root: HierarchyNode[Datum]): HierarchyRectangularNode[Datum] = js.native
  /**
    * Returns the current padding, which defaults to zero.
    */
  def padding(): scala.Double = js.native
  /**
    * Sets the padding to the specified number and returns this partition layout.
    * The padding is used to separate a node’s adjacent children.
    *
    * @param padding The specified padding value.
    */
  def padding(padding: scala.Double): this.type = js.native
  /**
    * Returns the current rounding state, which defaults to false.
    */
  def round(): scala.Boolean = js.native
  /**
    * Enables or disables rounding according to the given boolean and returns this partition layout.
    *
    * @param round The specified boolean flag.
    */
  def round(round: scala.Boolean): this.type = js.native
  /**
    * Returns the current size, which defaults to [1, 1].
    */
  def size(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
    * Sets this partition layout’s size to the specified [width, height] array and returns this partition layout.
    *
    * @param size The specified two-element size array.
    */
  def size(size: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
}


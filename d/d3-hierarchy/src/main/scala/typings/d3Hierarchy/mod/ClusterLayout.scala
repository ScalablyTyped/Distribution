package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLayout[Datum] extends js.Object {
  /**
    * Lays out the specified root hierarchy.
    * You may want to call `root.sort` before passing the hierarchy to the cluster layout.
    *
    * @param root The specified root hierarchy.
    */
  def apply(root: HierarchyNode[Datum]): HierarchyPointNode[Datum] = js.native
  /**
    * Returns the current node size, which defaults to null. A node size of null indicates that a layout size will be used instead.
    */
  def nodeSize(): (js.Tuple2[Double, Double]) | Null = js.native
  /**
    * Sets this cluster layout’s node size to the specified [width, height] array and returns this cluster layout.
    * When a node size is specified, the root node is always positioned at <0, 0>.
    *
    * @param size The specified two-element size array.
    */
  def nodeSize(size: js.Tuple2[Double, Double]): this.type = js.native
  /**
    * Returns the current separation accessor, which defaults to: `(a, b) => a.parent == b.parent ? 1 : 2`.
    */
  def separation(): js.Function2[/* a */ HierarchyPointNode[Datum], /* b */ HierarchyPointNode[Datum], Double] = js.native
  /**
    * Sets the separation accessor to the specified function and returns this cluster layout.
    * The separation accessor is used to separate neighboring leaves.
    *
    * @param separation The separation function is passed two leaves a and b, and must return the desired separation.
    * The nodes are typically siblings, though the nodes may be more distantly related if the layout decides to place such nodes adjacent.
    */
  def separation(
    separation: js.Function2[/* a */ HierarchyPointNode[Datum], /* b */ HierarchyPointNode[Datum], Double]
  ): this.type = js.native
  /**
    * Returns the current layout size, which defaults to [1, 1]. A layout size of null indicates that a node size will be used instead.
    */
  def size(): (js.Tuple2[Double, Double]) | Null = js.native
  /**
    * Sets this cluster layout’s size to the specified [width, height] array and returns the cluster layout.
    * The size represent an arbitrary coordinate system; for example, to produce a radial layout,
    * a size of [360, radius] corresponds to a breadth of 360° and a depth of radius.
    *
    * @param size The specified two-element size array.
    */
  def size(size: js.Tuple2[Double, Double]): this.type = js.native
}


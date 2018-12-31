package typings
package d3DashQuadtreeLib.d3DashQuadtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadtreeLeaf[T] extends js.Object {
  /**
    * The data associated with this point, as passed to quadtree.add.
    */
  var data: T
  /**
    * The length property may be used to distinguish leaf nodes from internal nodes: it is undefined for leaf nodes, and 4 for internal nodes.
    */
  var length: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * The next datum in this leaf, if any.
    */
  var next: js.UndefOr[QuadtreeLeaf[T]] = js.undefined
}


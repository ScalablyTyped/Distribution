package typings
package d3DashQuadtreeLib.d3DashQuadtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadtreeInternalNode[T]
  extends stdLib.Array[js.UndefOr[QuadtreeInternalNode[T] | QuadtreeLeaf[T]]] {
  /**
       * The length property may be used to distinguish leaf nodes from internal nodes: it is undefined for leaf nodes, and 4 for internal nodes.
       */
  @JSName("length")
  var length_QuadtreeInternalNode: d3DashQuadtreeLib.d3DashQuadtreeLibNumbers.`4` = js.native
}


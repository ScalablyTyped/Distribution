package typings.d3Quadtree.mod

import typings.d3Quadtree.d3QuadtreeNumbers.`4`
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuadtreeInternalNode[T]
  extends Array[js.UndefOr[QuadtreeInternalNode[T] | QuadtreeLeaf[T]]] {
  
  /**
    * The length property may be used to distinguish leaf nodes from internal nodes: it is undefined for leaf nodes, and 4 for internal nodes.
    */
  @JSName("length")
  var length_QuadtreeInternalNode: `4` = js.native
}

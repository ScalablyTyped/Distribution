package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains an array of blocks representing the octree
  */
trait IOctreeContainer[T] extends js.Object {
  /**
    * Blocks within the octree
    */
  var blocks: js.Array[OctreeBlock[T]]
}

object IOctreeContainer {
  @scala.inline
  def apply[T](blocks: js.Array[OctreeBlock[T]]): IOctreeContainer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blocks")(blocks)
    __obj.asInstanceOf[IOctreeContainer[T]]
  }
}


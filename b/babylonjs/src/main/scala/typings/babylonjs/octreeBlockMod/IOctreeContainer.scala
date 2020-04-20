package typings.babylonjs.octreeBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOctreeContainer[T] extends js.Object {
  /**
    * Blocks within the octree
    */
  var blocks: js.Array[OctreeBlock[T]]
}

object IOctreeContainer {
  @scala.inline
  def apply[T](blocks: js.Array[OctreeBlock[T]]): IOctreeContainer[T] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOctreeContainer[T]]
  }
}


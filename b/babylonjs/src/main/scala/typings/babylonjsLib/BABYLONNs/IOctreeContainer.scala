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


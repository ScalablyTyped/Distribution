package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to store a cell in an octree
     * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
     */
@JSImport("babylonjs", "OctreeBlock")
@js.native
class OctreeBlock[T] protected ()
  extends babylonjsLib.BABYLONNs.OctreeBlock[T] {
  /**
           * Creates a new block
           * @param minPoint defines the minimum vector (in world space) of the block's bounding box
           * @param maxPoint defines the maximum vector (in world space) of the block's bounding box
           * @param capacity defines the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
           * @param depth defines the current depth of this block in the octree
           * @param maxDepth defines the maximal depth allowed (beyond this value, the capacity is ignored)
           * @param creationFunc defines a callback to call when an element is added to the block
           */
  def this(minPoint: babylonjsLib.BABYLONNs.Vector3, maxPoint: babylonjsLib.BABYLONNs.Vector3, capacity: scala.Double, depth: scala.Double, maxDepth: scala.Double, creationFunc: js.Function2[/* entry */ T, /* block */ babylonjsLib.BABYLONNs.OctreeBlock[T], scala.Unit]) = this()
}


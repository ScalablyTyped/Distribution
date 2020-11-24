package typings.babylonjs.cullingIndexMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.octreeBlockMod.IOctreeContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Culling/index", "OctreeBlock")
@js.native
class OctreeBlock[T] protected ()
  extends typings.babylonjs.octreesIndexMod.OctreeBlock[T] {
  /**
    * Creates a new block
    * @param minPoint defines the minimum vector (in world space) of the block's bounding box
    * @param maxPoint defines the maximum vector (in world space) of the block's bounding box
    * @param capacity defines the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
    * @param depth defines the current depth of this block in the octree
    * @param maxDepth defines the maximal depth allowed (beyond this value, the capacity is ignored)
    * @param creationFunc defines a callback to call when an element is added to the block
    */
  def this(
    minPoint: Vector3,
    maxPoint: Vector3,
    capacity: Double,
    depth: Double,
    maxDepth: Double,
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Culling/index", "OctreeBlock")
@js.native
object OctreeBlock extends js.Object {
  
  /**
    * @hidden
    */
  def _CreateBlocks[T](
    worldMin: Vector3,
    worldMax: Vector3,
    entries: js.Array[T],
    maxBlockCapacity: Double,
    currentDepth: Double,
    maxDepth: Double,
    target: IOctreeContainer[T],
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]
  ): Unit = js.native
}

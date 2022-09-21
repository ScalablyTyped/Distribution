package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IOctreeContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.OctreeBlock")
@js.native
open class OctreeBlock[T] protected ()
  extends StObject
     with typings.babylonjs.BABYLON.OctreeBlock[T] {
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
    minPoint: typings.babylonjs.BABYLON.Vector3,
    maxPoint: typings.babylonjs.BABYLON.Vector3,
    capacity: Double,
    depth: Double,
    maxDepth: Double,
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.BABYLON.OctreeBlock[T], Unit]
  ) = this()
}
/* static members */
object OctreeBlock {
  
  @JSGlobal("BABYLON.OctreeBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param worldMin
    * @param worldMax
    * @param entries
    * @param maxBlockCapacity
    * @param currentDepth
    * @param maxDepth
    * @param target
    * @param creationFunc
    * @hidden
    */
  inline def _CreateBlocks[T](
    worldMin: typings.babylonjs.BABYLON.Vector3,
    worldMax: typings.babylonjs.BABYLON.Vector3,
    entries: js.Array[T],
    maxBlockCapacity: Double,
    currentDepth: Double,
    maxDepth: Double,
    target: IOctreeContainer[T],
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.BABYLON.OctreeBlock[T], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateBlocks")(worldMin.asInstanceOf[js.Any], worldMax.asInstanceOf[js.Any], entries.asInstanceOf[js.Any], maxBlockCapacity.asInstanceOf[js.Any], currentDepth.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any], target.asInstanceOf[js.Any], creationFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

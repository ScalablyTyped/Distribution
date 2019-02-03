package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Octrees are a really powerful data structure that can quickly select entities based on space coordinates.
  * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
  */
@JSImport("babylonjs", "Octree")
@js.native
class Octree[T] protected ()
  extends babylonjsLib.BABYLONNs.Octree[T] {
  /**
    * Creates a octree
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
    * @param creationFunc function to be used to instatiate the octree
    * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
    * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
    */
  def this(creationFunc: js.Function2[/* entry */ T, /* block */ babylonjsLib.BABYLONNs.OctreeBlock[T], scala.Unit]) = this()
  def this(creationFunc: js.Function2[/* entry */ T, /* block */ babylonjsLib.BABYLONNs.OctreeBlock[T], scala.Unit], maxBlockCapacity: scala.Double) = this()
  def this(creationFunc: js.Function2[/* entry */ T, /* block */ babylonjsLib.BABYLONNs.OctreeBlock[T], scala.Unit], maxBlockCapacity: scala.Double, /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: scala.Double) = this()
}

/* static members */
@JSImport("babylonjs", "Octree")
@js.native
object Octree extends js.Object {
  /**
    * Adds a mesh into the octree block if it intersects the block
    */
  def CreationFuncForMeshes(
    entry: babylonjsLib.BABYLONNs.AbstractMesh,
    block: babylonjsLib.BABYLONNs.OctreeBlock[babylonjsLib.BABYLONNs.AbstractMesh]
  ): scala.Unit = js.native
  /**
    * Adds a submesh into the octree block if it intersects the block
    */
  def CreationFuncForSubMeshes(
    entry: babylonjsLib.BABYLONNs.SubMesh,
    block: babylonjsLib.BABYLONNs.OctreeBlock[babylonjsLib.BABYLONNs.SubMesh]
  ): scala.Unit = js.native
  /**
    * @hidden
    */
  def _CreateBlocks[T](
    worldMin: babylonjsLib.BABYLONNs.Vector3,
    worldMax: babylonjsLib.BABYLONNs.Vector3,
    entries: js.Array[T],
    maxBlockCapacity: scala.Double,
    currentDepth: scala.Double,
    maxDepth: scala.Double,
    target: babylonjsLib.BABYLONNs.IOctreeContainer[T],
    creationFunc: js.Function2[/* entry */ T, /* block */ babylonjsLib.BABYLONNs.OctreeBlock[T], scala.Unit]
  ): scala.Unit = js.native
}


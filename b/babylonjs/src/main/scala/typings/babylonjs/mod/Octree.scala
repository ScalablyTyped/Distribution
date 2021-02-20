package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Octree")
@js.native
class Octree[T] protected ()
  extends typings.babylonjs.legacyMod.Octree[T] {
  /**
    * Creates a octree
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
    * @param creationFunc function to be used to instatiate the octree
    * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
    * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
    */
  def this(creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
    maxBlockCapacity: Double
  ) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
    maxBlockCapacity: js.UndefOr[scala.Nothing],
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
    maxBlockCapacity: Double,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
}
/* static members */
object Octree {
  
  /**
    * Adds a mesh into the octree block if it intersects the block
    */
  @JSImport("babylonjs", "Octree.CreationFuncForMeshes")
  @js.native
  def CreationFuncForMeshes(
    entry: typings.babylonjs.abstractMeshMod.AbstractMesh,
    block: typings.babylonjs.octreeBlockMod.OctreeBlock[typings.babylonjs.abstractMeshMod.AbstractMesh]
  ): Unit = js.native
  
  /**
    * Adds a submesh into the octree block if it intersects the block
    */
  @JSImport("babylonjs", "Octree.CreationFuncForSubMeshes")
  @js.native
  def CreationFuncForSubMeshes(
    entry: typings.babylonjs.subMeshMod.SubMesh,
    block: typings.babylonjs.octreeBlockMod.OctreeBlock[typings.babylonjs.subMeshMod.SubMesh]
  ): Unit = js.native
}

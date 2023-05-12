package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Octree")
@js.native
open class Octree[T] protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Octree[T] {
  /**
    * Creates a octree
    * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimizeOctrees
    * @param creationFunc function to be used to instantiate the octree
    * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
    * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
    */
  def this(creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.BABYLON.OctreeBlock[T], Unit]) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.BABYLON.OctreeBlock[T], Unit],
    maxBlockCapacity: Double
  ) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.BABYLON.OctreeBlock[T], Unit],
    maxBlockCapacity: Double,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.BABYLON.OctreeBlock[T], Unit],
    maxBlockCapacity: Unit,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
}
/* static members */
object Octree {
  
  @JSGlobal("BABYLON.Octree")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a mesh into the octree block if it intersects the block
    * @param entry
    * @param block
    */
  inline def CreationFuncForMeshes(
    entry: typings.babylonjs.BABYLON.AbstractMesh,
    block: typings.babylonjs.BABYLON.OctreeBlock[typings.babylonjs.BABYLON.AbstractMesh]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds a submesh into the octree block if it intersects the block
    * @param entry
    * @param block
    */
  inline def CreationFuncForSubMeshes(
    entry: typings.babylonjs.BABYLON.SubMesh,
    block: typings.babylonjs.BABYLON.OctreeBlock[typings.babylonjs.BABYLON.SubMesh]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForSubMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

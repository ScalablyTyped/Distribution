package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Octree")
@js.native
open class Octree[T] protected ()
  extends typings.babylonjs.legacyLegacyMod.Octree[T] {
  /**
    * Creates a octree
    * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimizeOctrees
    * @param creationFunc function to be used to instantiate the octree
    * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
    * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
    */
  def this(creationFunc: js.Function2[
        /* entry */ T, 
        /* block */ typings.babylonjs.cullingOctreesOctreeBlockMod.OctreeBlock[T], 
        Unit
      ]) = this()
  def this(
    creationFunc: js.Function2[
        /* entry */ T, 
        /* block */ typings.babylonjs.cullingOctreesOctreeBlockMod.OctreeBlock[T], 
        Unit
      ],
    maxBlockCapacity: Double
  ) = this()
  def this(
    creationFunc: js.Function2[
        /* entry */ T, 
        /* block */ typings.babylonjs.cullingOctreesOctreeBlockMod.OctreeBlock[T], 
        Unit
      ],
    maxBlockCapacity: Double,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
  def this(
    creationFunc: js.Function2[
        /* entry */ T, 
        /* block */ typings.babylonjs.cullingOctreesOctreeBlockMod.OctreeBlock[T], 
        Unit
      ],
    maxBlockCapacity: Unit,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
}
/* static members */
object Octree {
  
  @JSImport("babylonjs", "Octree")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a mesh into the octree block if it intersects the block
    * @param entry
    * @param block
    */
  inline def CreationFuncForMeshes(
    entry: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    block: typings.babylonjs.cullingOctreesOctreeBlockMod.OctreeBlock[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds a submesh into the octree block if it intersects the block
    * @param entry
    * @param block
    */
  inline def CreationFuncForSubMeshes(
    entry: typings.babylonjs.meshesSubMeshMod.SubMesh,
    block: typings.babylonjs.cullingOctreesOctreeBlockMod.OctreeBlock[typings.babylonjs.meshesSubMeshMod.SubMesh]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForSubMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

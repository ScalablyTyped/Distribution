package typings.babylonjs.cullingIndexMod

import typings.babylonjs.subMeshMod.SubMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Culling/index", "babylonjs/Meshes/abstractMesh")
@js.native
object babylonjsMeshesAbstractMeshAugmentingMod extends js.Object {
  
  @js.native
  trait AbstractMesh extends js.Object {
    
    /**
      * @hidden
      * Backing Field
      */
    var _submeshesOctree: typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
    
    /**
      * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
      * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
      * @param maxCapacity defines the maximum size of each block (64 by default)
      * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
      * @returns the new octree
      * @see https://www.babylonjs-playground.com/#NA4OQ#12
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      */
    def createOrUpdateSubmeshesOctree(): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
    def createOrUpdateSubmeshesOctree(maxCapacity: js.UndefOr[scala.Nothing], maxDepth: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
    def createOrUpdateSubmeshesOctree(maxCapacity: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
    def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
  }
}

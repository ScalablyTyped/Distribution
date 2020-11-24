package typings.babylonjs.octreeSceneComponentMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.octreeMod.Octree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/scene", JSImport.Namespace)
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  
  @js.native
  trait Scene extends js.Object {
    
    /**
      * @hidden
      * Backing Filed
      */
    var _selectionOctree: Octree[AbstractMesh] = js.native
    
    /**
      * Creates or updates the octree used to boost selection (picking)
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      * @param maxCapacity defines the maximum capacity per leaf
      * @param maxDepth defines the maximum depth of the octree
      * @returns an octree of AbstractMesh
      */
    def createOrUpdateSelectionOctree(): Octree[AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: js.UndefOr[scala.Nothing], maxDepth: Double): Octree[AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double): Octree[AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): Octree[AbstractMesh] = js.native
    
    /**
      * Gets the octree used to boost mesh selection (picking)
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      */
    var selectionOctree: Octree[AbstractMesh] = js.native
  }
}

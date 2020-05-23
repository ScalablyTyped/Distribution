package typings.babylonjs.octreesIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Culling/Octrees/index", "babylonjs/scene")
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  @js.native
  trait Scene extends js.Object {
    /**
      * @hidden
      * Backing Filed
      */
    var _selectionOctree: typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
    /**
      * Gets the octree used to boost mesh selection (picking)
      * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      */
    var selectionOctree: typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
    /**
      * Creates or updates the octree used to boost selection (picking)
      * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      * @param maxCapacity defines the maximum capacity per leaf
      * @param maxDepth defines the maximum depth of the octree
      * @returns an octree of AbstractMesh
      */
    def createOrUpdateSelectionOctree(): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
  }
  
}


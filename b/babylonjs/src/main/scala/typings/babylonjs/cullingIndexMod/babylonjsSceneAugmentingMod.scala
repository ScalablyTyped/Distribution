package typings.babylonjs.cullingIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.rayMod.TrianglePickingPredicate
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Culling/index", "babylonjs/scene")
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  @js.native
  trait Scene extends js.Object {
    /** @hidden */
    var _cachedRayForTransform: typings.babylonjs.rayMod.Ray = js.native
    /** @hidden */
    var _pickWithRayInverseMatrix: Matrix = js.native
    /**
      * @hidden
      * Backing Filed
      */
    var _selectionOctree: typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
    /** @hidden */
    var _tempPickingRay: Nullable[typings.babylonjs.rayMod.Ray] = js.native
    /**
      * Gets the octree used to boost mesh selection (picking)
      * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      */
    var selectionOctree: typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
    /** @hidden */
    def _internalMultiPick(rayFunction: js.Function1[/* world */ Matrix, typings.babylonjs.rayMod.Ray]): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function1[/* world */ Matrix, typings.babylonjs.rayMod.Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
    ): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function1[/* world */ Matrix, typings.babylonjs.rayMod.Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[PickingInfo]] = js.native
    /** @hidden */
    def _internalPick(rayFunction: js.Function1[/* world */ Matrix, typings.babylonjs.rayMod.Ray]): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, typings.babylonjs.rayMod.Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, typings.babylonjs.rayMod.Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, typings.babylonjs.rayMod.Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
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


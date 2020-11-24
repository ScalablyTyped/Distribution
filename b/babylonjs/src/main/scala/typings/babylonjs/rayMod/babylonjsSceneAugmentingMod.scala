package typings.babylonjs.rayMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/scene", JSImport.Namespace)
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  
  @js.native
  trait Scene extends js.Object {
    
    /** @hidden */
    var _cachedRayForTransform: Ray = js.native
    
    /** @hidden */
    def _internalMultiPick(rayFunction: js.Function1[/* world */ Matrix, Ray]): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
    ): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[PickingInfo]] = js.native
    
    /** @hidden */
    def _internalPick(rayFunction: js.Function1[/* world */ Matrix, Ray]): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    
    /** @hidden */
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: js.UndefOr[scala.Nothing],
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: js.UndefOr[scala.Nothing],
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: js.UndefOr[scala.Nothing],
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: js.UndefOr[scala.Nothing],
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function1[/* world */ Matrix, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    
    /** @hidden */
    var _pickWithRayInverseMatrix: Matrix = js.native
    
    /** @hidden */
    var _tempPickingRay: Nullable[Ray] = js.native
  }
}

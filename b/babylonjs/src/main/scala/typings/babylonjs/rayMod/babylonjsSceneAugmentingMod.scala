package typings.babylonjs.rayMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/scene", JSImport.Namespace)
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  @js.native
  trait Scene extends js.Object {
    /** @hidden */
    var _cachedRayForTransform: Ray = js.native
    /** @hidden */
    var _pickWithRayInverseMatrix: Matrix = js.native
    /** @hidden */
    var _tempPickingRay: Nullable[Ray] = js.native
    /** @hidden */
    def _internalMultiPick(rayFunction: js.Function1[/* world */ Matrix, Ray]): Nullable[js.Array[PickingInfo]] = js.native
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
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
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
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
  }
  
}


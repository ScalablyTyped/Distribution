package typings.babylonjs.mod

import typings.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Frustum")
@js.native
class Frustum ()
  extends typings.babylonjs.legacyMod.Frustum
/* static members */
@JSImport("babylonjs", "Frustum")
@js.native
object Frustum extends js.Object {
  
  /**
    * Gets the bottom frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetBottomPlaneToRef(
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typings.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the far frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetFarPlaneToRef(
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typings.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the left frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetLeftPlaneToRef(
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typings.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the near frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetNearPlaneToRef(
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typings.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the planes representing the frustum
    * @param transform matrix to be applied to the returned planes
    * @returns a new array of 6 Frustum planes computed by the given transformation matrix.
    */
  def GetPlanes(transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]): js.Array[typings.babylonjs.mathPlaneMod.Plane] = js.native
  
  /**
    * Sets the given array "frustumPlanes" with the 6 Frustum planes computed by the given transformation matrix.
    * @param transform transformation matrix to be applied to the resulting frustum planes
    * @param frustumPlanes the resuling frustum planes
    */
  def GetPlanesToRef(
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    frustumPlanes: js.Array[typings.babylonjs.mathPlaneMod.Plane]
  ): Unit = js.native
  
  /**
    * Gets the right frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetRightPlaneToRef(
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typings.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the top frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetTopPlaneToRef(
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typings.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
}

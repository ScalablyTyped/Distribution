package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Reprasents a camera frustum
     */
@JSGlobal("BABYLON.Frustum")
@js.native
class Frustum () extends js.Object

/**
     * Reprasents a camera frustum
     */
@JSGlobal("BABYLON.Frustum")
@js.native
object Frustum extends js.Object {
  /**
           * Gets the bottom frustum plane transformed by the transform matrix
           * @param transform transformation matrix to be applied to the resulting frustum plane
           * @param frustumPlane the resuling frustum plane
           */
  def GetBottomPlaneToRef(transform: babylonjsLib.BABYLONNs.Matrix, frustumPlane: babylonjsLib.BABYLONNs.Plane): scala.Unit = js.native
  /**
           * Gets the far frustum plane transformed by the transform matrix
           * @param transform transformation matrix to be applied to the resulting frustum plane
           * @param frustumPlane the resuling frustum plane
           */
  def GetFarPlaneToRef(transform: babylonjsLib.BABYLONNs.Matrix, frustumPlane: babylonjsLib.BABYLONNs.Plane): scala.Unit = js.native
  /**
           * Gets the left frustum plane transformed by the transform matrix
           * @param transform transformation matrix to be applied to the resulting frustum plane
           * @param frustumPlane the resuling frustum plane
           */
  def GetLeftPlaneToRef(transform: babylonjsLib.BABYLONNs.Matrix, frustumPlane: babylonjsLib.BABYLONNs.Plane): scala.Unit = js.native
  /**
           * Gets the near frustum plane transformed by the transform matrix
           * @param transform transformation matrix to be applied to the resulting frustum plane
           * @param frustumPlane the resuling frustum plane
           */
  def GetNearPlaneToRef(transform: babylonjsLib.BABYLONNs.Matrix, frustumPlane: babylonjsLib.BABYLONNs.Plane): scala.Unit = js.native
  /**
           * Gets the planes representing the frustum
           * @param transform matrix to be applied to the returned planes
           * @returns a new array of 6 Frustum planes computed by the given transformation matrix.
           */
  def GetPlanes(transform: babylonjsLib.BABYLONNs.Matrix): js.Array[babylonjsLib.BABYLONNs.Plane] = js.native
  /**
           * Sets the given array "frustumPlanes" with the 6 Frustum planes computed by the given transformation matrix.
           * @param transform transformation matrix to be applied to the resulting frustum planes
           * @param frustumPlanes the resuling frustum planes
           */
  def GetPlanesToRef(transform: babylonjsLib.BABYLONNs.Matrix, frustumPlanes: js.Array[babylonjsLib.BABYLONNs.Plane]): scala.Unit = js.native
  /**
           * Gets the right frustum plane transformed by the transform matrix
           * @param transform transformation matrix to be applied to the resulting frustum plane
           * @param frustumPlane the resuling frustum plane
           */
  def GetRightPlaneToRef(transform: babylonjsLib.BABYLONNs.Matrix, frustumPlane: babylonjsLib.BABYLONNs.Plane): scala.Unit = js.native
  /**
           * Gets the top frustum plane transformed by the transform matrix
           * @param transform transformation matrix to be applied to the resulting frustum plane
           * @param frustumPlane the resuling frustum plane
           */
  def GetTopPlaneToRef(transform: babylonjsLib.BABYLONNs.Matrix, frustumPlane: babylonjsLib.BABYLONNs.Plane): scala.Unit = js.native
}


package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to store bounding box information
     */
@JSImport("babylonjs", "BoundingBox")
@js.native
class BoundingBox protected ()
  extends babylonjsLib.BABYLONNs.BoundingBox {
  /**
           * Creates a new bounding box
           * @param min defines the minimum vector (in local space)
           * @param max defines the maximum vector (in local space)
           */
  def this(min: babylonjsLib.BABYLONNs.Vector3, max: babylonjsLib.BABYLONNs.Vector3) = this()
}

/**
     * Class used to store bounding box information
     */
@JSImport("babylonjs", "BoundingBox")
@js.native
object BoundingBox extends js.Object {
  /**
           * Tests if two bounding boxes are intersections
           * @param box0 defines the first box to test
           * @param box1 defines the second box to test
           * @returns true if there is an intersection
           */
  def Intersects(box0: babylonjsLib.BABYLONNs.BoundingBox, box1: babylonjsLib.BABYLONNs.BoundingBox): scala.Boolean = js.native
  /**
           * Tests if a bounding box defines by a min/max vectors intersects a sphere
           * @param minPoint defines the minimum vector of the bounding box
           * @param maxPoint defines the maximum vector of the bounding box
           * @param sphereCenter defines the sphere center
           * @param sphereRadius defines the sphere radius
           * @returns true if there is an intersection
           */
  def IntersectsSphere(
    minPoint: babylonjsLib.BABYLONNs.Vector3,
    maxPoint: babylonjsLib.BABYLONNs.Vector3,
    sphereCenter: babylonjsLib.BABYLONNs.Vector3,
    sphereRadius: scala.Double
  ): scala.Boolean = js.native
  /**
           * Tests if a bounding box defined with 8 vectors is entirely inside frustum planes
           * @param boundingVectors defines an array of 8 vectors representing a bounding box
           * @param frustumPlanes defines the frustum planes to test
           * @return true if there is an inclusion
           */
  def IsCompletelyInFrustum(
    boundingVectors: js.Array[babylonjsLib.BABYLONNs.Vector3],
    frustumPlanes: js.Array[babylonjsLib.BABYLONNs.Plane]
  ): scala.Boolean = js.native
  /**
           * Tests if a bounding box defined with 8 vectors intersects frustum planes
           * @param boundingVectors defines an array of 8 vectors representing a bounding box
           * @param frustumPlanes defines the frustum planes to test
           * @return true if there is an intersection
           */
  def IsInFrustum(
    boundingVectors: js.Array[babylonjsLib.BABYLONNs.Vector3],
    frustumPlanes: js.Array[babylonjsLib.BABYLONNs.Plane]
  ): scala.Boolean = js.native
}


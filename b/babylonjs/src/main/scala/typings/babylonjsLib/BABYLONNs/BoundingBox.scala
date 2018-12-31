package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store bounding box information
  */
@JSGlobal("BABYLON.BoundingBox")
@js.native
class BoundingBox protected () extends ICullable {
  /**
    * Creates a new bounding box
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    */
  def this(min: Vector3, max: Vector3) = this()
  /**
    * @hidden
    */
  var _tag: scala.Double = js.native
  var _worldMatrix: js.Any = js.native
  /**
    * Gets the center of the bounding box in local space
    */
  var center: Vector3 = js.native
  /**
    * Gets the center of the bounding box in world space
    */
  var centerWorld: Vector3 = js.native
  /**
    * Gets the OBB (object bounding box) directions
    */
  var directions: js.Array[Vector3] = js.native
  /**
    * Gets the extend size in local space
    */
  var extendSize: Vector3 = js.native
  /**
    * Gets the extend size in world space
    */
  var extendSizeWorld: Vector3 = js.native
  /**
    * Gets the maximum vector in local space
    */
  var maximum: Vector3 = js.native
  /**
    * Gets the maximum vector in world space
    */
  var maximumWorld: Vector3 = js.native
  /**
    * Gets the minimum vector in local space
    */
  var minimum: Vector3 = js.native
  /**
    * Gets the minimum vector in world space
    */
  var minimumWorld: Vector3 = js.native
  /**
    * Gets the 8 vectors representing the bounding box in local space
    */
  var vectors: js.Array[Vector3] = js.native
  /**
    * Gets the 8 vectors representing the bounding box in world space
    */
  var vectorsWorld: js.Array[Vector3] = js.native
  /** @hidden */
  def _update(world: Matrix): scala.Unit = js.native
  /**
    * Gets the world matrix of the bounding box
    * @returns a matrix
    */
  def getWorldMatrix(): Matrix = js.native
  /**
    * Tests if the bounding box intersects with a box defined by a min and max vectors
    * @param min defines the min vector to use
    * @param max defines the max vector to use
    * @returns true if there is an intersection
    */
  def intersectsMinMax(min: Vector3, max: Vector3): scala.Boolean = js.native
  /**
    * Tests if a point is inside the bounding box
    * @param point defines the point to test
    * @returns true if the point is inside the bounding box
    */
  def intersectsPoint(point: Vector3): scala.Boolean = js.native
  /**
    * Tests if the bounding box intersects with a bounding sphere
    * @param sphere defines the sphere to test
    * @returns true if there is an intersection
    */
  def intersectsSphere(sphere: BoundingSphere): scala.Boolean = js.native
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean = js.native
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean = js.native
  /**
    * Recreates the entire bounding box from scratch
    * @param min defines the new minimum vector (in local space)
    * @param max defines the new maximum vector (in local space)
    */
  def reConstruct(min: Vector3, max: Vector3): scala.Unit = js.native
  /**
    * Scale the current bounding box by applying a scale factor
    * @param factor defines the scale factor to apply
    * @returns the current bounding box
    */
  def scale(factor: scala.Double): BoundingBox = js.native
  /**
    * Sets the world matrix stored in the bounding box
    * @param matrix defines the matrix to store
    * @returns current bounding box
    */
  def setWorldMatrix(matrix: Matrix): BoundingBox = js.native
}

/**
  * Class used to store bounding box information
  */
@JSGlobal("BABYLON.BoundingBox")
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


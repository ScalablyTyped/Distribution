package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info for a bounding data of a mesh
  */
@JSGlobal("BABYLON.BoundingInfo")
@js.native
class BoundingInfo protected () extends ICullable {
  /**
    * Constructs bounding info
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    */
  def this(minimum: Vector3, maximum: Vector3) = this()
  var _isLocked: js.Any = js.native
  /**
    * Bounding box for the mesh
    */
  var boundingBox: BoundingBox = js.native
  /**
    * Bounding sphere for the mesh
    */
  var boundingSphere: BoundingSphere = js.native
  /**
    * Gets the world distance between the min and max points of the bounding box
    */
  val diagonalLength: scala.Double = js.native
  /**
    * If the info is locked and won't be updated to avoid perf overhead
    */
  var isLocked: scala.Boolean = js.native
  /**
    * max vector of the bounding box/sphere
    */
  val maximum: Vector3 = js.native
  /**
    * min vector of the bounding box/sphere
    */
  val minimum: Vector3 = js.native
  /** @hidden */
  def _checkCollision(collider: Collider): scala.Boolean = js.native
  /**
    * Recreate the bounding info to be centered around a specific point given a specific extend.
    * @param center New center of the bounding info
    * @param extend New extend of the bounding info
    * @returns the current bounding info
    */
  def centerOn(center: Vector3, extend: Vector3): BoundingInfo = js.native
  /**
    * Checks if another bounding info intersects the bounding box and bounding sphere or the mesh
    * @see https://doc.babylonjs.com/babylon101/intersect_collisions_-_mesh
    * @param boundingInfo the bounding info to check intersection with
    * @param precise if the intersection should be done using OBB
    * @returns if the bounding info intersects
    */
  def intersects(boundingInfo: BoundingInfo, precise: scala.Boolean): scala.Boolean = js.native
  /**
    * Checks if a point is inside the bounding box and bounding sphere or the mesh
    * @see https://doc.babylonjs.com/babylon101/intersect_collisions_-_mesh
    * @param point the point to check intersection with
    * @returns if the point intersects
    */
  def intersectsPoint(point: Vector3): scala.Boolean = js.native
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
  def isInFrustum(frustumPlanes: js.Array[Plane], strategy: scala.Double): scala.Boolean = js.native
  /**
    * Scale the current bounding info by applying a scale factor
    * @param factor defines the scale factor to apply
    * @returns the current bounding info
    */
  def scale(factor: scala.Double): BoundingInfo = js.native
  /**
    * Updates the boudning sphere and box
    * @param world world matrix to be used to update
    */
  def update(world: Matrix): scala.Unit = js.native
}


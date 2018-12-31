package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store bounding sphere information
  */
@JSGlobal("BABYLON.BoundingSphere")
@js.native
class BoundingSphere protected () extends js.Object {
  /**
    * Creates a new bounding sphere
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    */
  def this(min: Vector3, max: Vector3) = this()
  /**
    * Gets the center of the bounding sphere in local space
    */
  var center: Vector3 = js.native
  /**
    * Gets the center of the bounding sphere in world space
    */
  var centerWorld: Vector3 = js.native
  /**
    * Gets the maximum vector in local space
    */
  var maximum: Vector3 = js.native
  /**
    * Gets the minimum vector in local space
    */
  var minimum: Vector3 = js.native
  /**
    * Radius of the bounding sphere in local space
    */
  var radius: scala.Double = js.native
  /**
    * Radius of the bounding sphere in world space
    */
  var radiusWorld: scala.Double = js.native
  /** @hidden */
  def _update(world: Matrix): scala.Unit = js.native
  /**
    * Tests if a point is inside the bounding sphere
    * @param point defines the point to test
    * @returns true if the point is inside the bounding sphere
    */
  def intersectsPoint(point: Vector3): scala.Boolean = js.native
  /**
    * Tests if the bounding sphere is intersecting the frustum planes
    * @param frustumPlanes defines the frustum planes to test
    * @returns true if there is an intersection
    */
  def isInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean = js.native
  /**
    * Recreates the entire bounding sphere from scratch
    * @param min defines the new minimum vector (in local space)
    * @param max defines the new maximum vector (in local space)
    */
  def reConstruct(min: Vector3, max: Vector3): scala.Unit = js.native
  /**
    * Scale the current bounding sphere by applying a scale factor
    * @param factor defines the scale factor to apply
    * @returns the current bounding box
    */
  def scale(factor: scala.Double): BoundingSphere = js.native
}

/**
  * Class used to store bounding sphere information
  */
@JSGlobal("BABYLON.BoundingSphere")
@js.native
object BoundingSphere extends js.Object {
  /**
    * Checks if two sphere intersct
    * @param sphere0 sphere 0
    * @param sphere1 sphere 1
    * @returns true if the speres intersect
    */
  def Intersects(sphere0: babylonjsLib.BABYLONNs.BoundingSphere, sphere1: babylonjsLib.BABYLONNs.BoundingSphere): scala.Boolean = js.native
}


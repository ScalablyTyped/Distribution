package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingInfo extends ICullable {
  
  /** @hidden */
  def _checkCollision(collider: Collider): Boolean = js.native
  
  var _isLocked: js.Any = js.native
  
  /**
    * Bounding box for the mesh
    */
  val boundingBox: BoundingBox = js.native
  
  /**
    * Bounding sphere for the mesh
    */
  val boundingSphere: BoundingSphere = js.native
  
  /**
    * Recreate the bounding info to be centered around a specific point given a specific extend.
    * @param center New center of the bounding info
    * @param extend New extend of the bounding info
    * @returns the current bounding info
    */
  def centerOn(center: DeepImmutable[Vector3], extend: DeepImmutable[Vector3]): BoundingInfo = js.native
  
  /**
    * Gets the world distance between the min and max points of the bounding box
    */
  def diagonalLength: Double = js.native
  
  /**
    * Checks if another bounding info intersects the bounding box and bounding sphere or the mesh
    * @see https://doc.babylonjs.com/babylon101/intersect_collisions_-_mesh
    * @param boundingInfo the bounding info to check intersection with
    * @param precise if the intersection should be done using OBB
    * @returns if the bounding info intersects
    */
  def intersects(boundingInfo: DeepImmutable[BoundingInfo], precise: Boolean): Boolean = js.native
  
  /**
    * Checks if a point is inside the bounding box and bounding sphere or the mesh
    * @see https://doc.babylonjs.com/babylon101/intersect_collisions_-_mesh
    * @param point the point to check intersection with
    * @returns if the point intersects
    */
  def intersectsPoint(point: DeepImmutable[Vector3]): Boolean = js.native
  
  def isInFrustum(frustumPlanes: js.Array[DeepImmutable[Plane]], strategy: Double): Boolean = js.native
  
  /**
    * If the info is locked and won't be updated to avoid perf overhead
    */
  def isLocked: Boolean = js.native
  def isLocked_=(value: Boolean): Unit = js.native
  
  /**
    * max vector of the bounding box/sphere
    */
  def maximum: Vector3 = js.native
  
  /**
    * min vector of the bounding box/sphere
    */
  def minimum: Vector3 = js.native
  
  /**
    * Recreates the entire bounding info from scratch as if we call the constructor in place
    * @param min defines the new minimum vector (in local space)
    * @param max defines the new maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def reConstruct(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): Unit = js.native
  def reConstruct(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]): Unit = js.native
  
  /**
    * Scale the current bounding info by applying a scale factor
    * @param factor defines the scale factor to apply
    * @returns the current bounding info
    */
  def scale(factor: Double): BoundingInfo = js.native
  
  /**
    * Updates the bounding sphere and box
    * @param world world matrix to be used to update
    */
  def update(world: DeepImmutable[Matrix]): Unit = js.native
}

package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBox
  extends StObject
     with ICullable {
  
  /** @hidden */
  var _drawWrapperBack: Nullable[DrawWrapper] = js.native
  
  /** @hidden */
  var _drawWrapperFront: Nullable[DrawWrapper] = js.native
  
  /**
    * @hidden
    */
  var _tag: Double = js.native
  
  /**
    * @param world
    * @hidden
    */
  def _update(world: DeepImmutable[Matrix]): Unit = js.native
  
  /* private */ var _worldMatrix: Any = js.native
  
  /**
    * Gets the center of the bounding box in local space
    */
  val center: Vector3 = js.native
  
  /**
    * Gets the center of the bounding box in world space
    */
  val centerWorld: Vector3 = js.native
  
  /**
    * Gets the OBB (object bounding box) directions
    */
  val directions: js.Array[Vector3] = js.native
  
  /**
    * Disposes the resources of the class
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets the extend size in local space
    */
  val extendSize: Vector3 = js.native
  
  /**
    * Gets the extend size in world space
    */
  val extendSizeWorld: Vector3 = js.native
  
  /**
    * Gets the world matrix of the bounding box
    * @returns a matrix
    */
  def getWorldMatrix(): DeepImmutable[Matrix] = js.native
  
  /**
    * Tests if the bounding box intersects with a box defined by a min and max vectors
    * @param min defines the min vector to use
    * @param max defines the max vector to use
    * @returns true if there is an intersection
    */
  def intersectsMinMax(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): Boolean = js.native
  
  /**
    * Tests if a point is inside the bounding box
    * @param point defines the point to test
    * @returns true if the point is inside the bounding box
    */
  def intersectsPoint(point: DeepImmutable[Vector3]): Boolean = js.native
  
  /**
    * Tests if the bounding box intersects with a bounding sphere
    * @param sphere defines the sphere to test
    * @returns true if there is an intersection
    */
  def intersectsSphere(sphere: DeepImmutable[BoundingSphere]): Boolean = js.native
  
  /**
    * Gets the maximum vector in local space
    */
  val maximum: Vector3 = js.native
  
  /**
    * Gets the maximum vector in world space
    */
  val maximumWorld: Vector3 = js.native
  
  /**
    * Gets the minimum vector in local space
    */
  val minimum: Vector3 = js.native
  
  /**
    * Gets the minimum vector in world space
    */
  val minimumWorld: Vector3 = js.native
  
  /**
    * Recreates the entire bounding box from scratch as if we call the constructor in place
    * @param min defines the new minimum vector (in local space)
    * @param max defines the new maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def reConstruct(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): Unit = js.native
  def reConstruct(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]): Unit = js.native
  
  /**
    * Scale the current bounding box by applying a scale factor
    * @param factor defines the scale factor to apply
    * @returns the current bounding box
    */
  def scale(factor: Double): BoundingBox = js.native
  
  /**
    * Gets the 8 vectors representing the bounding box in local space
    */
  val vectors: js.Array[Vector3] = js.native
  
  /**
    * Gets the 8 vectors representing the bounding box in world space
    */
  val vectorsWorld: js.Array[Vector3] = js.native
}

package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsRaycastResult extends StObject {
  
  /* private */ var _hasHit: Any = js.native
  
  /* private */ var _hitDistance: Any = js.native
  
  /* private */ var _hitNormalWorld: Any = js.native
  
  /* private */ var _hitPointWorld: Any = js.native
  
  /* private */ var _rayFromWorld: Any = js.native
  
  /* private */ var _rayToWorld: Any = js.native
  
  /**
    * The Physics body that the ray hit
    */
  var body: js.UndefOr[PhysicsBody] = js.native
  
  /**
    * The body Index in case the Physics body is using instances
    */
  var bodyIndex: js.UndefOr[Double] = js.native
  
  /**
    * Calculates the distance manually
    */
  def calculateHitDistance(): Unit = js.native
  
  /**
    * Gets if there was a hit
    */
  def hasHit: Boolean = js.native
  
  /**
    * Gets the distance from the hit
    */
  def hitDistance: Double = js.native
  
  /**
    * Gets the hit normal/direction in the world
    */
  def hitNormalWorld: Vector3 = js.native
  
  /**
    * Gets the hit point in the world
    */
  def hitPointWorld: Vector3 = js.native
  
  /**
    * Gets the ray "start point" of the ray in the world
    */
  def rayFromWorld: Vector3 = js.native
  
  /**
    * Gets the ray "end point" of the ray in the world
    */
  def rayToWorld: Vector3 = js.native
  
  /**
    * Resets all the values to default
    * @param from The from point on world space
    * @param to The to point on world space
    */
  def reset(): Unit = js.native
  def reset(from: Unit, to: Vector3): Unit = js.native
  def reset(from: Vector3): Unit = js.native
  def reset(from: Vector3, to: Vector3): Unit = js.native
  
  /**
    * Sets the hit data (normal & point in world space)
    * @param hitNormalWorld defines the normal in world space
    * @param hitPointWorld defines the point in world space
    */
  def setHitData(hitNormalWorld: IXYZ, hitPointWorld: IXYZ): Unit = js.native
  
  /**
    * Sets the distance from the start point to the hit point
    * @param distance
    */
  def setHitDistance(distance: Double): Unit = js.native
}

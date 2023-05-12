package typings.babylonjs.physicsV2IphysicsenginepluginMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPhysicsCollisionEvent extends StObject {
  
  /**
    * 2nd physics body that collided
    */
  var collidedAgainst: PhysicsBody
  
  /**
    * index in instances array for the collidedAgainst
    */
  var collidedAgainstIndex: Double
  
  /**
    * 1st physics body that collided
    */
  var collider: PhysicsBody
  
  /**
    * index in instances array for the collider
    */
  var colliderIndex: Double
  
  /**
    * Penetration distance
    */
  var distance: Double
  
  /**
    * Impulse value computed by the solver response
    */
  var impulse: Double
  
  /**
    * Collision world normal direction
    */
  var normal: Nullable[Vector3]
  
  /**
    * World position where the collision occured
    */
  var point: Nullable[Vector3]
}
object IPhysicsCollisionEvent {
  
  inline def apply(
    collidedAgainst: PhysicsBody,
    collidedAgainstIndex: Double,
    collider: PhysicsBody,
    colliderIndex: Double,
    distance: Double,
    impulse: Double
  ): IPhysicsCollisionEvent = {
    val __obj = js.Dynamic.literal(collidedAgainst = collidedAgainst.asInstanceOf[js.Any], collidedAgainstIndex = collidedAgainstIndex.asInstanceOf[js.Any], collider = collider.asInstanceOf[js.Any], colliderIndex = colliderIndex.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], impulse = impulse.asInstanceOf[js.Any], normal = null, point = null)
    __obj.asInstanceOf[IPhysicsCollisionEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPhysicsCollisionEvent] (val x: Self) extends AnyVal {
    
    inline def setCollidedAgainst(value: PhysicsBody): Self = StObject.set(x, "collidedAgainst", value.asInstanceOf[js.Any])
    
    inline def setCollidedAgainstIndex(value: Double): Self = StObject.set(x, "collidedAgainstIndex", value.asInstanceOf[js.Any])
    
    inline def setCollider(value: PhysicsBody): Self = StObject.set(x, "collider", value.asInstanceOf[js.Any])
    
    inline def setColliderIndex(value: Double): Self = StObject.set(x, "colliderIndex", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setImpulse(value: Double): Self = StObject.set(x, "impulse", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: Nullable[Vector3]): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalNull: Self = StObject.set(x, "normal", null)
    
    inline def setPoint(value: Nullable[Vector3]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointNull: Self = StObject.set(x, "point", null)
  }
}

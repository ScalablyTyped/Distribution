package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2Joint extends StObject {
  
  /**
    * Get the anchor point on bodyA in world coordinates.
    * @return Anchor A point.
    **/
  def GetAnchorA(): b2Vec2
  
  /**
    * Get the anchor point on bodyB in world coordinates.
    * @return Anchor B point.
    **/
  def GetAnchorB(): b2Vec2
  
  /**
    * Get the first body attached to this joint.
    * @return Body A.
    **/
  def GetBodyA(): b2Body
  
  /**
    * Get the second body attached to this joint.
    * @return Body B.
    **/
  def GetBodyB(): b2Body
  
  /**
    * Get the next joint the world joint list.
    * @return Next joint.
    **/
  def GetNext(): b2Joint
  
  /**
    * Get the reaction force on body2 at the joint anchor in Newtons.
    * @param inv_dt
    * @return Reaction force (N)
    **/
  def GetReactionForce(inv_dt: Double): b2Vec2
  
  /**
    * Get the reaction torque on body2 in N.
    * @param inv_dt
    * @return Reaction torque (N).
    **/
  def GetReactionTorque(inv_dt: Double): Double
  
  /**
    * Get the type of the concrete joint.
    * @return Joint type.
    **/
  def GetType(): Double
  
  /**
    * Get the user data pointer.
    * @return User data.  Cast to your data type.
    **/
  def GetUserData(): Any
  
  /**
    * Short-cut function to determine if either body is inactive.
    * @return True if active, otherwise false.
    **/
  def IsActive(): Boolean
  
  /**
    * Set the user data pointer.
    * @param data Your custom data.
    **/
  def SetUserData(data: Any): Unit
}
object b2Joint {
  
  inline def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => Any,
    IsActive: () => Boolean,
    SetUserData: Any => Unit
  ): b2Joint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2Joint]
  }
  
  extension [Self <: b2Joint](x: Self) {
    
    inline def setGetAnchorA(value: () => b2Vec2): Self = StObject.set(x, "GetAnchorA", js.Any.fromFunction0(value))
    
    inline def setGetAnchorB(value: () => b2Vec2): Self = StObject.set(x, "GetAnchorB", js.Any.fromFunction0(value))
    
    inline def setGetBodyA(value: () => b2Body): Self = StObject.set(x, "GetBodyA", js.Any.fromFunction0(value))
    
    inline def setGetBodyB(value: () => b2Body): Self = StObject.set(x, "GetBodyB", js.Any.fromFunction0(value))
    
    inline def setGetNext(value: () => b2Joint): Self = StObject.set(x, "GetNext", js.Any.fromFunction0(value))
    
    inline def setGetReactionForce(value: Double => b2Vec2): Self = StObject.set(x, "GetReactionForce", js.Any.fromFunction1(value))
    
    inline def setGetReactionTorque(value: Double => Double): Self = StObject.set(x, "GetReactionTorque", js.Any.fromFunction1(value))
    
    inline def setGetType(value: () => Double): Self = StObject.set(x, "GetType", js.Any.fromFunction0(value))
    
    inline def setGetUserData(value: () => Any): Self = StObject.set(x, "GetUserData", js.Any.fromFunction0(value))
    
    inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "IsActive", js.Any.fromFunction0(value))
    
    inline def setSetUserData(value: Any => Unit): Self = StObject.set(x, "SetUserData", js.Any.fromFunction1(value))
  }
}

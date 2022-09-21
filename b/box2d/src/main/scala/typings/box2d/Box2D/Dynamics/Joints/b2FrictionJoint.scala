package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2FrictionJoint
  extends StObject
     with b2Joint {
  
  /**
    * Gets the max force.
    * @return Max force.
    **/
  def GetMaxForce(): Double
  
  /**
    * Gets the max torque.
    * @return Max torque.
    **/
  def GetMaxTorque(): Double
  
  /**
    * Sets the max force.
    * @param force New max force.
    **/
  def SetMaxForce(force: Double): Unit
  
  /**
    * Sets the max torque.
    * @param torque New max torque.
    **/
  def SetMaxTorque(torque: Double): Unit
  
  /**
    * Angular mass.
    **/
  var m_angularMass: Double
  
  /**
    * Linear mass.
    **/
  var m_linearMass: b2Mat22
}
object b2FrictionJoint {
  
  inline def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetMaxForce: () => Double,
    GetMaxTorque: () => Double,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => Any,
    IsActive: () => Boolean,
    SetMaxForce: Double => Unit,
    SetMaxTorque: Double => Unit,
    SetUserData: Any => Unit,
    m_angularMass: Double,
    m_linearMass: b2Mat22
  ): b2FrictionJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetMaxForce = js.Any.fromFunction0(GetMaxForce), GetMaxTorque = js.Any.fromFunction0(GetMaxTorque), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetMaxForce = js.Any.fromFunction1(SetMaxForce), SetMaxTorque = js.Any.fromFunction1(SetMaxTorque), SetUserData = js.Any.fromFunction1(SetUserData), m_angularMass = m_angularMass.asInstanceOf[js.Any], m_linearMass = m_linearMass.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FrictionJoint]
  }
  
  extension [Self <: b2FrictionJoint](x: Self) {
    
    inline def setGetMaxForce(value: () => Double): Self = StObject.set(x, "GetMaxForce", js.Any.fromFunction0(value))
    
    inline def setGetMaxTorque(value: () => Double): Self = StObject.set(x, "GetMaxTorque", js.Any.fromFunction0(value))
    
    inline def setM_angularMass(value: Double): Self = StObject.set(x, "m_angularMass", value.asInstanceOf[js.Any])
    
    inline def setM_linearMass(value: b2Mat22): Self = StObject.set(x, "m_linearMass", value.asInstanceOf[js.Any])
    
    inline def setSetMaxForce(value: Double => Unit): Self = StObject.set(x, "SetMaxForce", js.Any.fromFunction1(value))
    
    inline def setSetMaxTorque(value: Double => Unit): Self = StObject.set(x, "SetMaxTorque", js.Any.fromFunction1(value))
  }
}

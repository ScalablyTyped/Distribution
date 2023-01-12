package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2PrismaticJoint
  extends StObject
     with b2Joint {
  
  /**
    * Enable/disable the joint limit.
    * @param flag True to enable, false to disable.
    **/
  def EnableLimit(flag: Boolean): Unit
  
  /**
    * Enable/disable the joint motor.
    * @param flag True to enable, false to disable.
    **/
  def EnableMotor(flag: Boolean): Unit
  
  /**
    * Get the current joint translation speed, usually in meters per second.
    * @return Joint speed.
    **/
  def GetJointSpeed(): Double
  
  /**
    * Get the current joint translation, usually in meters.
    * @return Joint translation.
    **/
  def GetJointTranslation(): Double
  
  /**
    * Get the lower joint limit, usually in meters.
    * @return Lower limit.
    **/
  def GetLowerLimit(): Double
  
  /**
    * Get the current motor force, usually in N.
    * @return Motor force.
    **/
  def GetMotorForce(): Double
  
  /**
    * Get the motor speed, usually in meters per second.
    * @return Motor speed.
    **/
  def GetMotorSpeed(): Double
  
  /**
    * Get the upper joint limit, usually in meters.
    * @return Upper limit.
    **/
  def GetUpperLimit(): Double
  
  /**
    * Is the joint limit enabled?
    * @return True if enabled otherwise false.
    **/
  def IsLimitEnabled(): Boolean
  
  /**
    * Is the joint motor enabled?
    * @return True if enabled, otherwise false.
    **/
  def IsMotorEnabled(): Boolean
  
  /**
    * Set the joint limits, usually in meters.
    * @param lower Lower limit.
    * @param upper Upper limit.
    **/
  def SetLimits(lower: Double, upper: Double): Unit
  
  /**
    * Set the maximum motor force, usually in N.
    * @param force New max force.
    **/
  def SetMaxMotorForce(force: Double): Unit
  
  /**
    * Set the motor speed, usually in meters per second.
    * @param speed New motor speed.
    **/
  def SetMotorSpeed(speed: Double): Unit
}
object b2PrismaticJoint {
  
  inline def apply(
    EnableLimit: Boolean => Unit,
    EnableMotor: Boolean => Unit,
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetJointSpeed: () => Double,
    GetJointTranslation: () => Double,
    GetLowerLimit: () => Double,
    GetMotorForce: () => Double,
    GetMotorSpeed: () => Double,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUpperLimit: () => Double,
    GetUserData: () => Any,
    IsActive: () => Boolean,
    IsLimitEnabled: () => Boolean,
    IsMotorEnabled: () => Boolean,
    SetLimits: (Double, Double) => Unit,
    SetMaxMotorForce: Double => Unit,
    SetMotorSpeed: Double => Unit,
    SetUserData: Any => Unit
  ): b2PrismaticJoint = {
    val __obj = js.Dynamic.literal(EnableLimit = js.Any.fromFunction1(EnableLimit), EnableMotor = js.Any.fromFunction1(EnableMotor), GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetJointSpeed = js.Any.fromFunction0(GetJointSpeed), GetJointTranslation = js.Any.fromFunction0(GetJointTranslation), GetLowerLimit = js.Any.fromFunction0(GetLowerLimit), GetMotorForce = js.Any.fromFunction0(GetMotorForce), GetMotorSpeed = js.Any.fromFunction0(GetMotorSpeed), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUpperLimit = js.Any.fromFunction0(GetUpperLimit), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), IsLimitEnabled = js.Any.fromFunction0(IsLimitEnabled), IsMotorEnabled = js.Any.fromFunction0(IsMotorEnabled), SetLimits = js.Any.fromFunction2(SetLimits), SetMaxMotorForce = js.Any.fromFunction1(SetMaxMotorForce), SetMotorSpeed = js.Any.fromFunction1(SetMotorSpeed), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2PrismaticJoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: b2PrismaticJoint] (val x: Self) extends AnyVal {
    
    inline def setEnableLimit(value: Boolean => Unit): Self = StObject.set(x, "EnableLimit", js.Any.fromFunction1(value))
    
    inline def setEnableMotor(value: Boolean => Unit): Self = StObject.set(x, "EnableMotor", js.Any.fromFunction1(value))
    
    inline def setGetJointSpeed(value: () => Double): Self = StObject.set(x, "GetJointSpeed", js.Any.fromFunction0(value))
    
    inline def setGetJointTranslation(value: () => Double): Self = StObject.set(x, "GetJointTranslation", js.Any.fromFunction0(value))
    
    inline def setGetLowerLimit(value: () => Double): Self = StObject.set(x, "GetLowerLimit", js.Any.fromFunction0(value))
    
    inline def setGetMotorForce(value: () => Double): Self = StObject.set(x, "GetMotorForce", js.Any.fromFunction0(value))
    
    inline def setGetMotorSpeed(value: () => Double): Self = StObject.set(x, "GetMotorSpeed", js.Any.fromFunction0(value))
    
    inline def setGetUpperLimit(value: () => Double): Self = StObject.set(x, "GetUpperLimit", js.Any.fromFunction0(value))
    
    inline def setIsLimitEnabled(value: () => Boolean): Self = StObject.set(x, "IsLimitEnabled", js.Any.fromFunction0(value))
    
    inline def setIsMotorEnabled(value: () => Boolean): Self = StObject.set(x, "IsMotorEnabled", js.Any.fromFunction0(value))
    
    inline def setSetLimits(value: (Double, Double) => Unit): Self = StObject.set(x, "SetLimits", js.Any.fromFunction2(value))
    
    inline def setSetMaxMotorForce(value: Double => Unit): Self = StObject.set(x, "SetMaxMotorForce", js.Any.fromFunction1(value))
    
    inline def setSetMotorSpeed(value: Double => Unit): Self = StObject.set(x, "SetMotorSpeed", js.Any.fromFunction1(value))
  }
}

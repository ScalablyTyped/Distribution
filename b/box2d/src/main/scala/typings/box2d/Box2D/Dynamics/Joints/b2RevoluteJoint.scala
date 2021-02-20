package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2RevoluteJoint extends b2Joint {
  
  /**
    * Enable/disable the joint limit.
    * @param flag True to enable, false to disable.
    **/
  def EnableLimit(flag: Boolean): Unit = js.native
  
  /**
    * Enable/disable the joint motor.
    * @param flag True to enable, false to diasable.
    **/
  def EnableMotor(flag: Boolean): Unit = js.native
  
  /**
    * Get the current joint angle in radians.
    * @return Joint angle.
    **/
  def GetJointAngle(): Double = js.native
  
  /**
    * Get the current joint angle speed in radians per second.
    * @return Joint speed.
    **/
  def GetJointSpeed(): Double = js.native
  
  /**
    * Get the lower joint limit in radians.
    * @return Lower limit.
    **/
  def GetLowerLimit(): Double = js.native
  
  /**
    * Get the motor speed in radians per second.
    * @return Motor speed.
    **/
  def GetMotorSpeed(): Double = js.native
  
  /**
    * Get the current motor torque, usually in N-m.
    * @return Motor torque.
    **/
  def GetMotorTorque(): Double = js.native
  
  /**
    * Get the upper joint limit in radians.
    * @return Upper limit.
    **/
  def GetUpperLimit(): Double = js.native
  
  /**
    * Is the joint limit enabled?
    * @return True if enabled, false if disabled.
    **/
  def IsLimitEnabled(): Boolean = js.native
  
  /**
    * Is the joint motor enabled?
    * @return True if enabled, false if disabled.
    **/
  def IsMotorEnabled(): Boolean = js.native
  
  /**
    * Set the joint limits in radians.
    * @param lower New lower limit.
    * @param upper New upper limit.
    **/
  def SetLimits(lower: Double, upper: Double): Unit = js.native
  
  /**
    * Set the maximum motor torque, usually in N-m.
    * @param torque New max torque.
    **/
  def SetMaxMotorTorque(torque: Double): Unit = js.native
  
  /**
    * Set the motor speed in radians per second.
    * @param speed New motor speed.
    **/
  def SetMotorSpeed(speed: Double): Unit = js.native
}
object b2RevoluteJoint {
  
  @scala.inline
  def apply(
    EnableLimit: Boolean => Unit,
    EnableMotor: Boolean => Unit,
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetJointAngle: () => Double,
    GetJointSpeed: () => Double,
    GetLowerLimit: () => Double,
    GetMotorSpeed: () => Double,
    GetMotorTorque: () => Double,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUpperLimit: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    IsLimitEnabled: () => Boolean,
    IsMotorEnabled: () => Boolean,
    SetLimits: (Double, Double) => Unit,
    SetMaxMotorTorque: Double => Unit,
    SetMotorSpeed: Double => Unit,
    SetUserData: js.Any => Unit
  ): b2RevoluteJoint = {
    val __obj = js.Dynamic.literal(EnableLimit = js.Any.fromFunction1(EnableLimit), EnableMotor = js.Any.fromFunction1(EnableMotor), GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetJointAngle = js.Any.fromFunction0(GetJointAngle), GetJointSpeed = js.Any.fromFunction0(GetJointSpeed), GetLowerLimit = js.Any.fromFunction0(GetLowerLimit), GetMotorSpeed = js.Any.fromFunction0(GetMotorSpeed), GetMotorTorque = js.Any.fromFunction0(GetMotorTorque), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUpperLimit = js.Any.fromFunction0(GetUpperLimit), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), IsLimitEnabled = js.Any.fromFunction0(IsLimitEnabled), IsMotorEnabled = js.Any.fromFunction0(IsMotorEnabled), SetLimits = js.Any.fromFunction2(SetLimits), SetMaxMotorTorque = js.Any.fromFunction1(SetMaxMotorTorque), SetMotorSpeed = js.Any.fromFunction1(SetMotorSpeed), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2RevoluteJoint]
  }
  
  @scala.inline
  implicit class b2RevoluteJointMutableBuilder[Self <: b2RevoluteJoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableLimit(value: Boolean => Unit): Self = StObject.set(x, "EnableLimit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableMotor(value: Boolean => Unit): Self = StObject.set(x, "EnableMotor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJointAngle(value: () => Double): Self = StObject.set(x, "GetJointAngle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetJointSpeed(value: () => Double): Self = StObject.set(x, "GetJointSpeed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLowerLimit(value: () => Double): Self = StObject.set(x, "GetLowerLimit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMotorSpeed(value: () => Double): Self = StObject.set(x, "GetMotorSpeed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMotorTorque(value: () => Double): Self = StObject.set(x, "GetMotorTorque", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpperLimit(value: () => Double): Self = StObject.set(x, "GetUpperLimit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLimitEnabled(value: () => Boolean): Self = StObject.set(x, "IsLimitEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMotorEnabled(value: () => Boolean): Self = StObject.set(x, "IsMotorEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLimits(value: (Double, Double) => Unit): Self = StObject.set(x, "SetLimits", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMaxMotorTorque(value: Double => Unit): Self = StObject.set(x, "SetMaxMotorTorque", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMotorSpeed(value: Double => Unit): Self = StObject.set(x, "SetMotorSpeed", js.Any.fromFunction1(value))
  }
}

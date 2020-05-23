package typings.box2d.global.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2LineJoint")
@js.native
class b2LineJoint ()
  extends typings.box2d.Box2D.Dynamics.Joints.b2LineJoint {
  /**
    * Enable/disable the joint limit.
    * @param flag True to enable, false to disable limits
    **/
  /* CompleteClass */
  override def EnableLimit(flag: Boolean): Unit = js.native
  /**
    * Enable/disable the joint motor.
    * @param flag True to enable, false to disable the motor.
    **/
  /* CompleteClass */
  override def EnableMotor(flag: Boolean): Unit = js.native
  /**
    * Get the anchor point on bodyA in world coordinates.
    * @return Anchor A point.
    **/
  /* CompleteClass */
  override def GetAnchorA(): b2Vec2 = js.native
  /**
    * Get the anchor point on bodyB in world coordinates.
    * @return Anchor B point.
    **/
  /* CompleteClass */
  override def GetAnchorB(): b2Vec2 = js.native
  /**
    * Get the first body attached to this joint.
    * @return Body A.
    **/
  /* CompleteClass */
  override def GetBodyA(): b2Body = js.native
  /**
    * Get the second body attached to this joint.
    * @return Body B.
    **/
  /* CompleteClass */
  override def GetBodyB(): b2Body = js.native
  /**
    * Get the current joint translation speed, usually in meters per second.
    * @return Joint speed.
    **/
  /* CompleteClass */
  override def GetJointSpeed(): Double = js.native
  /**
    * Get the current joint translation, usually in meters.
    * @return Joint translation.
    **/
  /* CompleteClass */
  override def GetJointTranslation(): Double = js.native
  /**
    * Get the lower joint limit, usually in meters.
    * @return Lower limit.
    **/
  /* CompleteClass */
  override def GetLowerLimit(): Double = js.native
  /**
    * Get the maximum motor force, usually in N.
    * @return Max motor force.
    **/
  /* CompleteClass */
  override def GetMaxMotorForce(): Double = js.native
  /**
    * Get the current motor force, usually in N.
    * @return Motor force.
    **/
  /* CompleteClass */
  override def GetMotorForce(): Double = js.native
  /**
    * Get the motor speed, usually in meters per second.
    * @return Motor speed.
    **/
  /* CompleteClass */
  override def GetMotorSpeed(): Double = js.native
  /**
    * Get the next joint the world joint list.
    * @return Next joint.
    **/
  /* CompleteClass */
  override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
  /**
    * Get the reaction force on body2 at the joint anchor in Newtons.
    * @param inv_dt
    * @return Reaction force (N)
    **/
  /* CompleteClass */
  override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
  /**
    * Get the reaction torque on body2 in N.
    * @param inv_dt
    * @return Reaction torque (N).
    **/
  /* CompleteClass */
  override def GetReactionTorque(inv_dt: Double): Double = js.native
  /**
    * Get the type of the concrete joint.
    * @return Joint type.
    **/
  /* CompleteClass */
  override def GetType(): Double = js.native
  /**
    * Get the upper joint limit, usually in meters.
    * @return Upper limit.
    **/
  /* CompleteClass */
  override def GetUpperLimit(): Double = js.native
  /**
    * Get the user data pointer.
    * @return User data.  Cast to your data type.
    **/
  /* CompleteClass */
  override def GetUserData(): js.Any = js.native
  /**
    * Short-cut function to determine if either body is inactive.
    * @return True if active, otherwise false.
    **/
  /* CompleteClass */
  override def IsActive(): Boolean = js.native
  /**
    * Is the joint limit enabled?
    * @return True if enabled otherwise false.
    **/
  /* CompleteClass */
  override def IsLimitEnabled(): Boolean = js.native
  /**
    * Is the joint motor enabled?
    * @return True if enabled, otherwise false.
    **/
  /* CompleteClass */
  override def IsMotorEnabled(): Boolean = js.native
  /**
    * Set the joint limits, usually in meters.
    * @param lower Lower limit.
    * @param upper Upper limit.
    **/
  /* CompleteClass */
  override def SetLimits(lower: Double, upper: Double): Unit = js.native
  /**
    * Set the maximum motor force, usually in N.
    * @param force New max motor force.
    **/
  /* CompleteClass */
  override def SetMaxMotorForce(force: Double): Unit = js.native
  /**
    * Set the motor speed, usually in meters per second.
    * @param speed New motor speed.
    **/
  /* CompleteClass */
  override def SetMotorSpeed(speed: Double): Unit = js.native
  /**
    * Set the user data pointer.
    * @param data Your custom data.
    **/
  /* CompleteClass */
  override def SetUserData(data: js.Any): Unit = js.native
}


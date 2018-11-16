package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2PrismaticJoint")
@js.native
class b2PrismaticJoint () extends b2Joint {
  /**
  		* Enable/disable the joint limit.
  		* @param flag True to enable, false to disable.
  		**/
  def EnableLimit(flag: scala.Boolean): scala.Unit = js.native
  /**
  		* Enable/disable the joint motor.
  		* @param flag True to enable, false to disable.
  		**/
  def EnableMotor(flag: scala.Boolean): scala.Unit = js.native
  /**
  		* Get the current joint translation speed, usually in meters per second.
  		* @return Joint speed.
  		**/
  def GetJointSpeed(): scala.Double = js.native
  /**
  		* Get the current joint translation, usually in meters.
  		* @return Joint translation.
  		**/
  def GetJointTranslation(): scala.Double = js.native
  /**
  		* Get the lower joint limit, usually in meters.
  		* @return Lower limit.
  		**/
  def GetLowerLimit(): scala.Double = js.native
  /**
  		* Get the current motor force, usually in N.
  		* @return Motor force.
  		**/
  def GetMotorForce(): scala.Double = js.native
  /**
  		* Get the motor speed, usually in meters per second.
  		* @return Motor speed.
  		**/
  def GetMotorSpeed(): scala.Double = js.native
  /**
  		* Get the upper joint limit, usually in meters.
  		* @return Upper limit.
  		**/
  def GetUpperLimit(): scala.Double = js.native
  /**
  		* Is the joint limit enabled?
  		* @return True if enabled otherwise false.
  		**/
  def IsLimitEnabled(): scala.Boolean = js.native
  /**
  		* Is the joint motor enabled?
  		* @return True if enabled, otherwise false.
  		**/
  def IsMotorEnabled(): scala.Boolean = js.native
  /**
  		* Set the joint limits, usually in meters.
  		* @param lower Lower limit.
  		* @param upper Upper limit.
  		**/
  def SetLimits(lower: scala.Double, upper: scala.Double): scala.Unit = js.native
  /**
  		* Set the maximum motor force, usually in N.
  		* @param force New max force.
  		**/
  def SetMaxMotorForce(force: scala.Double): scala.Unit = js.native
  /**
  		* Set the motor speed, usually in meters per second.
  		* @param speed New motor speed.
  		**/
  def SetMotorSpeed(speed: scala.Double): scala.Unit = js.native
}


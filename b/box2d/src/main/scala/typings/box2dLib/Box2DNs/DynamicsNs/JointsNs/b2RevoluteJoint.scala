package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2RevoluteJoint")
@js.native
class b2RevoluteJoint () extends b2Joint {
  /**
  		* Enable/disable the joint limit.
  		* @param flag True to enable, false to disable.
  		**/
  def EnableLimit(flag: scala.Boolean): scala.Unit = js.native
  /**
  		* Enable/disable the joint motor.
  		* @param flag True to enable, false to diasable.
  		**/
  def EnableMotor(flag: scala.Boolean): scala.Unit = js.native
  /**
  		* Get the current joint angle in radians.
  		* @return Joint angle.
  		**/
  def GetJointAngle(): scala.Double = js.native
  /**
  		* Get the current joint angle speed in radians per second.
  		* @return Joint speed.
  		**/
  def GetJointSpeed(): scala.Double = js.native
  /**
  		* Get the lower joint limit in radians.
  		* @return Lower limit.
  		**/
  def GetLowerLimit(): scala.Double = js.native
  /**
  		* Get the motor speed in radians per second.
  		* @return Motor speed.
  		**/
  def GetMotorSpeed(): scala.Double = js.native
  /**
  		* Get the current motor torque, usually in N-m.
  		* @return Motor torque.
  		**/
  def GetMotorTorque(): scala.Double = js.native
  /**
  		* Get the upper joint limit in radians.
  		* @return Upper limit.
  		**/
  def GetUpperLimit(): scala.Double = js.native
  /**
  		* Is the joint limit enabled?
  		* @return True if enabled, false if disabled.
  		**/
  def IsLimitEnabled(): scala.Boolean = js.native
  /**
  		* Is the joint motor enabled?
  		* @return True if enabled, false if disabled.
  		**/
  def IsMotorEnabled(): scala.Boolean = js.native
  /**
  		* Set the joint limits in radians.
  		* @param lower New lower limit.
  		* @param upper New upper limit.
  		**/
  def SetLimits(lower: scala.Double, upper: scala.Double): scala.Unit = js.native
  /**
  		* Set the maximum motor torque, usually in N-m.
  		* @param torque New max torque.
  		**/
  def SetMaxMotorTorque(torque: scala.Double): scala.Unit = js.native
  /**
  		* Set the motor speed in radians per second.
  		* @param speed New motor speed.
  		**/
  def SetMotorSpeed(speed: scala.Double): scala.Unit = js.native
}


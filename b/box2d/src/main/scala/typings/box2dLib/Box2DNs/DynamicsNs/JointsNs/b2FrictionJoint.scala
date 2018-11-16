package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2FrictionJoint")
@js.native
class b2FrictionJoint () extends b2Joint {
  /**
  		* Angular mass.
  		**/
  var m_angularMass: scala.Double = js.native
  /**
  		* Linear mass.
  		**/
  var m_linearMass: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22 = js.native
  /**
  		* Gets the max force.
  		* @return Max force.
  		**/
  def GetMaxForce(): scala.Double = js.native
  /**
  		* Gets the max torque.
  		* @return Max torque.
  		**/
  def GetMaxTorque(): scala.Double = js.native
  /**
  		* Sets the max force.
  		* @param force New max force.
  		**/
  def SetMaxForce(force: scala.Double): scala.Unit = js.native
  /**
  		* Sets the max torque.
  		* @param torque New max torque.
  		**/
  def SetMaxTorque(torque: scala.Double): scala.Unit = js.native
}


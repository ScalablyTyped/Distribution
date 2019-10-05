package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Mat22
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2FrictionJoint")
@js.native
class b2FrictionJoint () extends b2Joint {
  /**
  		* Angular mass.
  		**/
  var m_angularMass: Double = js.native
  /**
  		* Linear mass.
  		**/
  var m_linearMass: b2Mat22 = js.native
  /**
  		* Gets the max force.
  		* @return Max force.
  		**/
  def GetMaxForce(): Double = js.native
  /**
  		* Gets the max torque.
  		* @return Max torque.
  		**/
  def GetMaxTorque(): Double = js.native
  /**
  		* Sets the max force.
  		* @param force New max force.
  		**/
  def SetMaxForce(force: Double): Unit = js.native
  /**
  		* Sets the max torque.
  		* @param torque New max torque.
  		**/
  def SetMaxTorque(torque: Double): Unit = js.native
}


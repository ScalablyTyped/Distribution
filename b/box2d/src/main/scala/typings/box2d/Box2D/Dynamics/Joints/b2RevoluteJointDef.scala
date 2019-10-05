package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2RevoluteJointDef")
@js.native
/**
		* Constructor.
		**/
class b2RevoluteJointDef () extends b2JointDef {
  /**
  		* A flag to enable joint limits.
  		**/
  var enableLimit: Boolean = js.native
  /**
  		* A flag to enable the joint motor.
  		**/
  var enableMotor: Boolean = js.native
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: b2Vec2 = js.native
  /**
  		* The lower angle for the joint limit (radians).
  		**/
  var lowerAngle: Double = js.native
  /**
  		* The maximum motor torque used to achieve the desired motor speed. Usually in N-m.
  		**/
  var maxMotorTorque: Double = js.native
  /**
  		* The desired motor speed. Usually in radians per second.
  		**/
  var motorSpeed: Double = js.native
  /**
  		* The bodyB angle minus bodyA angle in the reference state (radians).
  		**/
  var referenceAngle: Double = js.native
  /**
  		* The upper angle for the joint limit (radians).
  		**/
  var upperAngle: Double = js.native
  /**
  		* Initialize the bodies, achors, and reference angle using the world anchor.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchor Anchor.
  		**/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit = js.native
}


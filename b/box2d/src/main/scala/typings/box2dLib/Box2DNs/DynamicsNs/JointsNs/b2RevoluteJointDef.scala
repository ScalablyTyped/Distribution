package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

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
  var enableLimit: scala.Boolean = js.native
  /**
  		* A flag to enable the joint motor.
  		**/
  var enableMotor: scala.Boolean = js.native
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The lower angle for the joint limit (radians).
  		**/
  var lowerAngle: scala.Double = js.native
  /**
  		* The maximum motor torque used to achieve the desired motor speed. Usually in N-m.
  		**/
  var maxMotorTorque: scala.Double = js.native
  /**
  		* The desired motor speed. Usually in radians per second.
  		**/
  var motorSpeed: scala.Double = js.native
  /**
  		* The bodyB angle minus bodyA angle in the reference state (radians).
  		**/
  var referenceAngle: scala.Double = js.native
  /**
  		* The upper angle for the joint limit (radians).
  		**/
  var upperAngle: scala.Double = js.native
  /**
  		* Initialize the bodies, achors, and reference angle using the world anchor.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchor Anchor.
  		**/
  def Initialize(
    bA: box2dLib.Box2DNs.DynamicsNs.b2Body,
    bB: box2dLib.Box2DNs.DynamicsNs.b2Body,
    anchor: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2
  ): scala.Unit = js.native
}


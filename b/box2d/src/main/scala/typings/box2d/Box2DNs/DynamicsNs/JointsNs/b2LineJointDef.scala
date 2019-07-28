package typings.box2d.Box2DNs.DynamicsNs.JointsNs

import typings.box2d.Box2DNs.CommonNs.MathNs.b2Vec2
import typings.box2d.Box2DNs.DynamicsNs.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2LineJointDef")
@js.native
/**
		* Constructor.
		**/
class b2LineJointDef () extends b2JointDef {
  /**
  		* Enable/disable the joint limit.
  		**/
  var enableLimit: Boolean = js.native
  /**
  		* Enable/disable the joint motor.
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
  		* The local translation axis in bodyA.
  		**/
  var localAxisA: b2Vec2 = js.native
  /**
  		* The lower translation limit, usually in meters.
  		**/
  var lowerTranslation: Double = js.native
  /**
  		* The maximum motor torque, usually in N-m.
  		**/
  var maxMotorForce: Double = js.native
  /**
  		* The desired motor speed in radians per second.
  		**/
  var motorSpeed: Double = js.native
  /**
  		* The upper translation limit, usually in meters.
  		**/
  var upperTranslation: Double = js.native
  /**
  		* Initialize the bodies, anchors, and length using the world anchors.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchor Anchor.
  		* @param axis Axis.
  		**/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2, axis: b2Vec2): Unit = js.native
}


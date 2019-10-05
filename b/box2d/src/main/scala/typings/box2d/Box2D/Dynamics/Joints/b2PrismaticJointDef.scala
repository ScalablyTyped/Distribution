package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2PrismaticJointDef")
@js.native
/**
		* Constructor.
		**/
class b2PrismaticJointDef () extends b2JointDef {
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
  		* The local translation axis in body1.
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
  		* The constrained angle between the bodies: bodyB_angle - bodyA_angle.
  		**/
  var referenceAngle: Double = js.native
  /**
  		* The upper translation limit, usually in meters.
  		**/
  var upperTranslation: Double = js.native
  /**
  		* Initialize the joint.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchor Anchor.
  		* @param axis Axis.
  		**/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2, axis: b2Vec2): Unit = js.native
}


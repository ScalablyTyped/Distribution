package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2PrismaticJointDef")
@js.native
class b2PrismaticJointDef () extends b2JointDef {
  /**
  		* Enable/disable the joint limit.
  		**/
  var enableLimit: scala.Boolean = js.native
  /**
  		* Enable/disable the joint motor.
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
  		* The local translation axis in body1.
  		**/
  var localAxisA: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The lower translation limit, usually in meters.
  		**/
  var lowerTranslation: scala.Double = js.native
  /**
  		* The maximum motor torque, usually in N-m.
  		**/
  var maxMotorForce: scala.Double = js.native
  /**
  		* The desired motor speed in radians per second.
  		**/
  var motorSpeed: scala.Double = js.native
  /**
  		* The constrained angle between the bodies: bodyB_angle - bodyA_angle.
  		**/
  var referenceAngle: scala.Double = js.native
  /**
  		* The upper translation limit, usually in meters.
  		**/
  var upperTranslation: scala.Double = js.native
  /**
  		* Initialize the joint.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchor Anchor.
  		* @param axis Axis.
  		**/
  def Initialize(
    bA: box2dLib.Box2DNs.DynamicsNs.b2Body,
    bB: box2dLib.Box2DNs.DynamicsNs.b2Body,
    anchor: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    axis: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2
  ): scala.Unit = js.native
}


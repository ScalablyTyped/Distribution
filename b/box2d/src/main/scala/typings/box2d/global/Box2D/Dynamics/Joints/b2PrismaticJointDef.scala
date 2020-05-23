package typings.box2d.global.Box2D.Dynamics.Joints

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
class b2PrismaticJointDef ()
  extends typings.box2d.Box2D.Dynamics.Joints.b2PrismaticJointDef {
  /**
    * The first attached body.
    **/
  /* CompleteClass */
  override var bodyA: b2Body = js.native
  /**
    * The second attached body.
    **/
  /* CompleteClass */
  override var bodyB: b2Body = js.native
  /**
    * Set this flag to true if the attached bodies should collide.
    **/
  /* CompleteClass */
  override var collideConnected: Boolean = js.native
  /**
    * Enable/disable the joint limit.
    **/
  /* CompleteClass */
  override var enableLimit: Boolean = js.native
  /**
    * Enable/disable the joint motor.
    **/
  /* CompleteClass */
  override var enableMotor: Boolean = js.native
  /**
    * The local anchor point relative to body1's origin.
    **/
  /* CompleteClass */
  override var localAnchorA: b2Vec2 = js.native
  /**
    * The local anchor point relative to body2's origin.
    **/
  /* CompleteClass */
  override var localAnchorB: b2Vec2 = js.native
  /**
    * The local translation axis in body1.
    **/
  /* CompleteClass */
  override var localAxisA: b2Vec2 = js.native
  /**
    * The lower translation limit, usually in meters.
    **/
  /* CompleteClass */
  override var lowerTranslation: Double = js.native
  /**
    * The maximum motor torque, usually in N-m.
    **/
  /* CompleteClass */
  override var maxMotorForce: Double = js.native
  /**
    * The desired motor speed in radians per second.
    **/
  /* CompleteClass */
  override var motorSpeed: Double = js.native
  /**
    * The constrained angle between the bodies: bodyB_angle - bodyA_angle.
    **/
  /* CompleteClass */
  override var referenceAngle: Double = js.native
  /**
    * The joint type is set automatically for concrete joint types.
    **/
  /* CompleteClass */
  override var `type`: Double = js.native
  /**
    * The upper translation limit, usually in meters.
    **/
  /* CompleteClass */
  override var upperTranslation: Double = js.native
  /**
    * Use this to attach application specific data to your joints.
    **/
  /* CompleteClass */
  override var userData: js.Any = js.native
  /**
    * Initialize the joint.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor Anchor.
    * @param axis Axis.
    **/
  /* CompleteClass */
  override def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2, axis: b2Vec2): Unit = js.native
}


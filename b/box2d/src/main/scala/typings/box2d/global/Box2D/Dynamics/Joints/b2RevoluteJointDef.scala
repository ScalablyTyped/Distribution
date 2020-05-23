package typings.box2d.global.Box2D.Dynamics.Joints

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
class b2RevoluteJointDef ()
  extends typings.box2d.Box2D.Dynamics.Joints.b2RevoluteJointDef {
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
    * A flag to enable joint limits.
    **/
  /* CompleteClass */
  override var enableLimit: Boolean = js.native
  /**
    * A flag to enable the joint motor.
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
    * The lower angle for the joint limit (radians).
    **/
  /* CompleteClass */
  override var lowerAngle: Double = js.native
  /**
    * The maximum motor torque used to achieve the desired motor speed. Usually in N-m.
    **/
  /* CompleteClass */
  override var maxMotorTorque: Double = js.native
  /**
    * The desired motor speed. Usually in radians per second.
    **/
  /* CompleteClass */
  override var motorSpeed: Double = js.native
  /**
    * The bodyB angle minus bodyA angle in the reference state (radians).
    **/
  /* CompleteClass */
  override var referenceAngle: Double = js.native
  /**
    * The joint type is set automatically for concrete joint types.
    **/
  /* CompleteClass */
  override var `type`: Double = js.native
  /**
    * The upper angle for the joint limit (radians).
    **/
  /* CompleteClass */
  override var upperAngle: Double = js.native
  /**
    * Use this to attach application specific data to your joints.
    **/
  /* CompleteClass */
  override var userData: js.Any = js.native
  /**
    * Initialize the bodies, achors, and reference angle using the world anchor.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor Anchor.
    **/
  /* CompleteClass */
  override def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit = js.native
}


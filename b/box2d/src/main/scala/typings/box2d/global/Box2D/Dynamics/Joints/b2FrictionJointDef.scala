package typings.box2d.global.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2FrictionJointDef")
@js.native
/**
  * Constructor.
  **/
class b2FrictionJointDef ()
  extends typings.box2d.Box2D.Dynamics.Joints.b2FrictionJointDef {
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
    * The maximum force in N.
    **/
  /* CompleteClass */
  override var maxForce: Double = js.native
  /**
    * The maximum friction torque in N-m.
    **/
  /* CompleteClass */
  override var maxTorque: Double = js.native
  /**
    * The joint type is set automatically for concrete joint types.
    **/
  /* CompleteClass */
  override var `type`: Double = js.native
  /**
    * Use this to attach application specific data to your joints.
    **/
  /* CompleteClass */
  override var userData: js.Any = js.native
  /**
    * Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor World anchor.
    **/
  /* CompleteClass */
  override def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit = js.native
}


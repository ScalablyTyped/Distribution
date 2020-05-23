package typings.box2d.global.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2DistanceJointDef")
@js.native
/**
  * Constructor.
  **/
class b2DistanceJointDef ()
  extends typings.box2d.Box2D.Dynamics.Joints.b2DistanceJointDef {
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
    * The damping ratio. 0 = no damping, 1 = critical damping.
    **/
  /* CompleteClass */
  override var dampingRatio: Double = js.native
  /**
    * The mass-spring-damper frequency in Hertz.
    **/
  /* CompleteClass */
  override var frequencyHz: Double = js.native
  /**
    * The natural length between the anchor points.
    **/
  /* CompleteClass */
  override var length: Double = js.native
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
    * Initialize the bodies, anchors, and length using the world anchors.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchorA Anchor A.
    * @param anchorB Anchor B.
    **/
  /* CompleteClass */
  override def Initialize(bA: b2Body, bB: b2Body, anchorA: b2Vec2, anchorB: b2Vec2): Unit = js.native
}


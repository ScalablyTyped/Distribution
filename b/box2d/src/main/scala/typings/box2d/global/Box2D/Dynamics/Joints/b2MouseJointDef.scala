package typings.box2d.global.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2MouseJointDef")
@js.native
/**
  * Constructor.
  **/
class b2MouseJointDef ()
  extends typings.box2d.Box2D.Dynamics.Joints.b2MouseJointDef {
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
    * The response speed.
    **/
  /* CompleteClass */
  override var frequencyHz: Double = js.native
  /**
    * The maximum constraint force that can be exerted to move the candidate body.
    **/
  /* CompleteClass */
  override var maxForce: Double = js.native
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
}


package typings.box2d.global.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2GearJointDef")
@js.native
/**
  * Constructor.
  **/
class b2GearJointDef ()
  extends typings.box2d.Box2D.Dynamics.Joints.b2GearJointDef {
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
    * The first revolute/prismatic joint attached to the gear joint.
    **/
  /* CompleteClass */
  override var joint1: typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
  /**
    * The second revolute/prismatic joint attached to the gear joint.
    **/
  /* CompleteClass */
  override var joint2: typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
  /**
    * The gear ratio.
    **/
  /* CompleteClass */
  override var ratio: Double = js.native
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


package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2MouseJointDef extends b2JointDef {
  /**
    * The damping ratio. 0 = no damping, 1 = critical damping.
    **/
  var dampingRatio: Double
  /**
    * The response speed.
    **/
  var frequencyHz: Double
  /**
    * The maximum constraint force that can be exerted to move the candidate body.
    **/
  var maxForce: Double
}

object b2MouseJointDef {
  @scala.inline
  def apply(
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    dampingRatio: Double,
    frequencyHz: Double,
    maxForce: Double,
    `type`: Double,
    userData: js.Any
  ): b2MouseJointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], dampingRatio = dampingRatio.asInstanceOf[js.Any], frequencyHz = frequencyHz.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2MouseJointDef]
  }
}


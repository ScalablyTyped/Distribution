package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2JointDef extends js.Object {
  /**
    * The first attached body.
    **/
  var bodyA: b2Body
  /**
    * The second attached body.
    **/
  var bodyB: b2Body
  /**
    * Set this flag to true if the attached bodies should collide.
    **/
  var collideConnected: Boolean
  /**
    * The joint type is set automatically for concrete joint types.
    **/
  var `type`: Double
  /**
    * Use this to attach application specific data to your joints.
    **/
  var userData: js.Any
}

object b2JointDef {
  @scala.inline
  def apply(bodyA: b2Body, bodyB: b2Body, collideConnected: Boolean, `type`: Double, userData: js.Any): b2JointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2JointDef]
  }
}


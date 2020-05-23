package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2JointEdge extends js.Object {
  /**
    * The joint.
    **/
  var joint: b2Joint
  /**
    * The next joint edge in the body's joint list.
    **/
  var next: b2JointEdge
  /**
    * Provides quick access to the other body attached.
    **/
  var other: b2Body
  /**
    * The previous joint edge in the body's joint list.
    **/
  var prev: b2JointEdge
}

object b2JointEdge {
  @scala.inline
  def apply(joint: b2Joint, next: b2JointEdge, other: b2Body, prev: b2JointEdge): b2JointEdge = {
    val __obj = js.Dynamic.literal(joint = joint.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2JointEdge]
  }
}


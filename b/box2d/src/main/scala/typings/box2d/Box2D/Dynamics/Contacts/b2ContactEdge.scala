package typings.box2d.Box2D.Dynamics.Contacts

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2ContactEdge extends js.Object {
  /**
    * Contact.
    **/
  var contact: b2Contact
  /**
    * Next contact edge.
    **/
  var next: b2ContactEdge
  /**
    * Contact body.
    **/
  var other: b2Body
  /**
    * Previous contact edge.
    **/
  var prev: b2ContactEdge
}

object b2ContactEdge {
  @scala.inline
  def apply(contact: b2Contact, next: b2ContactEdge, other: b2Body, prev: b2ContactEdge): b2ContactEdge = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactEdge]
  }
}


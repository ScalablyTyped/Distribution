package typings.box2d.Box2DNs.DynamicsNs.ContactsNs

import typings.box2d.Box2DNs.DynamicsNs.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Contacts.b2ContactEdge")
@js.native
class b2ContactEdge () extends js.Object {
  /**
  		* Contact.
  		**/
  var contact: b2Contact = js.native
  /**
  		* Next contact edge.
  		**/
  var next: b2ContactEdge = js.native
  /**
  		* Contact body.
  		**/
  var other: b2Body = js.native
  /**
  		* Previous contact edge.
  		**/
  var prev: b2ContactEdge = js.native
}


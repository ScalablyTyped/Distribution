package typings.box2d.Box2DNs.DynamicsNs.ContactsNs

import typings.box2d.Box2DNs.CollisionNs.ShapesNs.b2Shape
import typings.box2d.Box2DNs.CollisionNs.b2ContactID
import typings.box2d.Box2DNs.CommonNs.MathNs.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Contacts.b2ContactResult")
@js.native
class b2ContactResult () extends js.Object {
  /**
  		* The contact id identifies the features in contact.
  		**/
  var id: b2ContactID = js.native
  /**
  		* Points from shape1 to shape2.
  		**/
  var normal: b2Vec2 = js.native
  /**
  		* The normal impulse applied to body2.
  		**/
  var normalImpulse: Double = js.native
  /**
  		* Position in world coordinates.
  		**/
  var position: b2Vec2 = js.native
  /**
  		* The first shape.
  		**/
  var shape1: b2Shape = js.native
  /**
  		* The second shape.
  		**/
  var shape2: b2Shape = js.native
  /**
  		* The tangent impulse applied to body2.
  		**/
  var tangentImpulse: Double = js.native
}


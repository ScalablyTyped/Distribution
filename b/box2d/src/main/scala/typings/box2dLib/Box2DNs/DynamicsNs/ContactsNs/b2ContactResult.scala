package typings
package box2dLib.Box2DNs.DynamicsNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Contacts.b2ContactResult")
@js.native
class b2ContactResult () extends js.Object {
  /**
  		* The contact id identifies the features in contact.
  		**/
  var id: box2dLib.Box2DNs.CollisionNs.b2ContactID = js.native
  /**
  		* Points from shape1 to shape2.
  		**/
  var normal: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The normal impulse applied to body2.
  		**/
  var normalImpulse: scala.Double = js.native
  /**
  		* Position in world coordinates.
  		**/
  var position: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The first shape.
  		**/
  var shape1: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape = js.native
  /**
  		* The second shape.
  		**/
  var shape2: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape = js.native
  /**
  		* The tangent impulse applied to body2.
  		**/
  var tangentImpulse: scala.Double = js.native
}


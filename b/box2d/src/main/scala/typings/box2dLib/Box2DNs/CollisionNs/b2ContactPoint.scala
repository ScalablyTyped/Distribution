package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2ContactPoint")
@js.native
class b2ContactPoint () extends js.Object {
  /**
  		* The combined friction coefficient.
  		**/
  var friction: scala.Double = js.native
  /**
  		* The contact id identifies the features in contact.
  		**/
  var id: b2ContactID = js.native
  /**
  		* Points from shape1 to shape2.
  		**/
  var normal: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Position in world coordinates.
  		**/
  var position: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The combined restitution coefficient.
  		**/
  var restitution: scala.Double = js.native
  /**
  		* The separation is negative when shapes are touching.
  		**/
  var separation: scala.Double = js.native
  /**
  		* The first shape.
  		**/
  var shape1: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape = js.native
  /**
  		* The second shape.
  		**/
  var shape2: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape = js.native
  /**
  		* Velocity of point on body2 relative to point on body1 (pre-solver).
  		**/
  var velocity: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
}


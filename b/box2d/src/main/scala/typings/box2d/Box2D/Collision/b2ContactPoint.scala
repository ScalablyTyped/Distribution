package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2ContactPoint")
@js.native
class b2ContactPoint () extends js.Object {
  /**
  		* The combined friction coefficient.
  		**/
  var friction: Double = js.native
  /**
  		* The contact id identifies the features in contact.
  		**/
  var id: b2ContactID = js.native
  /**
  		* Points from shape1 to shape2.
  		**/
  var normal: b2Vec2 = js.native
  /**
  		* Position in world coordinates.
  		**/
  var position: b2Vec2 = js.native
  /**
  		* The combined restitution coefficient.
  		**/
  var restitution: Double = js.native
  /**
  		* The separation is negative when shapes are touching.
  		**/
  var separation: Double = js.native
  /**
  		* The first shape.
  		**/
  var shape1: b2Shape = js.native
  /**
  		* The second shape.
  		**/
  var shape2: b2Shape = js.native
  /**
  		* Velocity of point on body2 relative to point on body1 (pre-solver).
  		**/
  var velocity: b2Vec2 = js.native
}


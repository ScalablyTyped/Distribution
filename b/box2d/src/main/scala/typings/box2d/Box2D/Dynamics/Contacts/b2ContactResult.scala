package typings.box2d.Box2D.Dynamics.Contacts

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Collision.b2ContactID
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2ContactResult extends js.Object {
  /**
    * The contact id identifies the features in contact.
    **/
  var id: b2ContactID
  /**
    * Points from shape1 to shape2.
    **/
  var normal: b2Vec2
  /**
    * The normal impulse applied to body2.
    **/
  var normalImpulse: Double
  /**
    * Position in world coordinates.
    **/
  var position: b2Vec2
  /**
    * The first shape.
    **/
  var shape1: b2Shape
  /**
    * The second shape.
    **/
  var shape2: b2Shape
  /**
    * The tangent impulse applied to body2.
    **/
  var tangentImpulse: Double
}

object b2ContactResult {
  @scala.inline
  def apply(
    id: b2ContactID,
    normal: b2Vec2,
    normalImpulse: Double,
    position: b2Vec2,
    shape1: b2Shape,
    shape2: b2Shape,
    tangentImpulse: Double
  ): b2ContactResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalImpulse = normalImpulse.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shape1 = shape1.asInstanceOf[js.Any], shape2 = shape2.asInstanceOf[js.Any], tangentImpulse = tangentImpulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactResult]
  }
}


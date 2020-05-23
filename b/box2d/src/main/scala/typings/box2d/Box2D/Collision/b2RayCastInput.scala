package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2RayCastInput extends js.Object {
  /**
    * Truncate the ray to reach up to this fraction from p1 to p2
    **/
  var maxFraction: Double
  /**
    * The start point of the ray.
    **/
  var p1: b2Vec2
  /**
    * The end point of the ray.
    **/
  var p2: b2Vec2
}

object b2RayCastInput {
  @scala.inline
  def apply(maxFraction: Double, p1: b2Vec2, p2: b2Vec2): b2RayCastInput = {
    val __obj = js.Dynamic.literal(maxFraction = maxFraction.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RayCastInput]
  }
}


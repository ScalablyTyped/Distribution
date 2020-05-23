package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2RayCastOutput extends js.Object {
  /**
    * The fraction between p1 and p2 that the collision occurs at.
    **/
  var fraction: Double
  /**
    * The normal at the point of collision.
    **/
  var normal: b2Vec2
}

object b2RayCastOutput {
  @scala.inline
  def apply(fraction: Double, normal: b2Vec2): b2RayCastOutput = {
    val __obj = js.Dynamic.literal(fraction = fraction.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RayCastOutput]
  }
}


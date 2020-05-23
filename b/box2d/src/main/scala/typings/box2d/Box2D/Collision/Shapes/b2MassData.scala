package typings.box2d.Box2D.Collision.Shapes

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2MassData extends js.Object {
  /**
    * The rotational inertia of the shape. This may be about the center or local origin, depending on usage.
    **/
  var I: Double
  /**
    * The position of the shape's centroid relative to the shape's origin.
    **/
  var center: b2Vec2
  /**
    * The mass of the shape, usually in kilograms.
    **/
  var mass: Double
}

object b2MassData {
  @scala.inline
  def apply(I: Double, center: b2Vec2, mass: Double): b2MassData = {
    val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2MassData]
  }
}


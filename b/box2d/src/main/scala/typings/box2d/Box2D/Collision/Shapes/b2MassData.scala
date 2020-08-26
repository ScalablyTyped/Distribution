package typings.box2d.Box2D.Collision.Shapes

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2MassData extends js.Object {
  /**
    * The rotational inertia of the shape. This may be about the center or local origin, depending on usage.
    **/
  var I: Double = js.native
  /**
    * The position of the shape's centroid relative to the shape's origin.
    **/
  var center: b2Vec2 = js.native
  /**
    * The mass of the shape, usually in kilograms.
    **/
  var mass: Double = js.native
}

object b2MassData {
  @scala.inline
  def apply(I: Double, center: b2Vec2, mass: Double): b2MassData = {
    val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2MassData]
  }
  @scala.inline
  implicit class b2MassDataOps[Self <: b2MassData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setI(value: Double): Self = this.set("I", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: b2Vec2): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
  }
  
}


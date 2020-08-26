package typings.box2d.Box2D.Dynamics.Contacts

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Collision.b2ContactID
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2ContactResult extends js.Object {
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
  @scala.inline
  implicit class b2ContactResultOps[Self <: b2ContactResult] (val x: Self) extends AnyVal {
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
    def setId(value: b2ContactID): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: b2Vec2): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalImpulse(value: Double): Self = this.set("normalImpulse", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: b2Vec2): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape1(value: b2Shape): Self = this.set("shape1", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape2(value: b2Shape): Self = this.set("shape2", value.asInstanceOf[js.Any])
    @scala.inline
    def setTangentImpulse(value: Double): Self = this.set("tangentImpulse", value.asInstanceOf[js.Any])
  }
  
}


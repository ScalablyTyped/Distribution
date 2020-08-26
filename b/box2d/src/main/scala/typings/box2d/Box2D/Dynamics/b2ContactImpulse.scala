package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2ContactImpulse extends js.Object {
  /**
    * Normal impulses.
    **/
  var normalImpulses: b2Vec2 = js.native
  /**
    * Tangent impulses.
    **/
  var tangentImpulses: b2Vec2 = js.native
}

object b2ContactImpulse {
  @scala.inline
  def apply(normalImpulses: b2Vec2, tangentImpulses: b2Vec2): b2ContactImpulse = {
    val __obj = js.Dynamic.literal(normalImpulses = normalImpulses.asInstanceOf[js.Any], tangentImpulses = tangentImpulses.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactImpulse]
  }
  @scala.inline
  implicit class b2ContactImpulseOps[Self <: b2ContactImpulse] (val x: Self) extends AnyVal {
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
    def setNormalImpulses(value: b2Vec2): Self = this.set("normalImpulses", value.asInstanceOf[js.Any])
    @scala.inline
    def setTangentImpulses(value: b2Vec2): Self = this.set("tangentImpulses", value.asInstanceOf[js.Any])
  }
  
}


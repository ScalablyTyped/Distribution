package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2ContactImpulse extends js.Object {
  /**
    * Normal impulses.
    **/
  var normalImpulses: b2Vec2
  /**
    * Tangent impulses.
    **/
  var tangentImpulses: b2Vec2
}

object b2ContactImpulse {
  @scala.inline
  def apply(normalImpulses: b2Vec2, tangentImpulses: b2Vec2): b2ContactImpulse = {
    val __obj = js.Dynamic.literal(normalImpulses = normalImpulses.asInstanceOf[js.Any], tangentImpulses = tangentImpulses.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactImpulse]
  }
}


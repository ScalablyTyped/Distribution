package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2ContactImpulse")
@js.native
class b2ContactImpulse ()
  extends typings.box2d.Box2D.Dynamics.b2ContactImpulse {
  /**
    * Normal impulses.
    **/
  /* CompleteClass */
  override var normalImpulses: b2Vec2 = js.native
  /**
    * Tangent impulses.
    **/
  /* CompleteClass */
  override var tangentImpulses: b2Vec2 = js.native
}


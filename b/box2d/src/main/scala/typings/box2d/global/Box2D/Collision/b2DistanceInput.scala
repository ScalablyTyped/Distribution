package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DistanceInput")
@js.native
class b2DistanceInput ()
  extends typings.box2d.Box2D.Collision.b2DistanceInput {
  /**
    * Proxy A
    **/
  /* CompleteClass */
  override var proxyA: typings.box2d.Box2D.Collision.b2DistanceProxy = js.native
  /**
    * Proxy B
    **/
  /* CompleteClass */
  override var proxyB: typings.box2d.Box2D.Collision.b2DistanceProxy = js.native
  /**
    * Transform A
    **/
  /* CompleteClass */
  override var transformA: b2Transform = js.native
  /**
    * Transform B
    **/
  /* CompleteClass */
  override var transformB: b2Transform = js.native
  /**
    * Use shape radii in computation?
    **/
  /* CompleteClass */
  override var useRadii: Boolean = js.native
}


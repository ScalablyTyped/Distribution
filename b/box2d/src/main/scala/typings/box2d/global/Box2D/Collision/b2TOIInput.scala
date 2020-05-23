package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Sweep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2TOIInput")
@js.native
class b2TOIInput ()
  extends typings.box2d.Box2D.Collision.b2TOIInput {
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
    * Sweep A
    **/
  /* CompleteClass */
  override var sweepA: b2Sweep = js.native
  /**
    * Sweep B
    **/
  /* CompleteClass */
  override var sweepB: b2Sweep = js.native
  /**
    * Tolerance
    **/
  /* CompleteClass */
  override var tolerance: Double = js.native
}


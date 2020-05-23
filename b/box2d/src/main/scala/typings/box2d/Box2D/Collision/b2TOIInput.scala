package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Sweep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2TOIInput extends js.Object {
  /**
    * Proxy A
    **/
  var proxyA: b2DistanceProxy
  /**
    * Proxy B
    **/
  var proxyB: b2DistanceProxy
  /**
    * Sweep A
    **/
  var sweepA: b2Sweep
  /**
    * Sweep B
    **/
  var sweepB: b2Sweep
  /**
    * Tolerance
    **/
  var tolerance: Double
}

object b2TOIInput {
  @scala.inline
  def apply(
    proxyA: b2DistanceProxy,
    proxyB: b2DistanceProxy,
    sweepA: b2Sweep,
    sweepB: b2Sweep,
    tolerance: Double
  ): b2TOIInput = {
    val __obj = js.Dynamic.literal(proxyA = proxyA.asInstanceOf[js.Any], proxyB = proxyB.asInstanceOf[js.Any], sweepA = sweepA.asInstanceOf[js.Any], sweepB = sweepB.asInstanceOf[js.Any], tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2TOIInput]
  }
}


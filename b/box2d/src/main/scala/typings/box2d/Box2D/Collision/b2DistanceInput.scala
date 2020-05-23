package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2DistanceInput extends js.Object {
  /**
    * Proxy A
    **/
  var proxyA: b2DistanceProxy
  /**
    * Proxy B
    **/
  var proxyB: b2DistanceProxy
  /**
    * Transform A
    **/
  var transformA: b2Transform
  /**
    * Transform B
    **/
  var transformB: b2Transform
  /**
    * Use shape radii in computation?
    **/
  var useRadii: Boolean
}

object b2DistanceInput {
  @scala.inline
  def apply(
    proxyA: b2DistanceProxy,
    proxyB: b2DistanceProxy,
    transformA: b2Transform,
    transformB: b2Transform,
    useRadii: Boolean
  ): b2DistanceInput = {
    val __obj = js.Dynamic.literal(proxyA = proxyA.asInstanceOf[js.Any], proxyB = proxyB.asInstanceOf[js.Any], transformA = transformA.asInstanceOf[js.Any], transformB = transformB.asInstanceOf[js.Any], useRadii = useRadii.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceInput]
  }
}


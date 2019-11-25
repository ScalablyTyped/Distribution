package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationResult extends js.Object {
  var accuracy: Double
  var point: Point
}

object GeolocationResult {
  @scala.inline
  def apply(accuracy: Double, point: Point): GeolocationResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeolocationResult]
  }
}


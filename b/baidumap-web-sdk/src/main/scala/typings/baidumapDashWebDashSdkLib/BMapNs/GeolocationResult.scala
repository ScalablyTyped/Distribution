package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationResult extends js.Object {
  var accuracy: scala.Double
  var point: Point
}

object GeolocationResult {
  @scala.inline
  def apply(accuracy: scala.Double, point: Point): GeolocationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("point")(point)
    __obj.asInstanceOf[GeolocationResult]
  }
}


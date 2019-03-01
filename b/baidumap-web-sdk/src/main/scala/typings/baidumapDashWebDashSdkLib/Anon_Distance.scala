package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Distance extends js.Object {
  var distance: scala.Double
  var points: js.Array[baidumapDashWebDashSdkLib.BMapNs.Point]
  var polylines: js.Array[baidumapDashWebDashSdkLib.BMapNs.Polyline]
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Distance {
  @scala.inline
  def apply(
    distance: scala.Double,
    points: js.Array[baidumapDashWebDashSdkLib.BMapNs.Point],
    polylines: js.Array[baidumapDashWebDashSdkLib.BMapNs.Polyline],
    target: js.Any,
    `type`: java.lang.String
  ): Anon_Distance = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("points")(points)
    __obj.updateDynamic("polylines")(polylines)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Distance]
  }
}


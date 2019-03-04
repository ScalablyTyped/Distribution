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
    val __obj = js.Dynamic.literal(distance = distance, points = points, polylines = polylines, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Distance]
  }
}


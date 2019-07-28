package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMapNs.Point
import typings.baidumapDashWebDashSdk.BMapNs.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Distance extends js.Object {
  var distance: Double
  var points: js.Array[Point]
  var polylines: js.Array[Polyline]
  var target: js.Any
  var `type`: String
}

object Anon_Distance {
  @scala.inline
  def apply(
    distance: Double,
    points: js.Array[Point],
    polylines: js.Array[Polyline],
    target: js.Any,
    `type`: String
  ): Anon_Distance = {
    val __obj = js.Dynamic.literal(distance = distance, points = points, polylines = polylines, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Distance]
  }
}


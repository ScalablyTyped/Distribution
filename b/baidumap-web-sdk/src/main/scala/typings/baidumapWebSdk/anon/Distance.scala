package typings.baidumapWebSdk.anon

import typings.baidumapWebSdk.BMap.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distance extends js.Object {
  var distance: Double = js.native
  var points: js.Array[typings.baidumapWebSdk.BMap.Point] = js.native
  var polylines: js.Array[Polyline] = js.native
  var target: js.Any = js.native
  var `type`: String = js.native
}

object Distance {
  @scala.inline
  def apply(
    distance: Double,
    points: js.Array[typings.baidumapWebSdk.BMap.Point],
    polylines: js.Array[Polyline],
    target: js.Any,
    `type`: String
  ): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], polylines = polylines.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  @scala.inline
  implicit class DistanceOps[Self <: Distance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: typings.baidumapWebSdk.BMap.Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[typings.baidumapWebSdk.BMap.Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolylinesVarargs(value: Polyline*): Self = this.set("polylines", js.Array(value :_*))
    @scala.inline
    def setPolylines(value: js.Array[Polyline]): Self = this.set("polylines", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


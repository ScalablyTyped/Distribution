package typings.cesium.anon

import typings.cesium.mod.Quaternion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstInnerQuadrangle extends js.Object {
  var firstInnerQuadrangle: js.UndefOr[Quaternion] = js.native
  var lastInnerQuadrangle: js.UndefOr[Quaternion] = js.native
  var points: js.Array[Quaternion] = js.native
  var times: js.Array[Double] = js.native
}

object FirstInnerQuadrangle {
  @scala.inline
  def apply(points: js.Array[Quaternion], times: js.Array[Double]): FirstInnerQuadrangle = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstInnerQuadrangle]
  }
  @scala.inline
  implicit class FirstInnerQuadrangleOps[Self <: FirstInnerQuadrangle] (val x: Self) extends AnyVal {
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
    def setPointsVarargs(value: Quaternion*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Quaternion]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimesVarargs(value: Double*): Self = this.set("times", js.Array(value :_*))
    @scala.inline
    def setTimes(value: js.Array[Double]): Self = this.set("times", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstInnerQuadrangle(value: Quaternion): Self = this.set("firstInnerQuadrangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstInnerQuadrangle: Self = this.set("firstInnerQuadrangle", js.undefined)
    @scala.inline
    def setLastInnerQuadrangle(value: Quaternion): Self = this.set("lastInnerQuadrangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastInnerQuadrangle: Self = this.set("lastInnerQuadrangle", js.undefined)
  }
  
}


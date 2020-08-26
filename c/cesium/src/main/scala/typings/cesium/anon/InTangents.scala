package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InTangents extends js.Object {
  var inTangents: js.Array[Cartesian3] = js.native
  var outTangents: js.Array[Cartesian3] = js.native
  var points: js.Array[Cartesian3] = js.native
  var times: js.Array[Double] = js.native
}

object InTangents {
  @scala.inline
  def apply(
    inTangents: js.Array[Cartesian3],
    outTangents: js.Array[Cartesian3],
    points: js.Array[Cartesian3],
    times: js.Array[Double]
  ): InTangents = {
    val __obj = js.Dynamic.literal(inTangents = inTangents.asInstanceOf[js.Any], outTangents = outTangents.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[InTangents]
  }
  @scala.inline
  implicit class InTangentsOps[Self <: InTangents] (val x: Self) extends AnyVal {
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
    def setInTangentsVarargs(value: Cartesian3*): Self = this.set("inTangents", js.Array(value :_*))
    @scala.inline
    def setInTangents(value: js.Array[Cartesian3]): Self = this.set("inTangents", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutTangentsVarargs(value: Cartesian3*): Self = this.set("outTangents", js.Array(value :_*))
    @scala.inline
    def setOutTangents(value: js.Array[Cartesian3]): Self = this.set("outTangents", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: Cartesian3*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Cartesian3]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimesVarargs(value: Double*): Self = this.set("times", js.Array(value :_*))
    @scala.inline
    def setTimes(value: js.Array[Double]): Self = this.set("times", value.asInstanceOf[js.Any])
  }
  
}


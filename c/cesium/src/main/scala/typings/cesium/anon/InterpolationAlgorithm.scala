package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationAlgorithm extends js.Object {
  var interpolationAlgorithm: js.UndefOr[typings.cesium.mod.InterpolationAlgorithm] = js.native
  var interpolationDegree: js.UndefOr[Double] = js.native
}

object InterpolationAlgorithm {
  @scala.inline
  def apply(): InterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationAlgorithm]
  }
  @scala.inline
  implicit class InterpolationAlgorithmOps[Self <: InterpolationAlgorithm] (val x: Self) extends AnyVal {
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
    def setInterpolationAlgorithm(value: typings.cesium.mod.InterpolationAlgorithm): Self = this.set("interpolationAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolationAlgorithm: Self = this.set("interpolationAlgorithm", js.undefined)
    @scala.inline
    def setInterpolationDegree(value: Double): Self = this.set("interpolationDegree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolationDegree: Self = this.set("interpolationDegree", js.undefined)
  }
  
}


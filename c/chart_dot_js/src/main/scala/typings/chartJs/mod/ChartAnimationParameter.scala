package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAnimationParameter extends js.Object {
  var animationObject: js.UndefOr[js.Any] = js.native
  var chartInstance: js.UndefOr[js.Any] = js.native
}

object ChartAnimationParameter {
  @scala.inline
  def apply(): ChartAnimationParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationParameter]
  }
  @scala.inline
  implicit class ChartAnimationParameterOps[Self <: ChartAnimationParameter] (val x: Self) extends AnyVal {
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
    def setAnimationObject(value: js.Any): Self = this.set("animationObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationObject: Self = this.set("animationObject", js.undefined)
    @scala.inline
    def setChartInstance(value: js.Any): Self = this.set("chartInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartInstance: Self = this.set("chartInstance", js.undefined)
  }
  
}


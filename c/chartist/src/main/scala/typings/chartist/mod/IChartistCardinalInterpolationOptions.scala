package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartistCardinalInterpolationOptions extends IChartistInterpolationOptions {
  var tension: js.UndefOr[Double] = js.native
}

object IChartistCardinalInterpolationOptions {
  @scala.inline
  def apply(): IChartistCardinalInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistCardinalInterpolationOptions]
  }
  @scala.inline
  implicit class IChartistCardinalInterpolationOptionsOps[Self <: IChartistCardinalInterpolationOptions] (val x: Self) extends AnyVal {
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
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
  }
  
}


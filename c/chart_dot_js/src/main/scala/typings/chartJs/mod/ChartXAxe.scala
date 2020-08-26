package typings.chartJs.mod

import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartXAxe extends CommonAxe {
  var distribution: js.UndefOr[linear | series] = js.native
}

object ChartXAxe {
  @scala.inline
  def apply(): ChartXAxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxe]
  }
  @scala.inline
  implicit class ChartXAxeOps[Self <: ChartXAxe] (val x: Self) extends AnyVal {
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
    def setDistribution(value: linear | series): Self = this.set("distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
  }
  
}


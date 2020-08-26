package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataBinMetrics extends js.Object {
  /* The average value of the aggregation property of the pushpins in a data bin. */
  var average: js.UndefOr[Double] = js.native
  /* The number of pushpins in a data bin. */
  var count: js.UndefOr[Double] = js.native
  /* The number of pushpins in the data bin who's aggregation property has a value. */
  var countNotBlank: js.UndefOr[Double] = js.native
  /* The number of pushpins in the data bin who's aggregation property is a valid number. */
  var countNumbers: js.UndefOr[Double] = js.native
  /* The sum of the aggregation property of the pushpins in a data bin.  */
  var sum: js.UndefOr[Double] = js.native
}

object IDataBinMetrics {
  @scala.inline
  def apply(): IDataBinMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataBinMetrics]
  }
  @scala.inline
  implicit class IDataBinMetricsOps[Self <: IDataBinMetrics] (val x: Self) extends AnyVal {
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
    def setAverage(value: Double): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCountNotBlank(value: Double): Self = this.set("countNotBlank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountNotBlank: Self = this.set("countNotBlank", js.undefined)
    @scala.inline
    def setCountNumbers(value: Double): Self = this.set("countNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountNumbers: Self = this.set("countNumbers", js.undefined)
    @scala.inline
    def setSum(value: Double): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
  }
  
}


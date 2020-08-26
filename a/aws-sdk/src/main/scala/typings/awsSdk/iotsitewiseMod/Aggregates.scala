package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregates extends js.Object {
  /**
    * The average (mean) value of the time series over a time interval window.
    */
  var average: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The count of data points in the time series over a time interval window.
    */
  var count: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The maximum value of the time series over a time interval window.
    */
  var maximum: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The minimum value of the time series over a time interval window.
    */
  var minimum: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The standard deviation of the time series over a time interval window.
    */
  var standardDeviation: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The sum of the time series over a time interval window.
    */
  var sum: js.UndefOr[AggregatedDoubleValue] = js.native
}

object Aggregates {
  @scala.inline
  def apply(): Aggregates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregates]
  }
  @scala.inline
  implicit class AggregatesOps[Self <: Aggregates] (val x: Self) extends AnyVal {
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
    def setAverage(value: AggregatedDoubleValue): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    @scala.inline
    def setCount(value: AggregatedDoubleValue): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setMaximum(value: AggregatedDoubleValue): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinimum(value: AggregatedDoubleValue): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setStandardDeviation(value: AggregatedDoubleValue): Self = this.set("standardDeviation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviation: Self = this.set("standardDeviation", js.undefined)
    @scala.inline
    def setSum(value: AggregatedDoubleValue): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
  }
  
}


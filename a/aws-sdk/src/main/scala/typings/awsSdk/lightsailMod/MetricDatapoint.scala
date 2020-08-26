package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDatapoint extends js.Object {
  /**
    * The average.
    */
  var average: js.UndefOr[double] = js.native
  /**
    * The maximum.
    */
  var maximum: js.UndefOr[double] = js.native
  /**
    * The minimum.
    */
  var minimum: js.UndefOr[double] = js.native
  /**
    * The sample count.
    */
  var sampleCount: js.UndefOr[double] = js.native
  /**
    * The sum.
    */
  var sum: js.UndefOr[double] = js.native
  /**
    * The timestamp (e.g., 1479816991.349).
    */
  var timestamp: js.UndefOr[typings.awsSdk.lightsailMod.timestamp] = js.native
  /**
    * The unit. 
    */
  var unit: js.UndefOr[MetricUnit] = js.native
}

object MetricDatapoint {
  @scala.inline
  def apply(): MetricDatapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDatapoint]
  }
  @scala.inline
  implicit class MetricDatapointOps[Self <: MetricDatapoint] (val x: Self) extends AnyVal {
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
    def setAverage(value: double): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    @scala.inline
    def setMaximum(value: double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinimum(value: double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setSampleCount(value: double): Self = this.set("sampleCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleCount: Self = this.set("sampleCount", js.undefined)
    @scala.inline
    def setSum(value: double): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    @scala.inline
    def setTimestamp(value: timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setUnit(value: MetricUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}


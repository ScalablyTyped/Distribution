package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datapoint extends js.Object {
  /**
    * The average of the metric values that correspond to the data point.
    */
  var Average: js.UndefOr[DatapointValue] = js.native
  /**
    * The percentile statistic for the data point.
    */
  var ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.native
  /**
    * The maximum metric value for the data point.
    */
  var Maximum: js.UndefOr[DatapointValue] = js.native
  /**
    * The minimum metric value for the data point.
    */
  var Minimum: js.UndefOr[DatapointValue] = js.native
  /**
    * The number of metric values that contributed to the aggregate value of this data point.
    */
  var SampleCount: js.UndefOr[DatapointValue] = js.native
  /**
    * The sum of the metric values for the data point.
    */
  var Sum: js.UndefOr[DatapointValue] = js.native
  /**
    * The time stamp used for the data point.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.cloudwatchMod.Timestamp] = js.native
  /**
    * The standard unit for the data point.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object Datapoint {
  @scala.inline
  def apply(): Datapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datapoint]
  }
  @scala.inline
  implicit class DatapointOps[Self <: Datapoint] (val x: Self) extends AnyVal {
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
    def setAverage(value: DatapointValue): Self = this.set("Average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("Average", js.undefined)
    @scala.inline
    def setExtendedStatistics(value: DatapointValueMap): Self = this.set("ExtendedStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedStatistics: Self = this.set("ExtendedStatistics", js.undefined)
    @scala.inline
    def setMaximum(value: DatapointValue): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("Maximum", js.undefined)
    @scala.inline
    def setMinimum(value: DatapointValue): Self = this.set("Minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("Minimum", js.undefined)
    @scala.inline
    def setSampleCount(value: DatapointValue): Self = this.set("SampleCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleCount: Self = this.set("SampleCount", js.undefined)
    @scala.inline
    def setSum(value: DatapointValue): Self = this.set("Sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("Sum", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
    @scala.inline
    def setUnit(value: StandardUnit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
  
}


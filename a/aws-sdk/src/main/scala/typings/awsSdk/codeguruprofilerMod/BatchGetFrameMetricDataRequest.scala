package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetFrameMetricDataRequest extends js.Object {
  /**
    *  The end time of the time period for the returned time series values. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The details of the metrics that are used to request a time series of values. The metric includes the name of the frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for the metric value of the frame.
    */
  var frameMetrics: js.UndefOr[FrameMetrics] = js.native
  /**
    *  The duration of the frame metrics used to return the time series values. Specify using the ISO 8601 format. The maximum period duration is one day (PT24H or P1D). 
    */
  var period: js.UndefOr[Period] = js.native
  /**
    *  The name of the profiling group associated with the the frame metrics used to return the time series values. 
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    *  The start time of the time period for the frame metrics used to return the time series values. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * The requested resolution of time steps for the returned time series of values. If the requested target resolution is not available due to data not being retained we provide a best effort result by falling back to the most granular available resolution after the target resolution. There are 3 valid values.     P1D — 1 day     PT1H — 1 hour     PT5M — 5 minutes   
    */
  var targetResolution: js.UndefOr[AggregationPeriod] = js.native
}

object BatchGetFrameMetricDataRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): BatchGetFrameMetricDataRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetFrameMetricDataRequest]
  }
  @scala.inline
  implicit class BatchGetFrameMetricDataRequestOps[Self <: BatchGetFrameMetricDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setFrameMetricsVarargs(value: FrameMetric*): Self = this.set("frameMetrics", js.Array(value :_*))
    @scala.inline
    def setFrameMetrics(value: FrameMetrics): Self = this.set("frameMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameMetrics: Self = this.set("frameMetrics", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTargetResolution(value: AggregationPeriod): Self = this.set("targetResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResolution: Self = this.set("targetResolution", js.undefined)
  }
  
}


package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentMetricSummary extends js.Object {
  /**
    * The average value of the metric.
    */
  var Avg: js.UndefOr[OptionalDouble] = js.native
  /**
    * The number of samples used to generate the metric.
    */
  var Count: js.UndefOr[OptionalInteger] = js.native
  /**
    * The most recent value of the metric.
    */
  var Last: js.UndefOr[OptionalDouble] = js.native
  /**
    * The maximum value of the metric.
    */
  var Max: js.UndefOr[OptionalDouble] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.sagemakerMod.MetricName] = js.native
  /**
    * The minimum value of the metric.
    */
  var Min: js.UndefOr[OptionalDouble] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  /**
    * The standard deviation of the metric.
    */
  var StdDev: js.UndefOr[OptionalDouble] = js.native
  /**
    * When the metric was last updated.
    */
  var TimeStamp: js.UndefOr[Timestamp] = js.native
}

object TrialComponentMetricSummary {
  @scala.inline
  def apply(): TrialComponentMetricSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentMetricSummary]
  }
  @scala.inline
  implicit class TrialComponentMetricSummaryOps[Self <: TrialComponentMetricSummary] (val x: Self) extends AnyVal {
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
    def setAvg(value: OptionalDouble): Self = this.set("Avg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvg: Self = this.set("Avg", js.undefined)
    @scala.inline
    def setCount(value: OptionalInteger): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setLast(value: OptionalDouble): Self = this.set("Last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("Last", js.undefined)
    @scala.inline
    def setMax(value: OptionalDouble): Self = this.set("Max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("Max", js.undefined)
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    @scala.inline
    def setMin(value: OptionalDouble): Self = this.set("Min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("Min", js.undefined)
    @scala.inline
    def setSourceArn(value: TrialComponentSourceArn): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
    @scala.inline
    def setStdDev(value: OptionalDouble): Self = this.set("StdDev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdDev: Self = this.set("StdDev", js.undefined)
    @scala.inline
    def setTimeStamp(value: Timestamp): Self = this.set("TimeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeStamp: Self = this.set("TimeStamp", js.undefined)
  }
  
}


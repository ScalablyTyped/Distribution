package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnomalyDetectorConfiguration extends js.Object {
  /**
    * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch creates the model.
    */
  var ExcludedTimeRanges: js.UndefOr[AnomalyDetectorExcludedTimeRanges] = js.native
  /**
    * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight savings time changes if the metric is sensitive to such time changes. To specify a time zone, use the name of the time zone as specified in the standard tz database. For more information, see tz database.
    */
  var MetricTimezone: js.UndefOr[AnomalyDetectorMetricTimezone] = js.native
}

object AnomalyDetectorConfiguration {
  @scala.inline
  def apply(): AnomalyDetectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetectorConfiguration]
  }
  @scala.inline
  implicit class AnomalyDetectorConfigurationOps[Self <: AnomalyDetectorConfiguration] (val x: Self) extends AnyVal {
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
    def setExcludedTimeRangesVarargs(value: Range*): Self = this.set("ExcludedTimeRanges", js.Array(value :_*))
    @scala.inline
    def setExcludedTimeRanges(value: AnomalyDetectorExcludedTimeRanges): Self = this.set("ExcludedTimeRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedTimeRanges: Self = this.set("ExcludedTimeRanges", js.undefined)
    @scala.inline
    def setMetricTimezone(value: AnomalyDetectorMetricTimezone): Self = this.set("MetricTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricTimezone: Self = this.set("MetricTimezone", js.undefined)
  }
  
}


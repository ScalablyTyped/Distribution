package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnomalyDetector extends js.Object {
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude from use for training the model, and the time zone to use for the metric.
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.native
  /**
    * The metric dimensions associated with the anomaly detection model.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The name of the metric associated with the anomaly detection model.
    */
  var MetricName: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricName] = js.native
  /**
    * The namespace of the metric associated with the anomaly detection model.
    */
  var Namespace: js.UndefOr[typings.awsSdk.cloudwatchMod.Namespace] = js.native
  /**
    * The statistic associated with the anomaly detection model.
    */
  var Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.native
  /**
    * The current status of the anomaly detector's training. The possible values are TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA 
    */
  var StateValue: js.UndefOr[AnomalyDetectorStateValue] = js.native
}

object AnomalyDetector {
  @scala.inline
  def apply(): AnomalyDetector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetector]
  }
  @scala.inline
  implicit class AnomalyDetectorOps[Self <: AnomalyDetector] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: AnomalyDetectorConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("Dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    @scala.inline
    def setStat(value: AnomalyDetectorMetricStat): Self = this.set("Stat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStat: Self = this.set("Stat", js.undefined)
    @scala.inline
    def setStateValue(value: AnomalyDetectorStateValue): Self = this.set("StateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateValue: Self = this.set("StateValue", js.undefined)
  }
  
}


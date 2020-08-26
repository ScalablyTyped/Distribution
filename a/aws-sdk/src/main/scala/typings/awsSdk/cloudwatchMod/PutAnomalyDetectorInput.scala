package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAnomalyDetectorInput extends js.Object {
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude when training and updating the model. You can specify as many as 10 time ranges. The configuration can also include the time zone to use for the metric. You can in
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.native
  /**
    * The metric dimensions to create the anomaly detection model for.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The name of the metric to create the anomaly detection model for.
    */
  var MetricName: typings.awsSdk.cloudwatchMod.MetricName = js.native
  /**
    * The namespace of the metric to create the anomaly detection model for.
    */
  var Namespace: typings.awsSdk.cloudwatchMod.Namespace = js.native
  /**
    * The statistic to use for the metric and the anomaly detection model.
    */
  var Stat: AnomalyDetectorMetricStat = js.native
}

object PutAnomalyDetectorInput {
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace, Stat: AnomalyDetectorMetricStat): PutAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAnomalyDetectorInput]
  }
  @scala.inline
  implicit class PutAnomalyDetectorInputOps[Self <: PutAnomalyDetectorInput] (val x: Self) extends AnyVal {
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
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setStat(value: AnomalyDetectorMetricStat): Self = this.set("Stat", value.asInstanceOf[js.Any])
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
  }
  
}


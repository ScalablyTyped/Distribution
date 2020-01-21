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
  var Stat: js.UndefOr[typings.awsSdk.cloudwatchMod.Stat] = js.native
}

object AnomalyDetector {
  @scala.inline
  def apply(
    Configuration: AnomalyDetectorConfiguration = null,
    Dimensions: Dimensions = null,
    MetricName: MetricName = null,
    Namespace: Namespace = null,
    Stat: Stat = null
  ): AnomalyDetector = {
    val __obj = js.Dynamic.literal()
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace.asInstanceOf[js.Any])
    if (Stat != null) __obj.updateDynamic("Stat")(Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyDetector]
  }
}


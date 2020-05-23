package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricTransformation extends js.Object {
  /**
    * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
    */
  var defaultValue: js.UndefOr[DefaultValue] = js.native
  /**
    * The name of the CloudWatch metric.
    */
  var metricName: MetricName = js.native
  /**
    * A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are similar. For more information, see Namespaces.
    */
  var metricNamespace: MetricNamespace = js.native
  /**
    * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
    */
  var metricValue: MetricValue = js.native
}

object MetricTransformation {
  @scala.inline
  def apply(
    metricName: MetricName,
    metricNamespace: MetricNamespace,
    metricValue: MetricValue,
    defaultValue: js.UndefOr[DefaultValue] = js.undefined
  ): MetricTransformation = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTransformation]
  }
}


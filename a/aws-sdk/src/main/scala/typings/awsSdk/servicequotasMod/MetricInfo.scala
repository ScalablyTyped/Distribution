package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricInfo extends js.Object {
  /**
    * A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific characteristics that describe it, and you can think of dimensions as categories for those characteristics. These dimensions are part of the CloudWatch Metric Identity that measures usage against a particular service quota.
    */
  var MetricDimensions: js.UndefOr[MetricDimensionsMapDefinition] = js.native
  /**
    * The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
    */
  var MetricName: js.UndefOr[QuotaMetricName] = js.native
  /**
    * The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name for the namespace when you create a metric.
    */
  var MetricNamespace: js.UndefOr[QuotaMetricNamespace] = js.native
  /**
    * Statistics are metric data aggregations over specified periods of time. This is the recommended statistic to use when comparing usage in the CloudWatch Metric against your Service Quota.
    */
  var MetricStatisticRecommendation: js.UndefOr[Statistic] = js.native
}

object MetricInfo {
  @scala.inline
  def apply(
    MetricDimensions: MetricDimensionsMapDefinition = null,
    MetricName: QuotaMetricName = null,
    MetricNamespace: QuotaMetricNamespace = null,
    MetricStatisticRecommendation: Statistic = null
  ): MetricInfo = {
    val __obj = js.Dynamic.literal()
    if (MetricDimensions != null) __obj.updateDynamic("MetricDimensions")(MetricDimensions.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (MetricNamespace != null) __obj.updateDynamic("MetricNamespace")(MetricNamespace.asInstanceOf[js.Any])
    if (MetricStatisticRecommendation != null) __obj.updateDynamic("MetricStatisticRecommendation")(MetricStatisticRecommendation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricInfo]
  }
}


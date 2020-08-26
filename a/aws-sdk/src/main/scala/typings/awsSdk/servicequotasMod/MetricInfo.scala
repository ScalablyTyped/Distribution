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
  def apply(): MetricInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricInfo]
  }
  @scala.inline
  implicit class MetricInfoOps[Self <: MetricInfo] (val x: Self) extends AnyVal {
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
    def setMetricDimensions(value: MetricDimensionsMapDefinition): Self = this.set("MetricDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricDimensions: Self = this.set("MetricDimensions", js.undefined)
    @scala.inline
    def setMetricName(value: QuotaMetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    @scala.inline
    def setMetricNamespace(value: QuotaMetricNamespace): Self = this.set("MetricNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricNamespace: Self = this.set("MetricNamespace", js.undefined)
    @scala.inline
    def setMetricStatisticRecommendation(value: Statistic): Self = this.set("MetricStatisticRecommendation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricStatisticRecommendation: Self = this.set("MetricStatisticRecommendation", js.undefined)
  }
  
}


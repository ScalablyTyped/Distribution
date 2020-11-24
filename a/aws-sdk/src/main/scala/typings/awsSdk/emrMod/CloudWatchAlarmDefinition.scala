package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchAlarmDefinition extends js.Object {
  
  /**
    * Determines how the metric specified by MetricName is compared to the value specified by Threshold.
    */
  var ComparisonOperator: typings.awsSdk.emrMod.ComparisonOperator = js.native
  
  /**
    * A CloudWatch metric dimension.
    */
  var Dimensions: js.UndefOr[MetricDimensionList] = js.native
  
  /**
    * The number of periods, in five-minute increments, during which the alarm condition must exist before the alarm triggers automatic scaling activity. The default value is 1.
    */
  var EvaluationPeriods: js.UndefOr[Integer] = js.native
  
  /**
    * The name of the CloudWatch metric that is watched to determine an alarm condition.
    */
  var MetricName: String = js.native
  
  /**
    * The namespace for the CloudWatch metric. The default is AWS/ElasticMapReduce.
    */
  var Namespace: js.UndefOr[String] = js.native
  
  /**
    * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify 300.
    */
  var Period: Integer = js.native
  
  /**
    * The statistic to apply to the metric associated with the alarm. The default is AVERAGE.
    */
  var Statistic: js.UndefOr[typings.awsSdk.emrMod.Statistic] = js.native
  
  /**
    * The value against which the specified statistic is compared.
    */
  var Threshold: NonNegativeDouble = js.native
  
  /**
    * The unit of measure associated with the CloudWatch metric being watched. The value specified for Unit must correspond to the units specified in the CloudWatch metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.emrMod.Unit] = js.native
}
object CloudWatchAlarmDefinition {
  
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    MetricName: String,
    Period: Integer,
    Threshold: NonNegativeDouble
  ): CloudWatchAlarmDefinition = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchAlarmDefinition]
  }
  
  @scala.inline
  implicit class CloudWatchAlarmDefinitionOps[Self <: CloudWatchAlarmDefinition] (val x: Self) extends AnyVal {
    
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
    def setComparisonOperator(value: ComparisonOperator): Self = this.set("ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: String): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Integer): Self = this.set("Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: NonNegativeDouble): Self = this.set("Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsVarargs(value: MetricDimension*): Self = this.set("Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: MetricDimensionList): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    
    @scala.inline
    def setEvaluationPeriods(value: Integer): Self = this.set("EvaluationPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationPeriods: Self = this.set("EvaluationPeriods", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    
    @scala.inline
    def setStatistic(value: Statistic): Self = this.set("Statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistic: Self = this.set("Statistic", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
}

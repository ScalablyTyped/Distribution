package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchAlarmConfiguration extends StObject {
  
  /**
    * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the comparison.
    */
  var ComparisonOperator: typings.awsSdk.route53Mod.ComparisonOperator
  
  /**
    * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the dimensions for the metric. For information, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide.
    */
  var Dimensions: js.UndefOr[DimensionList] = js.undefined
  
  /**
    * For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is compared to the threshold.
    */
  var EvaluationPeriods: typings.awsSdk.route53Mod.EvaluationPeriods
  
  /**
    * The name of the CloudWatch metric that the alarm is associated with.
    */
  var MetricName: typings.awsSdk.route53Mod.MetricName
  
  /**
    * The namespace of the metric that the alarm is associated with. For more information, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide.
    */
  var Namespace: typings.awsSdk.route53Mod.Namespace
  
  /**
    * For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in seconds.
    */
  var Period: typings.awsSdk.route53Mod.Period
  
  /**
    * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
    */
  var Statistic: typings.awsSdk.route53Mod.Statistic
  
  /**
    * For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
    */
  var Threshold: typings.awsSdk.route53Mod.Threshold
}
object CloudWatchAlarmConfiguration {
  
  inline def apply(
    ComparisonOperator: ComparisonOperator,
    EvaluationPeriods: EvaluationPeriods,
    MetricName: MetricName,
    Namespace: Namespace,
    Period: Period,
    Statistic: Statistic,
    Threshold: Threshold
  ): CloudWatchAlarmConfiguration = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], EvaluationPeriods = EvaluationPeriods.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchAlarmConfiguration]
  }
  
  extension [Self <: CloudWatchAlarmConfiguration](x: Self) {
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: DimensionList): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setEvaluationPeriods(value: EvaluationPeriods): Self = StObject.set(x, "EvaluationPeriods", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setStatistic(value: Statistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Threshold): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
  }
}

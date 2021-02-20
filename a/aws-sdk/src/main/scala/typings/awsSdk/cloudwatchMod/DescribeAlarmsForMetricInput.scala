package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAlarmsForMetricInput extends StObject {
  
  /**
    * The dimensions associated with the metric. If the metric has any associated dimensions, you must specify them in order for the call to succeed.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.native
  
  /**
    * The percentile statistic for the metric. Specify a value between p0.0 and p100.
    */
  var ExtendedStatistic: js.UndefOr[typings.awsSdk.cloudwatchMod.ExtendedStatistic] = js.native
  
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsSdk.cloudwatchMod.MetricName = js.native
  
  /**
    * The namespace of the metric.
    */
  var Namespace: typings.awsSdk.cloudwatchMod.Namespace = js.native
  
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var Period: js.UndefOr[typings.awsSdk.cloudwatchMod.Period] = js.native
  
  /**
    * The statistic for the metric, other than percentiles. For percentile statistics, use ExtendedStatistics.
    */
  var Statistic: js.UndefOr[typings.awsSdk.cloudwatchMod.Statistic] = js.native
  
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}
object DescribeAlarmsForMetricInput {
  
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace): DescribeAlarmsForMetricInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsForMetricInput]
  }
  
  @scala.inline
  implicit class DescribeAlarmsForMetricInputMutableBuilder[Self <: DescribeAlarmsForMetricInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setExtendedStatistic(value: ExtendedStatistic): Self = StObject.set(x, "ExtendedStatistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatisticUndefined: Self = StObject.set(x, "ExtendedStatistic", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    @scala.inline
    def setStatistic(value: Statistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
    
    @scala.inline
    def setUnit(value: StandardUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}

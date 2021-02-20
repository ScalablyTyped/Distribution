package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDatum extends StObject {
  
  /**
    * Array of numbers that is used along with the Values array. Each number in the Count array is the number of times the corresponding value in the Values array occurred during the period.  If you omit the Counts array, the default of 1 is used as the value for each count. If you include a Counts array, it must include the same amount of values as the Values array.
    */
  var Counts: js.UndefOr[typings.awsSdk.cloudwatchMod.Counts] = js.native
  
  /**
    * The dimensions associated with the metric.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.native
  
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsSdk.cloudwatchMod.MetricName = js.native
  
  /**
    * The statistical values for the metric.
    */
  var StatisticValues: js.UndefOr[StatisticSet] = js.native
  
  /**
    * Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies this metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently, high resolution is available only for custom metrics. For more information about high-resolution metrics, see High-Resolution Metrics in the Amazon CloudWatch User Guide.  This field is optional, if you do not specify it the default of 60 is used.
    */
  var StorageResolution: js.UndefOr[typings.awsSdk.cloudwatchMod.StorageResolution] = js.native
  
  /**
    * The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.cloudwatchMod.Timestamp] = js.native
  
  /**
    * When you are using a Put operation, this defines what unit you want to use when storing the metric. In a Get operation, this displays the unit that is used for the metric.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
  
  /**
    * The value for the metric. Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of -2^360 to 2^360. In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
    */
  var Value: js.UndefOr[DatapointValue] = js.native
  
  /**
    * Array of numbers representing the values for the metric during the period. Each unique value is listed just once in this array, and the corresponding number in the Counts array specifies the number of times that value occurred during the period. You can include up to 150 unique values in each PutMetricData action that specifies a Values array. Although the Values array accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of -2^360 to 2^360. In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
    */
  var Values: js.UndefOr[typings.awsSdk.cloudwatchMod.Values] = js.native
}
object MetricDatum {
  
  @scala.inline
  def apply(MetricName: MetricName): MetricDatum = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDatum]
  }
  
  @scala.inline
  implicit class MetricDatumMutableBuilder[Self <: MetricDatum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounts(value: Counts): Self = StObject.set(x, "Counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "Counts", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: DatapointValue*): Self = StObject.set(x, "Counts", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticValues(value: StatisticSet): Self = StObject.set(x, "StatisticValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticValuesUndefined: Self = StObject.set(x, "StatisticValues", js.undefined)
    
    @scala.inline
    def setStorageResolution(value: StorageResolution): Self = StObject.set(x, "StorageResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageResolutionUndefined: Self = StObject.set(x, "StorageResolution", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setUnit(value: StandardUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    @scala.inline
    def setValue(value: DatapointValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    @scala.inline
    def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DatapointValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}

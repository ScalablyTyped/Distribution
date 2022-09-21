package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchMetricsDetail extends StObject {
  
  /**
    *  An array of CloudWatch dimensions associated with 
    */
  var Dimensions: js.UndefOr[CloudWatchMetricsDimensions] = js.undefined
  
  /**
    * This object returns anomaly metric data.
    */
  var MetricDataSummary: js.UndefOr[CloudWatchMetricsDataSummary] = js.undefined
  
  /**
    *  The name of the CloudWatch metric. 
    */
  var MetricName: js.UndefOr[CloudWatchMetricsMetricName] = js.undefined
  
  /**
    *  The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics. 
    */
  var Namespace: js.UndefOr[CloudWatchMetricsNamespace] = js.undefined
  
  /**
    *  The length of time associated with the CloudWatch metric in number of seconds. 
    */
  var Period: js.UndefOr[CloudWatchMetricsPeriod] = js.undefined
  
  /**
    *  The type of statistic associated with the CloudWatch metric. For more information, see Statistics in the Amazon CloudWatch User Guide. 
    */
  var Stat: js.UndefOr[CloudWatchMetricsStat] = js.undefined
  
  /**
    *  The unit of measure used for the CloudWatch metric. For example, Bytes, Seconds, Count, and Percent. 
    */
  var Unit: js.UndefOr[CloudWatchMetricsUnit] = js.undefined
}
object CloudWatchMetricsDetail {
  
  inline def apply(): CloudWatchMetricsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchMetricsDetail]
  }
  
  extension [Self <: CloudWatchMetricsDetail](x: Self) {
    
    inline def setDimensions(value: CloudWatchMetricsDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: CloudWatchMetricsDimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricDataSummary(value: CloudWatchMetricsDataSummary): Self = StObject.set(x, "MetricDataSummary", value.asInstanceOf[js.Any])
    
    inline def setMetricDataSummaryUndefined: Self = StObject.set(x, "MetricDataSummary", js.undefined)
    
    inline def setMetricName(value: CloudWatchMetricsMetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: CloudWatchMetricsNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setPeriod(value: CloudWatchMetricsPeriod): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setStat(value: CloudWatchMetricsStat): Self = StObject.set(x, "Stat", value.asInstanceOf[js.Any])
    
    inline def setStatUndefined: Self = StObject.set(x, "Stat", js.undefined)
    
    inline def setUnit(value: CloudWatchMetricsUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}

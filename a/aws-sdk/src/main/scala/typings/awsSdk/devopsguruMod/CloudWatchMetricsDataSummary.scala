package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchMetricsDataSummary extends StObject {
  
  /**
    * This is an enum of the status showing whether the metric value pair list has partial or complete data, or if there was an error.
    */
  var StatusCode: js.UndefOr[CloudWatchMetricDataStatusCode] = js.undefined
  
  /**
    * This is a list of Amazon CloudWatch metric values at given timestamp.
    */
  var TimestampMetricValuePairList: js.UndefOr[typings.awsSdk.devopsguruMod.TimestampMetricValuePairList] = js.undefined
}
object CloudWatchMetricsDataSummary {
  
  inline def apply(): CloudWatchMetricsDataSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchMetricsDataSummary]
  }
  
  extension [Self <: CloudWatchMetricsDataSummary](x: Self) {
    
    inline def setStatusCode(value: CloudWatchMetricDataStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    
    inline def setTimestampMetricValuePairList(value: TimestampMetricValuePairList): Self = StObject.set(x, "TimestampMetricValuePairList", value.asInstanceOf[js.Any])
    
    inline def setTimestampMetricValuePairListUndefined: Self = StObject.set(x, "TimestampMetricValuePairList", js.undefined)
    
    inline def setTimestampMetricValuePairListVarargs(value: TimestampMetricValuePair*): Self = StObject.set(x, "TimestampMetricValuePairList", js.Array(value*))
  }
}

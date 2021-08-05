package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetFrameMetricDataRequest extends StObject {
  
  /**
    *  The end time of the time period for the returned time series values. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The details of the metrics that are used to request a time series of values. The metric includes the name of the frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for the metric value of the frame.
    */
  var frameMetrics: js.UndefOr[FrameMetrics] = js.undefined
  
  /**
    *  The duration of the frame metrics used to return the time series values. Specify using the ISO 8601 format. The maximum period duration is one day (PT24H or P1D). 
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    *  The name of the profiling group associated with the the frame metrics used to return the time series values. 
    */
  var profilingGroupName: ProfilingGroupName
  
  /**
    *  The start time of the time period for the frame metrics used to return the time series values. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The requested resolution of time steps for the returned time series of values. If the requested target resolution is not available due to data not being retained we provide a best effort result by falling back to the most granular available resolution after the target resolution. There are 3 valid values.     P1D — 1 day     PT1H — 1 hour     PT5M — 5 minutes   
    */
  var targetResolution: js.UndefOr[AggregationPeriod] = js.undefined
}
object BatchGetFrameMetricDataRequest {
  
  inline def apply(profilingGroupName: ProfilingGroupName): BatchGetFrameMetricDataRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetFrameMetricDataRequest]
  }
  
  extension [Self <: BatchGetFrameMetricDataRequest](x: Self) {
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFrameMetrics(value: FrameMetrics): Self = StObject.set(x, "frameMetrics", value.asInstanceOf[js.Any])
    
    inline def setFrameMetricsUndefined: Self = StObject.set(x, "frameMetrics", js.undefined)
    
    inline def setFrameMetricsVarargs(value: FrameMetric*): Self = StObject.set(x, "frameMetrics", js.Array(value :_*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTargetResolution(value: AggregationPeriod): Self = StObject.set(x, "targetResolution", value.asInstanceOf[js.Any])
    
    inline def setTargetResolutionUndefined: Self = StObject.set(x, "targetResolution", js.undefined)
  }
}

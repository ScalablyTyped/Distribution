package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetFrameMetricDataResponse extends StObject {
  
  /**
    *  The end time of the time period for the returned time series values. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: Timestamp = js.native
  
  /**
    *  List of instances, or time steps, in the time series. For example, if the period is one day (PT24H)), and the resolution is five minutes (PT5M), then there are 288 endTimes in the list that are each five minutes appart. 
    */
  var endTimes: ListOfTimestamps = js.native
  
  /**
    * Details of the metrics to request a time series of values. The metric includes the name of the frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for the metric value of the frame.
    */
  var frameMetricData: FrameMetricData = js.native
  
  /**
    * Resolution or granularity of the profile data used to generate the time series. This is the value used to jump through time steps in a time series. There are 3 valid values.     P1D — 1 day     PT1H — 1 hour     PT5M — 5 minutes   
    */
  var resolution: AggregationPeriod = js.native
  
  /**
    *  The start time of the time period for the returned time series values. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: Timestamp = js.native
  
  /**
    * List of instances which remained unprocessed. This will create a missing time step in the list of end times.
    */
  var unprocessedEndTimes: UnprocessedEndTimeMap = js.native
}
object BatchGetFrameMetricDataResponse {
  
  @scala.inline
  def apply(
    endTime: Timestamp,
    endTimes: ListOfTimestamps,
    frameMetricData: FrameMetricData,
    resolution: AggregationPeriod,
    startTime: Timestamp,
    unprocessedEndTimes: UnprocessedEndTimeMap
  ): BatchGetFrameMetricDataResponse = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], endTimes = endTimes.asInstanceOf[js.Any], frameMetricData = frameMetricData.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], unprocessedEndTimes = unprocessedEndTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetFrameMetricDataResponse]
  }
  
  @scala.inline
  implicit class BatchGetFrameMetricDataResponseMutableBuilder[Self <: BatchGetFrameMetricDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimes(value: ListOfTimestamps): Self = StObject.set(x, "endTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimesVarargs(value: TimestampStructure*): Self = StObject.set(x, "endTimes", js.Array(value :_*))
    
    @scala.inline
    def setFrameMetricData(value: FrameMetricData): Self = StObject.set(x, "frameMetricData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameMetricDataVarargs(value: FrameMetricDatum*): Self = StObject.set(x, "frameMetricData", js.Array(value :_*))
    
    @scala.inline
    def setResolution(value: AggregationPeriod): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedEndTimes(value: UnprocessedEndTimeMap): Self = StObject.set(x, "unprocessedEndTimes", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDataResult extends StObject {
  
  /**
    * The short name you specified to represent this metric.
    */
  var Id: js.UndefOr[MetricId] = js.undefined
  
  /**
    * The human-readable label associated with the data.
    */
  var Label: js.UndefOr[MetricLabel] = js.undefined
  
  /**
    * A list of messages with additional information about the data returned.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.undefined
  
  /**
    * The status of the returned data. Complete indicates that all data points in the requested time range were returned. PartialData means that an incomplete set of data points were returned. You can use the NextToken value that was returned and repeat your request to get more data points. NextToken is not returned if you are performing a math expression. InternalError indicates that an error occurred. Retry your request using NextToken, if present.
    */
  var StatusCode: js.UndefOr[typings.awsSdk.cloudwatchMod.StatusCode] = js.undefined
  
  /**
    * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches the number of values and the value for Timestamps[x] is Values[x].
    */
  var Timestamps: js.UndefOr[typings.awsSdk.cloudwatchMod.Timestamps] = js.undefined
  
  /**
    * The data points for the metric corresponding to Timestamps. The number of values always matches the number of timestamps and the timestamp for Values[x] is Timestamps[x].
    */
  var Values: js.UndefOr[DatapointValues] = js.undefined
}
object MetricDataResult {
  
  @scala.inline
  def apply(): MetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDataResult]
  }
  
  @scala.inline
  implicit class MetricDataResultMutableBuilder[Self <: MetricDataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: MetricId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLabel(value: MetricLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    @scala.inline
    def setMessages(value: MetricDataResultMessages): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: MessageData*): Self = StObject.set(x, "Messages", js.Array(value :_*))
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Timestamps): Self = StObject.set(x, "Timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampsUndefined: Self = StObject.set(x, "Timestamps", js.undefined)
    
    @scala.inline
    def setTimestampsVarargs(value: Timestamp*): Self = StObject.set(x, "Timestamps", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: DatapointValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DatapointValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}

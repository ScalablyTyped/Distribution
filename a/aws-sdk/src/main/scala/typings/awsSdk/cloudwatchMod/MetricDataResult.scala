package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDataResult extends js.Object {
  
  /**
    * The short name you specified to represent this metric.
    */
  var Id: js.UndefOr[MetricId] = js.native
  
  /**
    * The human-readable label associated with the data.
    */
  var Label: js.UndefOr[MetricLabel] = js.native
  
  /**
    * A list of messages with additional information about the data returned.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.native
  
  /**
    * The status of the returned data. Complete indicates that all data points in the requested time range were returned. PartialData means that an incomplete set of data points were returned. You can use the NextToken value that was returned and repeat your request to get more data points. NextToken is not returned if you are performing a math expression. InternalError indicates that an error occurred. Retry your request using NextToken, if present.
    */
  var StatusCode: js.UndefOr[typings.awsSdk.cloudwatchMod.StatusCode] = js.native
  
  /**
    * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches the number of values and the value for Timestamps[x] is Values[x].
    */
  var Timestamps: js.UndefOr[typings.awsSdk.cloudwatchMod.Timestamps] = js.native
  
  /**
    * The data points for the metric corresponding to Timestamps. The number of values always matches the number of timestamps and the timestamp for Values[x] is Timestamps[x].
    */
  var Values: js.UndefOr[DatapointValues] = js.native
}
object MetricDataResult {
  
  @scala.inline
  def apply(): MetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDataResult]
  }
  
  @scala.inline
  implicit class MetricDataResultOps[Self <: MetricDataResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: MetricId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLabel(value: MetricLabel): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: MessageData*): Self = this.set("Messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: MetricDataResultMessages): Self = this.set("Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("StatusCode", js.undefined)
    
    @scala.inline
    def setTimestampsVarargs(value: Timestamp*): Self = this.set("Timestamps", js.Array(value :_*))
    
    @scala.inline
    def setTimestamps(value: Timestamps): Self = this.set("Timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("Timestamps", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DatapointValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: DatapointValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}

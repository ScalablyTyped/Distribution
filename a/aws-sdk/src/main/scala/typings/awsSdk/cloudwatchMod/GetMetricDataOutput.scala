package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetricDataOutput extends js.Object {
  
  /**
    * Contains a message about this GetMetricData operation, if the operation results in such a message. An example of a message that might be returned is Maximum number of allowed metrics exceeded. If there is a message, as much of the operation as possible is still executed. A message appears here only if it is related to the global GetMetricData operation. Any message about a specific metric returned by the operation appears in the MetricDataResult object returned for that metric.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.native
  
  /**
    * The metrics that are returned, including the metric name, namespace, and dimensions.
    */
  var MetricDataResults: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricDataResults] = js.native
  
  /**
    * A token that marks the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}
object GetMetricDataOutput {
  
  @scala.inline
  def apply(): GetMetricDataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricDataOutput]
  }
  
  @scala.inline
  implicit class GetMetricDataOutputOps[Self <: GetMetricDataOutput] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: MessageData*): Self = this.set("Messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: MetricDataResultMessages): Self = this.set("Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
    
    @scala.inline
    def setMetricDataResultsVarargs(value: MetricDataResult*): Self = this.set("MetricDataResults", js.Array(value :_*))
    
    @scala.inline
    def setMetricDataResults(value: MetricDataResults): Self = this.set("MetricDataResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricDataResults: Self = this.set("MetricDataResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

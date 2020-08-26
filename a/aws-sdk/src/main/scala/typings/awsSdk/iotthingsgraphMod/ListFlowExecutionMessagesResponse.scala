package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFlowExecutionMessagesResponse extends js.Object {
  /**
    * A list of objects that contain information about events in the specified flow execution.
    */
  var messages: js.UndefOr[FlowExecutionMessages] = js.native
  /**
    * The string to specify as nextToken when you request the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListFlowExecutionMessagesResponse {
  @scala.inline
  def apply(): ListFlowExecutionMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowExecutionMessagesResponse]
  }
  @scala.inline
  implicit class ListFlowExecutionMessagesResponseOps[Self <: ListFlowExecutionMessagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessagesVarargs(value: FlowExecutionMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: FlowExecutionMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityScheduledEventDetails extends js.Object {
  
  /**
    * The maximum allowed duration between two heartbeats for the activity task.
    */
  var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
  
  /**
    * The JSON data input to the activity task. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  
  /**
    * Contains details about the input for an execution history event.
    */
  var inputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the scheduled activity.
    */
  var resource: Arn = js.native
  
  /**
    * The maximum allowed duration of the activity task.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
}
object ActivityScheduledEventDetails {
  
  @scala.inline
  def apply(resource: Arn): ActivityScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityScheduledEventDetails]
  }
  
  @scala.inline
  implicit class ActivityScheduledEventDetailsOps[Self <: ActivityScheduledEventDetails] (val x: Self) extends AnyVal {
    
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
    def setResource(value: Arn): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatInSeconds(value: TimeoutInSeconds): Self = this.set("heartbeatInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatInSeconds: Self = this.set("heartbeatInSeconds", js.undefined)
    
    @scala.inline
    def setInput(value: SensitiveData): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputDetails(value: HistoryEventExecutionDataDetails): Self = this.set("inputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDetails: Self = this.set("inputDetails", js.undefined)
    
    @scala.inline
    def setTimeoutInSeconds(value: TimeoutInSeconds): Self = this.set("timeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("timeoutInSeconds", js.undefined)
  }
}

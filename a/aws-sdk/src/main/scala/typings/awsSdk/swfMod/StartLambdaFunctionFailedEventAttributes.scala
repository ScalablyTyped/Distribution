package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartLambdaFunctionFailedEventAttributes extends js.Object {
  
  /**
    * The cause of the failure. To help diagnose issues, use this information to trace back the chain of events leading up to this event.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because the IAM role attached to the execution lacked sufficient permissions. For details and example IAM policies, see Lambda Tasks in the Amazon SWF Developer Guide. 
    */
  var cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.native
  
  /**
    * A description that can help diagnose the cause of the fault.
    */
  var message: js.UndefOr[CauseMessage] = js.native
  
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: js.UndefOr[EventId] = js.native
}
object StartLambdaFunctionFailedEventAttributes {
  
  @scala.inline
  def apply(): StartLambdaFunctionFailedEventAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLambdaFunctionFailedEventAttributes]
  }
  
  @scala.inline
  implicit class StartLambdaFunctionFailedEventAttributesOps[Self <: StartLambdaFunctionFailedEventAttributes] (val x: Self) extends AnyVal {
    
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
    def setCause(value: StartLambdaFunctionFailedCause): Self = this.set("cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    
    @scala.inline
    def setMessage(value: CauseMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setScheduledEventId(value: EventId): Self = this.set("scheduledEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledEventId: Self = this.set("scheduledEventId", js.undefined)
  }
}

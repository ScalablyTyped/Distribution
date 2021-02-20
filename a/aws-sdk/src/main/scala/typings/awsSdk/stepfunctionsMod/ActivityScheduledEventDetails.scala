package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityScheduledEventDetails extends StObject {
  
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
  implicit class ActivityScheduledEventDetailsMutableBuilder[Self <: ActivityScheduledEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeartbeatInSeconds(value: TimeoutInSeconds): Self = StObject.set(x, "heartbeatInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatInSecondsUndefined: Self = StObject.set(x, "heartbeatInSeconds", js.undefined)
    
    @scala.inline
    def setInput(value: SensitiveData): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "inputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDetailsUndefined: Self = StObject.set(x, "inputDetails", js.undefined)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setResource(value: Arn): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInSeconds(value: TimeoutInSeconds): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
  }
}

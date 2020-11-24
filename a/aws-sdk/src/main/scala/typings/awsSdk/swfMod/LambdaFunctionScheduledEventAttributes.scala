package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaFunctionScheduledEventAttributes extends js.Object {
  
  /**
    * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
    */
  var control: js.UndefOr[Data] = js.native
  
  /**
    * The ID of the LambdaFunctionCompleted event corresponding to the decision that resulted in scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  
  /**
    * The unique ID of the Lambda task.
    */
  var id: FunctionId = js.native
  
  /**
    * The input provided to the Lambda task.
    */
  var input: js.UndefOr[FunctionInput] = js.native
  
  /**
    * The name of the Lambda function.
    */
  var name: FunctionName = js.native
  
  /**
    * The maximum amount of time a worker can take to process the Lambda task.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
}
object LambdaFunctionScheduledEventAttributes {
  
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, id: FunctionId, name: FunctionName): LambdaFunctionScheduledEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionScheduledEventAttributes]
  }
  
  @scala.inline
  implicit class LambdaFunctionScheduledEventAttributesOps[Self <: LambdaFunctionScheduledEventAttributes] (val x: Self) extends AnyVal {
    
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
    def setDecisionTaskCompletedEventId(value: EventId): Self = this.set("decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FunctionId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FunctionName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: Data): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setInput(value: FunctionInput): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setStartToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("startToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartToCloseTimeout: Self = this.set("startToCloseTimeout", js.undefined)
  }
}

package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleLambdaFunctionDecisionAttributes extends js.Object {
  
  /**
    * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
    */
  var control: js.UndefOr[Data] = js.native
  
  /**
    * A string that identifies the Lambda function execution in the event history.
    */
  var id: FunctionId = js.native
  
  /**
    * The optional input data to be supplied to the Lambda function.
    */
  var input: js.UndefOr[FunctionInput] = js.native
  
  /**
    * The name, or ARN, of the Lambda function to schedule.
    */
  var name: FunctionName = js.native
  
  /**
    * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started. This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
}
object ScheduleLambdaFunctionDecisionAttributes {
  
  @scala.inline
  def apply(id: FunctionId, name: FunctionName): ScheduleLambdaFunctionDecisionAttributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleLambdaFunctionDecisionAttributes]
  }
  
  @scala.inline
  implicit class ScheduleLambdaFunctionDecisionAttributesOps[Self <: ScheduleLambdaFunctionDecisionAttributes] (val x: Self) extends AnyVal {
    
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

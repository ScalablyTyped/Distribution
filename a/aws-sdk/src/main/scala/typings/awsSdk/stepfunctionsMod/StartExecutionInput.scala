package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartExecutionInput extends js.Object {
  /**
    * The string that contains the JSON input data for the execution, for example:  "input": "{\"first_name\" : \"test\"}"   If you don't include any JSON input data, you still must include the two braces, for example: "input": "{}"  
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The name of the execution. This name must be unique for your AWS account, region, and state machine for 90 days. For more information, see  Limits Related to State Machine Executions in the AWS Step Functions Developer Guide. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of the state machine to execute.
    */
  var stateMachineArn: Arn = js.native
}

object StartExecutionInput {
  @scala.inline
  def apply(stateMachineArn: Arn): StartExecutionInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExecutionInput]
  }
  @scala.inline
  implicit class StartExecutionInputOps[Self <: StartExecutionInput] (val x: Self) extends AnyVal {
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
    def setStateMachineArn(value: Arn): Self = this.set("stateMachineArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: SensitiveData): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


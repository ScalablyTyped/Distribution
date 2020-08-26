package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepFunctionsAction extends js.Object {
  /**
    * (Optional) A name will be given to the state machine execution consisting of this prefix followed by a UUID. Step Functions automatically creates a unique name for each state machine execution if one is not provided.
    */
  var executionNamePrefix: js.UndefOr[ExecutionNamePrefix] = js.native
  /**
    * The ARN of the role that grants IoT permission to start execution of a state machine ("Action":"states:StartExecution").
    */
  var roleArn: AwsArn = js.native
  /**
    * The name of the Step Functions state machine whose execution will be started.
    */
  var stateMachineName: StateMachineName = js.native
}

object StepFunctionsAction {
  @scala.inline
  def apply(roleArn: AwsArn, stateMachineName: StateMachineName): StepFunctionsAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], stateMachineName = stateMachineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepFunctionsAction]
  }
  @scala.inline
  implicit class StepFunctionsActionOps[Self <: StepFunctionsAction] (val x: Self) extends AnyVal {
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
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateMachineName(value: StateMachineName): Self = this.set("stateMachineName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionNamePrefix(value: ExecutionNamePrefix): Self = this.set("executionNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionNamePrefix: Self = this.set("executionNamePrefix", js.undefined)
  }
  
}


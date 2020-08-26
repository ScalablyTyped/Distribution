package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStateMachineForExecutionOutput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition = js.native
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.native
  /**
    * The name of the state machine associated with the execution.
    */
  var name: Name = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution. 
    */
  var roleArn: Arn = js.native
  /**
    * The Amazon Resource Name (ARN) of the state machine associated with the execution.
    */
  var stateMachineArn: Arn = js.native
  /**
    * The date and time the state machine associated with an execution was updated. For a newly created state machine, this is the creation date.
    */
  var updateDate: Timestamp = js.native
}

object DescribeStateMachineForExecutionOutput {
  @scala.inline
  def apply(definition: Definition, name: Name, roleArn: Arn, stateMachineArn: Arn, updateDate: Timestamp): DescribeStateMachineForExecutionOutput = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], updateDate = updateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineForExecutionOutput]
  }
  @scala.inline
  implicit class DescribeStateMachineForExecutionOutputOps[Self <: DescribeStateMachineForExecutionOutput] (val x: Self) extends AnyVal {
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
    def setDefinition(value: Definition): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateMachineArn(value: Arn): Self = this.set("stateMachineArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateDate(value: Timestamp): Self = this.set("updateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = this.set("loggingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfiguration: Self = this.set("loggingConfiguration", js.undefined)
  }
  
}


package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionListItem extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that id entifies the execution.
    */
  var executionArn: Arn = js.native
  /**
    * The name of the execution. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name = js.native
  /**
    * The date the execution started.
    */
  var startDate: Timestamp = js.native
  /**
    * The Amazon Resource Name (ARN) of the executed state machine.
    */
  var stateMachineArn: Arn = js.native
  /**
    * The current status of the execution.
    */
  var status: ExecutionStatus = js.native
  /**
    * If the execution already ended, the date the execution stopped.
    */
  var stopDate: js.UndefOr[Timestamp] = js.native
}

object ExecutionListItem {
  @scala.inline
  def apply(executionArn: Arn, name: Name, startDate: Timestamp, stateMachineArn: Arn, status: ExecutionStatus): ExecutionListItem = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionListItem]
  }
  @scala.inline
  implicit class ExecutionListItemOps[Self <: ExecutionListItem] (val x: Self) extends AnyVal {
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
    def setExecutionArn(value: Arn): Self = this.set("executionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: Timestamp): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateMachineArn(value: Arn): Self = this.set("stateMachineArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopDate(value: Timestamp): Self = this.set("stopDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopDate: Self = this.set("stopDate", js.undefined)
  }
  
}


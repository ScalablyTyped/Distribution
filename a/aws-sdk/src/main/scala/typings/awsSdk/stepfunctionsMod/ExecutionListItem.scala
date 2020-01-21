package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionListItem extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn = js.native
  /**
    * The name of the execution. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
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
  def apply(
    executionArn: Arn,
    name: Name,
    startDate: Timestamp,
    stateMachineArn: Arn,
    status: ExecutionStatus,
    stopDate: Timestamp = null
  ): ExecutionListItem = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (stopDate != null) __obj.updateDynamic("stopDate")(stopDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionListItem]
  }
}


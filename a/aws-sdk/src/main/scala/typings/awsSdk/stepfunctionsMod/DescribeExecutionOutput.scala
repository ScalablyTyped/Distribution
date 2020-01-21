package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExecutionOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn = js.native
  /**
    * The string that contains the JSON input data of the execution.
    */
  var input: SensitiveData = js.native
  /**
    * The name of the execution. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The JSON output data of the execution.  This field is set only if the execution succeeds. If the execution fails, this field is null. 
    */
  var output: js.UndefOr[SensitiveData] = js.native
  /**
    * The date the execution is started.
    */
  var startDate: Timestamp = js.native
  /**
    * The Amazon Resource Name (ARN) of the executed stated machine.
    */
  var stateMachineArn: Arn = js.native
  /**
    * The current status of the execution.
    */
  var status: ExecutionStatus = js.native
  /**
    * If the execution has already ended, the date the execution stopped.
    */
  var stopDate: js.UndefOr[Timestamp] = js.native
}

object DescribeExecutionOutput {
  @scala.inline
  def apply(
    executionArn: Arn,
    input: SensitiveData,
    startDate: Timestamp,
    stateMachineArn: Arn,
    status: ExecutionStatus,
    name: Name = null,
    output: SensitiveData = null,
    stopDate: Timestamp = null
  ): DescribeExecutionOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (stopDate != null) __obj.updateDynamic("stopDate")(stopDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExecutionOutput]
  }
}


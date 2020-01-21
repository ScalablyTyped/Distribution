package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStateMachineOutput extends js.Object {
  /**
    * The date the state machine is created.
    */
  var creationDate: Timestamp = js.native
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition = js.native
  /**
    * 
    */
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.native
  /**
    * The name of the state machine. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains security by granting Step Functions access to AWS resources.)
    */
  var roleArn: Arn = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the state machine.
    */
  var stateMachineArn: Arn = js.native
  /**
    * The current status of the state machine.
    */
  var status: js.UndefOr[StateMachineStatus] = js.native
  /**
    * 
    */
  var `type`: StateMachineType = js.native
}

object DescribeStateMachineOutput {
  @scala.inline
  def apply(
    creationDate: Timestamp,
    definition: Definition,
    name: Name,
    roleArn: Arn,
    stateMachineArn: Arn,
    `type`: StateMachineType,
    loggingConfiguration: LoggingConfiguration = null,
    status: StateMachineStatus = null
  ): DescribeStateMachineOutput = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loggingConfiguration != null) __obj.updateDynamic("loggingConfiguration")(loggingConfiguration.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineOutput]
  }
}


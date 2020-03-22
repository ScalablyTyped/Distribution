package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStateMachineInput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition = js.native
  /**
    * Defines what execution history events are logged and where they are logged.  By default, the level is set to OFF. For more information see Log Levels in the AWS Step Functions User Guide. 
    */
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.native
  /**
    * The name of the state machine.  A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
    */
  var roleArn: Arn = js.native
  /**
    * Tags to be added when creating a state machine. An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide, and Controlling Access Using IAM Tags. Tags may only contain Unicode letters, digits, white space, or these symbols: _ . : / = + - @.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Determines whether a Standard or Express state machine is created. The default is STANDARD. You cannot update the type of a state machine once it has been created.
    */
  var `type`: js.UndefOr[StateMachineType] = js.native
}

object CreateStateMachineInput {
  @scala.inline
  def apply(
    definition: Definition,
    name: Name,
    roleArn: Arn,
    loggingConfiguration: LoggingConfiguration = null,
    tags: TagList = null,
    `type`: StateMachineType = null
  ): CreateStateMachineInput = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (loggingConfiguration != null) __obj.updateDynamic("loggingConfiguration")(loggingConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStateMachineInput]
  }
}


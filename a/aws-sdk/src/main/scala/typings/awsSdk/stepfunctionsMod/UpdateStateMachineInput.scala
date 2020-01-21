package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStateMachineInput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: js.UndefOr[Definition] = js.native
  /**
    * 
    */
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the state machine.
    */
  var roleArn: js.UndefOr[Arn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the state machine.
    */
  var stateMachineArn: Arn = js.native
}

object UpdateStateMachineInput {
  @scala.inline
  def apply(
    stateMachineArn: Arn,
    definition: Definition = null,
    loggingConfiguration: LoggingConfiguration = null,
    roleArn: Arn = null
  ): UpdateStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (loggingConfiguration != null) __obj.updateDynamic("loggingConfiguration")(loggingConfiguration.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStateMachineInput]
  }
}


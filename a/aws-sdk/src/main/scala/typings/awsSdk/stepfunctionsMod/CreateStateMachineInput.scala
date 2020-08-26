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
  def apply(definition: Definition, name: Name, roleArn: Arn): CreateStateMachineInput = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStateMachineInput]
  }
  @scala.inline
  implicit class CreateStateMachineInputOps[Self <: CreateStateMachineInput] (val x: Self) extends AnyVal {
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
    def setLoggingConfiguration(value: LoggingConfiguration): Self = this.set("loggingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfiguration: Self = this.set("loggingConfiguration", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setType(value: StateMachineType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.native
  
  /**
    * The name of the state machine. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
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
    * Selects whether AWS X-Ray tracing is enabled.
    */
  var tracingConfiguration: js.UndefOr[TracingConfiguration] = js.native
  
  /**
    * The type of the state machine (STANDARD or EXPRESS).
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
    `type`: StateMachineType
  ): DescribeStateMachineOutput = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineOutput]
  }
  
  @scala.inline
  implicit class DescribeStateMachineOutputOps[Self <: DescribeStateMachineOutput] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: Definition): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMachineArn(value: Arn): Self = this.set("stateMachineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: StateMachineType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = this.set("loggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfiguration: Self = this.set("loggingConfiguration", js.undefined)
    
    @scala.inline
    def setStatus(value: StateMachineStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTracingConfiguration(value: TracingConfiguration): Self = this.set("tracingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracingConfiguration: Self = this.set("tracingConfiguration", js.undefined)
  }
}

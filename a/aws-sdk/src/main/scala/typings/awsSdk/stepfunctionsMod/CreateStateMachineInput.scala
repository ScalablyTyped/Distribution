package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStateMachineInput extends StObject {
  
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition
  
  /**
    * Defines what execution history events are logged and where they are logged.  By default, the level is set to OFF. For more information see Log Levels in the AWS Step Functions User Guide. 
    */
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
  
  /**
    * The name of the state machine.  A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
    */
  var roleArn: Arn
  
  /**
    * Tags to be added when creating a state machine. An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide, and Controlling Access Using IAM Tags. Tags may only contain Unicode letters, digits, white space, or these symbols: _ . : / = + - @.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Selects whether AWS X-Ray tracing is enabled.
    */
  var tracingConfiguration: js.UndefOr[TracingConfiguration] = js.undefined
  
  /**
    * Determines whether a Standard or Express state machine is created. The default is STANDARD. You cannot update the type of a state machine once it has been created.
    */
  var `type`: js.UndefOr[StateMachineType] = js.undefined
}
object CreateStateMachineInput {
  
  @scala.inline
  def apply(definition: Definition, name: Name, roleArn: Arn): CreateStateMachineInput = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStateMachineInput]
  }
  
  @scala.inline
  implicit class CreateStateMachineInputMutableBuilder[Self <: CreateStateMachineInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigurationUndefined: Self = StObject.set(x, "loggingConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTracingConfiguration(value: TracingConfiguration): Self = StObject.set(x, "tracingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingConfigurationUndefined: Self = StObject.set(x, "tracingConfiguration", js.undefined)
    
    @scala.inline
    def setType(value: StateMachineType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

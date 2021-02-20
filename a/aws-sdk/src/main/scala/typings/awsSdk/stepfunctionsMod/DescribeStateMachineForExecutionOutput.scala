package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStateMachineForExecutionOutput extends StObject {
  
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
    * Selects whether AWS X-Ray tracing is enabled.
    */
  var tracingConfiguration: js.UndefOr[TracingConfiguration] = js.native
  
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
  implicit class DescribeStateMachineForExecutionOutputMutableBuilder[Self <: DescribeStateMachineForExecutionOutput] (val x: Self) extends AnyVal {
    
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
    def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingConfiguration(value: TracingConfiguration): Self = StObject.set(x, "tracingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingConfigurationUndefined: Self = StObject.set(x, "tracingConfiguration", js.undefined)
    
    @scala.inline
    def setUpdateDate(value: Timestamp): Self = StObject.set(x, "updateDate", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStateMachineForExecutionOutput extends StObject {
  
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition
  
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
  
  /**
    * The name of the state machine associated with the execution.
    */
  var name: Name
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution. 
    */
  var roleArn: Arn
  
  /**
    * The Amazon Resource Name (ARN) of the state machine associated with the execution.
    */
  var stateMachineArn: Arn
  
  /**
    * Selects whether AWS X-Ray tracing is enabled.
    */
  var tracingConfiguration: js.UndefOr[TracingConfiguration] = js.undefined
  
  /**
    * The date and time the state machine associated with an execution was updated. For a newly created state machine, this is the creation date.
    */
  var updateDate: js.Date
}
object DescribeStateMachineForExecutionOutput {
  
  inline def apply(definition: Definition, name: Name, roleArn: Arn, stateMachineArn: Arn, updateDate: js.Date): DescribeStateMachineForExecutionOutput = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], updateDate = updateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineForExecutionOutput]
  }
  
  extension [Self <: DescribeStateMachineForExecutionOutput](x: Self) {
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "loggingConfiguration", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setTracingConfiguration(value: TracingConfiguration): Self = StObject.set(x, "tracingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTracingConfigurationUndefined: Self = StObject.set(x, "tracingConfiguration", js.undefined)
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "updateDate", value.asInstanceOf[js.Any])
  }
}

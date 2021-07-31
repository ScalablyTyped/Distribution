package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepFunctionsAction extends StObject {
  
  /**
    * (Optional) A name will be given to the state machine execution consisting of this prefix followed by a UUID. Step Functions automatically creates a unique name for each state machine execution if one is not provided.
    */
  var executionNamePrefix: js.UndefOr[ExecutionNamePrefix] = js.undefined
  
  /**
    * The ARN of the role that grants IoT permission to start execution of a state machine ("Action":"states:StartExecution").
    */
  var roleArn: AwsArn
  
  /**
    * The name of the Step Functions state machine whose execution will be started.
    */
  var stateMachineName: StateMachineName
}
object StepFunctionsAction {
  
  @scala.inline
  def apply(roleArn: AwsArn, stateMachineName: StateMachineName): StepFunctionsAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], stateMachineName = stateMachineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepFunctionsAction]
  }
  
  @scala.inline
  implicit class StepFunctionsActionMutableBuilder[Self <: StepFunctionsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionNamePrefix(value: ExecutionNamePrefix): Self = StObject.set(x, "executionNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNamePrefixUndefined: Self = StObject.set(x, "executionNamePrefix", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMachineName(value: StateMachineName): Self = StObject.set(x, "stateMachineName", value.asInstanceOf[js.Any])
  }
}

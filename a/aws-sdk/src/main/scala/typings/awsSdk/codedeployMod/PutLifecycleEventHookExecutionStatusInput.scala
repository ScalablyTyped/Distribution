package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutLifecycleEventHookExecutionStatusInput extends StObject {
  
  /**
    *  The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  
  /**
    *  The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the hooks section of the AppSpec file. 
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.native
  
  /**
    * The result of a Lambda function that validates a deployment lifecycle event (Succeeded or Failed).
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.native
}
object PutLifecycleEventHookExecutionStatusInput {
  
  @scala.inline
  def apply(): PutLifecycleEventHookExecutionStatusInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
  }
  
  @scala.inline
  implicit class PutLifecycleEventHookExecutionStatusInputMutableBuilder[Self <: PutLifecycleEventHookExecutionStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setLifecycleEventHookExecutionId(value: LifecycleEventHookExecutionId): Self = StObject.set(x, "lifecycleEventHookExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleEventHookExecutionIdUndefined: Self = StObject.set(x, "lifecycleEventHookExecutionId", js.undefined)
    
    @scala.inline
    def setStatus(value: LifecycleEventStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

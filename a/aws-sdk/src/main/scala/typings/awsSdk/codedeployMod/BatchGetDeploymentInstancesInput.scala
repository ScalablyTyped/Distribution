package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetDeploymentInstancesInput extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
  
  /**
    * The unique IDs of instances used in the deployment. The maximum number of instance IDs you can specify is 25.
    */
  var instanceIds: InstancesList = js.native
}
object BatchGetDeploymentInstancesInput {
  
  @scala.inline
  def apply(deploymentId: DeploymentId, instanceIds: InstancesList): BatchGetDeploymentInstancesInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], instanceIds = instanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentInstancesInput]
  }
  
  @scala.inline
  implicit class BatchGetDeploymentInstancesInputMutableBuilder[Self <: BatchGetDeploymentInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIds(value: InstancesList): Self = StObject.set(x, "instanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "instanceIds", js.Array(value :_*))
  }
}

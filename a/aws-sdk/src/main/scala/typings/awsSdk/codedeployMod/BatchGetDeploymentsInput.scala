package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentsInput extends StObject {
  
  /**
    *  A list of deployment IDs, separated by spaces. The maximum number of deployment IDs you can specify is 25.
    */
  var deploymentIds: DeploymentsList
}
object BatchGetDeploymentsInput {
  
  inline def apply(deploymentIds: DeploymentsList): BatchGetDeploymentsInput = {
    val __obj = js.Dynamic.literal(deploymentIds = deploymentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentsInput]
  }
  
  extension [Self <: BatchGetDeploymentsInput](x: Self) {
    
    inline def setDeploymentIds(value: DeploymentsList): Self = StObject.set(x, "deploymentIds", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdsVarargs(value: DeploymentId*): Self = StObject.set(x, "deploymentIds", js.Array(value*))
  }
}

package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentsInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.  If applicationName is specified, then deploymentGroupName must be specified. If it is not specified, then deploymentGroupName must not be specified.  
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * A time range (start and end) for returning a subset of the list of deployments.
    */
  var createTimeRange: js.UndefOr[TimeRange] = js.undefined
  
  /**
    * The name of a deployment group for the specified application.  If deploymentGroupName is specified, then applicationName must be specified. If it is not specified, then applicationName must not be specified.  
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
  
  /**
    * The unique ID of an external resource for returning deployments linked to the external resource.
    */
  var externalId: js.UndefOr[ExternalId] = js.undefined
  
  /**
    * A subset of deployments to list by status:    Created: Include created deployments in the resulting list.    Queued: Include queued deployments in the resulting list.    In Progress: Include in-progress deployments in the resulting list.    Succeeded: Include successful deployments in the resulting list.    Failed: Include failed deployments in the resulting list.    Stopped: Include stopped deployments in the resulting list.  
    */
  var includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.undefined
  
  /**
    * An identifier returned from the previous list deployments call. It can be used to return the next set of deployments in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDeploymentsInput {
  
  inline def apply(): ListDeploymentsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsInput]
  }
  
  extension [Self <: ListDeploymentsInput](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setCreateTimeRange(value: TimeRange): Self = StObject.set(x, "createTimeRange", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeRangeUndefined: Self = StObject.set(x, "createTimeRange", js.undefined)
    
    inline def setDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupNameUndefined: Self = StObject.set(x, "deploymentGroupName", js.undefined)
    
    inline def setExternalId(value: ExternalId): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setIncludeOnlyStatuses(value: DeploymentStatusList): Self = StObject.set(x, "includeOnlyStatuses", value.asInstanceOf[js.Any])
    
    inline def setIncludeOnlyStatusesUndefined: Self = StObject.set(x, "includeOnlyStatuses", js.undefined)
    
    inline def setIncludeOnlyStatusesVarargs(value: DeploymentStatus*): Self = StObject.set(x, "includeOnlyStatuses", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentsInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.  If applicationName is specified, then deploymentGroupName must be specified. If it is not specified, then deploymentGroupName must not be specified.  
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  
  /**
    * A time range (start and end) for returning a subset of the list of deployments.
    */
  var createTimeRange: js.UndefOr[TimeRange] = js.native
  
  /**
    * The name of a deployment group for the specified application.  If deploymentGroupName is specified, then applicationName must be specified. If it is not specified, then applicationName must not be specified.  
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  
  /**
    * The unique ID of an external resource for returning deployments linked to the external resource.
    */
  var externalId: js.UndefOr[ExternalId] = js.native
  
  /**
    * A subset of deployments to list by status:    Created: Include created deployments in the resulting list.    Queued: Include queued deployments in the resulting list.    In Progress: Include in-progress deployments in the resulting list.    Succeeded: Include successful deployments in the resulting list.    Failed: Include failed deployments in the resulting list.    Stopped: Include stopped deployments in the resulting list.  
    */
  var includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.native
  
  /**
    * An identifier returned from the previous list deployments call. It can be used to return the next set of deployments in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDeploymentsInput {
  
  @scala.inline
  def apply(): ListDeploymentsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsInput]
  }
  
  @scala.inline
  implicit class ListDeploymentsInputMutableBuilder[Self <: ListDeploymentsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setCreateTimeRange(value: TimeRange): Self = StObject.set(x, "createTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeRangeUndefined: Self = StObject.set(x, "createTimeRange", js.undefined)
    
    @scala.inline
    def setDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupNameUndefined: Self = StObject.set(x, "deploymentGroupName", js.undefined)
    
    @scala.inline
    def setExternalId(value: ExternalId): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setIncludeOnlyStatuses(value: DeploymentStatusList): Self = StObject.set(x, "includeOnlyStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeOnlyStatusesUndefined: Self = StObject.set(x, "includeOnlyStatuses", js.undefined)
    
    @scala.inline
    def setIncludeOnlyStatusesVarargs(value: DeploymentStatus*): Self = StObject.set(x, "includeOnlyStatuses", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

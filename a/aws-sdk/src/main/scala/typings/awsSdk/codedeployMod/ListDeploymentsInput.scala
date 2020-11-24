package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentsInput extends js.Object {
  
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
  implicit class ListDeploymentsInputOps[Self <: ListDeploymentsInput] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setCreateTimeRange(value: TimeRange): Self = this.set("createTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTimeRange: Self = this.set("createTimeRange", js.undefined)
    
    @scala.inline
    def setDeploymentGroupName(value: DeploymentGroupName): Self = this.set("deploymentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentGroupName: Self = this.set("deploymentGroupName", js.undefined)
    
    @scala.inline
    def setExternalId(value: ExternalId): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setIncludeOnlyStatusesVarargs(value: DeploymentStatus*): Self = this.set("includeOnlyStatuses", js.Array(value :_*))
    
    @scala.inline
    def setIncludeOnlyStatuses(value: DeploymentStatusList): Self = this.set("includeOnlyStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeOnlyStatuses: Self = this.set("includeOnlyStatuses", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}

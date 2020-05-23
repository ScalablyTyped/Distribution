package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    applicationName: ApplicationName = null,
    createTimeRange: TimeRange = null,
    deploymentGroupName: DeploymentGroupName = null,
    externalId: ExternalId = null,
    includeOnlyStatuses: DeploymentStatusList = null,
    nextToken: NextToken = null
  ): ListDeploymentsInput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (createTimeRange != null) __obj.updateDynamic("createTimeRange")(createTimeRange.asInstanceOf[js.Any])
    if (deploymentGroupName != null) __obj.updateDynamic("deploymentGroupName")(deploymentGroupName.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (includeOnlyStatuses != null) __obj.updateDynamic("includeOnlyStatuses")(includeOnlyStatuses.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentsInput]
  }
}


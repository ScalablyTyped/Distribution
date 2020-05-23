package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationTarget extends js.Object {
  /**
    * The unique ID of an AWS CloudFormation blue/green deployment.
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  The date and time when the target application was updated by an AWS CloudFormation blue/green deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.native
  /**
    *  The lifecycle events of the AWS CloudFormation blue/green deployment to this target application. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  /**
    * The resource type for the AWS CloudFormation blue/green deployment.
    */
  var resourceType: js.UndefOr[CloudFormationResourceType] = js.native
  /**
    *  The status of an AWS CloudFormation blue/green deployment's target application. 
    */
  var status: js.UndefOr[TargetStatus] = js.native
  /**
    *  The unique ID of a deployment target that has a type of CloudFormationTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
  /**
    * The percentage of production traffic that the target version of an AWS CloudFormation blue/green deployment receives.
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.native
}

object CloudFormationTarget {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    lastUpdatedAt: Time = null,
    lifecycleEvents: LifecycleEventList = null,
    resourceType: CloudFormationResourceType = null,
    status: TargetStatus = null,
    targetId: TargetId = null,
    targetVersionWeight: js.UndefOr[TrafficWeight] = js.undefined
  ): CloudFormationTarget = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (lifecycleEvents != null) __obj.updateDynamic("lifecycleEvents")(lifecycleEvents.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (!js.isUndefined(targetVersionWeight)) __obj.updateDynamic("targetVersionWeight")(targetVersionWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationTarget]
  }
}


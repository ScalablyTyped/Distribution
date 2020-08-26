package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentTargetsOutput extends js.Object {
  /**
    *  A list of target objects for a deployment. Each target object contains details about the target, such as its status and lifecycle events. The type of the target objects depends on the deployment' compute platform.     EC2/On-premises: Each target object is an EC2 or on-premises instance.     AWS Lambda: The target object is a specific version of an AWS Lambda function.     Amazon ECS: The target object is an Amazon ECS service.     CloudFormation: The target object is an AWS CloudFormation blue/green deployment.   
    */
  var deploymentTargets: js.UndefOr[DeploymentTargetList] = js.native
}

object BatchGetDeploymentTargetsOutput {
  @scala.inline
  def apply(): BatchGetDeploymentTargetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentTargetsOutput]
  }
  @scala.inline
  implicit class BatchGetDeploymentTargetsOutputOps[Self <: BatchGetDeploymentTargetsOutput] (val x: Self) extends AnyVal {
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
    def setDeploymentTargetsVarargs(value: DeploymentTarget*): Self = this.set("deploymentTargets", js.Array(value :_*))
    @scala.inline
    def setDeploymentTargets(value: DeploymentTargetList): Self = this.set("deploymentTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentTargets: Self = this.set("deploymentTargets", js.undefined)
  }
  
}


package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetDeploymentTargetsInput extends js.Object {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  
  /**
    *  The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the targets and their formats. The maximum number of deployment target IDs you can specify is 25.    For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances IDs, and their target type is instanceTarget.     For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and their target type is instanceTarget.     For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and services specified using the format &lt;clustername&gt;:&lt;servicename&gt;. Their target type is ecsTarget.     For deployments that are deployed with AWS CloudFormation, the target IDs are CloudFormation stack IDs. Their target type is cloudFormationTarget.   
    */
  var targetIds: js.UndefOr[TargetIdList] = js.native
}
object BatchGetDeploymentTargetsInput {
  
  @scala.inline
  def apply(): BatchGetDeploymentTargetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentTargetsInput]
  }
  
  @scala.inline
  implicit class BatchGetDeploymentTargetsInputOps[Self <: BatchGetDeploymentTargetsInput] (val x: Self) extends AnyVal {
    
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
    def setDeploymentId(value: DeploymentId): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    
    @scala.inline
    def setTargetIdsVarargs(value: TargetId*): Self = this.set("targetIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetIds(value: TargetIdList): Self = this.set("targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetIds: Self = this.set("targetIds", js.undefined)
  }
}

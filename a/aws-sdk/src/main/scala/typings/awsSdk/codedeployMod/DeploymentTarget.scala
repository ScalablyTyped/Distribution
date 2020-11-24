package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentTarget extends js.Object {
  
  var cloudFormationTarget: js.UndefOr[CloudFormationTarget] = js.native
  
  /**
    * The deployment type that is specific to the deployment's compute platform or deployments initiated by a CloudFormation stack update.
    */
  var deploymentTargetType: js.UndefOr[DeploymentTargetType] = js.native
  
  /**
    *  Information about the target for a deployment that uses the Amazon ECS compute platform. 
    */
  var ecsTarget: js.UndefOr[ECSTarget] = js.native
  
  /**
    *  Information about the target for a deployment that uses the EC2/On-premises compute platform. 
    */
  var instanceTarget: js.UndefOr[InstanceTarget] = js.native
  
  /**
    *  Information about the target for a deployment that uses the AWS Lambda compute platform. 
    */
  var lambdaTarget: js.UndefOr[LambdaTarget] = js.native
}
object DeploymentTarget {
  
  @scala.inline
  def apply(): DeploymentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentTarget]
  }
  
  @scala.inline
  implicit class DeploymentTargetOps[Self <: DeploymentTarget] (val x: Self) extends AnyVal {
    
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
    def setCloudFormationTarget(value: CloudFormationTarget): Self = this.set("cloudFormationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFormationTarget: Self = this.set("cloudFormationTarget", js.undefined)
    
    @scala.inline
    def setDeploymentTargetType(value: DeploymentTargetType): Self = this.set("deploymentTargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentTargetType: Self = this.set("deploymentTargetType", js.undefined)
    
    @scala.inline
    def setEcsTarget(value: ECSTarget): Self = this.set("ecsTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcsTarget: Self = this.set("ecsTarget", js.undefined)
    
    @scala.inline
    def setInstanceTarget(value: InstanceTarget): Self = this.set("instanceTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTarget: Self = this.set("instanceTarget", js.undefined)
    
    @scala.inline
    def setLambdaTarget(value: LambdaTarget): Self = this.set("lambdaTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaTarget: Self = this.set("lambdaTarget", js.undefined)
  }
}

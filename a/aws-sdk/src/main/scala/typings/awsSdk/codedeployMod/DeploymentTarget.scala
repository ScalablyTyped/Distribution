package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentTarget extends StObject {
  
  var cloudFormationTarget: js.UndefOr[CloudFormationTarget] = js.undefined
  
  /**
    * The deployment type that is specific to the deployment's compute platform or deployments initiated by a CloudFormation stack update.
    */
  var deploymentTargetType: js.UndefOr[DeploymentTargetType] = js.undefined
  
  /**
    *  Information about the target for a deployment that uses the Amazon ECS compute platform. 
    */
  var ecsTarget: js.UndefOr[ECSTarget] = js.undefined
  
  /**
    *  Information about the target for a deployment that uses the EC2/On-premises compute platform. 
    */
  var instanceTarget: js.UndefOr[InstanceTarget] = js.undefined
  
  /**
    *  Information about the target for a deployment that uses the AWS Lambda compute platform. 
    */
  var lambdaTarget: js.UndefOr[LambdaTarget] = js.undefined
}
object DeploymentTarget {
  
  @scala.inline
  def apply(): DeploymentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentTarget]
  }
  
  @scala.inline
  implicit class DeploymentTargetMutableBuilder[Self <: DeploymentTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFormationTarget(value: CloudFormationTarget): Self = StObject.set(x, "cloudFormationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFormationTargetUndefined: Self = StObject.set(x, "cloudFormationTarget", js.undefined)
    
    @scala.inline
    def setDeploymentTargetType(value: DeploymentTargetType): Self = StObject.set(x, "deploymentTargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTargetTypeUndefined: Self = StObject.set(x, "deploymentTargetType", js.undefined)
    
    @scala.inline
    def setEcsTarget(value: ECSTarget): Self = StObject.set(x, "ecsTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsTargetUndefined: Self = StObject.set(x, "ecsTarget", js.undefined)
    
    @scala.inline
    def setInstanceTarget(value: InstanceTarget): Self = StObject.set(x, "instanceTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTargetUndefined: Self = StObject.set(x, "instanceTarget", js.undefined)
    
    @scala.inline
    def setLambdaTarget(value: LambdaTarget): Self = StObject.set(x, "lambdaTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaTargetUndefined: Self = StObject.set(x, "lambdaTarget", js.undefined)
  }
}

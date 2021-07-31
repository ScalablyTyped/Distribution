package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentTargetsOutput extends StObject {
  
  /**
    *  A list of target objects for a deployment. Each target object contains details about the target, such as its status and lifecycle events. The type of the target objects depends on the deployment' compute platform.     EC2/On-premises: Each target object is an EC2 or on-premises instance.     AWS Lambda: The target object is a specific version of an AWS Lambda function.     Amazon ECS: The target object is an Amazon ECS service.     CloudFormation: The target object is an AWS CloudFormation blue/green deployment.   
    */
  var deploymentTargets: js.UndefOr[DeploymentTargetList] = js.undefined
}
object BatchGetDeploymentTargetsOutput {
  
  @scala.inline
  def apply(): BatchGetDeploymentTargetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentTargetsOutput]
  }
  
  @scala.inline
  implicit class BatchGetDeploymentTargetsOutputMutableBuilder[Self <: BatchGetDeploymentTargetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentTargets(value: DeploymentTargetList): Self = StObject.set(x, "deploymentTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTargetsUndefined: Self = StObject.set(x, "deploymentTargets", js.undefined)
    
    @scala.inline
    def setDeploymentTargetsVarargs(value: DeploymentTarget*): Self = StObject.set(x, "deploymentTargets", js.Array(value :_*))
  }
}

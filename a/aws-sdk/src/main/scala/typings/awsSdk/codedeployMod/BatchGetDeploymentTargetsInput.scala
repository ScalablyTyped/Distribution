package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentTargetsInput extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the targets and their formats. The maximum number of deployment target IDs you can specify is 25.    For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances IDs, and their target type is instanceTarget.     For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and their target type is instanceTarget.     For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and services specified using the format &lt;clustername&gt;:&lt;servicename&gt;. Their target type is ecsTarget.     For deployments that are deployed with AWS CloudFormation, the target IDs are CloudFormation stack IDs. Their target type is cloudFormationTarget.   
    */
  var targetIds: js.UndefOr[TargetIdList] = js.undefined
}
object BatchGetDeploymentTargetsInput {
  
  @scala.inline
  def apply(): BatchGetDeploymentTargetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentTargetsInput]
  }
  
  @scala.inline
  implicit class BatchGetDeploymentTargetsInputMutableBuilder[Self <: BatchGetDeploymentTargetsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setTargetIds(value: TargetIdList): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    @scala.inline
    def setTargetIdsVarargs(value: TargetId*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
  }
}

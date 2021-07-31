package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeploymentGroupOutput extends StObject {
  
  /**
    * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS account.
    */
  var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
}
object UpdateDeploymentGroupOutput {
  
  @scala.inline
  def apply(): UpdateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeploymentGroupOutput]
  }
  
  @scala.inline
  implicit class UpdateDeploymentGroupOutputMutableBuilder[Self <: UpdateDeploymentGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooksNotCleanedUp(value: AutoScalingGroupList): Self = StObject.set(x, "hooksNotCleanedUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksNotCleanedUpUndefined: Self = StObject.set(x, "hooksNotCleanedUp", js.undefined)
    
    @scala.inline
    def setHooksNotCleanedUpVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "hooksNotCleanedUp", js.Array(value :_*))
  }
}

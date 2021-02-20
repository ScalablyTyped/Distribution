package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeploymentGroupOutput extends StObject {
  
  /**
    * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group.
    */
  var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.native
}
object DeleteDeploymentGroupOutput {
  
  @scala.inline
  def apply(): DeleteDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeploymentGroupOutput]
  }
  
  @scala.inline
  implicit class DeleteDeploymentGroupOutputMutableBuilder[Self <: DeleteDeploymentGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooksNotCleanedUp(value: AutoScalingGroupList): Self = StObject.set(x, "hooksNotCleanedUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksNotCleanedUpUndefined: Self = StObject.set(x, "hooksNotCleanedUp", js.undefined)
    
    @scala.inline
    def setHooksNotCleanedUpVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "hooksNotCleanedUp", js.Array(value :_*))
  }
}

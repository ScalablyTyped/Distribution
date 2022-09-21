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
  
  inline def apply(): UpdateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeploymentGroupOutput]
  }
  
  extension [Self <: UpdateDeploymentGroupOutput](x: Self) {
    
    inline def setHooksNotCleanedUp(value: AutoScalingGroupList): Self = StObject.set(x, "hooksNotCleanedUp", value.asInstanceOf[js.Any])
    
    inline def setHooksNotCleanedUpUndefined: Self = StObject.set(x, "hooksNotCleanedUp", js.undefined)
    
    inline def setHooksNotCleanedUpVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "hooksNotCleanedUp", js.Array(value*))
  }
}

package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlueInstanceTerminationOption extends StObject {
  
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.    TERMINATE: Instances are terminated after a specified wait time.    KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.  
    */
  var action: js.UndefOr[InstanceAction] = js.native
  
  /**
    * For an Amazon EC2 deployment, the number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.  For an Amazon ECS deployment, the number of minutes before deleting the original (blue) task set. During an Amazon ECS deployment, CodeDeploy shifts traffic from the original (blue) task set to a replacement (green) task set.   The maximum setting is 2880 minutes (2 days). 
    */
  var terminationWaitTimeInMinutes: js.UndefOr[Duration] = js.native
}
object BlueInstanceTerminationOption {
  
  @scala.inline
  def apply(): BlueInstanceTerminationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueInstanceTerminationOption]
  }
  
  @scala.inline
  implicit class BlueInstanceTerminationOptionMutableBuilder[Self <: BlueInstanceTerminationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: InstanceAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setTerminationWaitTimeInMinutes(value: Duration): Self = StObject.set(x, "terminationWaitTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationWaitTimeInMinutesUndefined: Self = StObject.set(x, "terminationWaitTimeInMinutes", js.undefined)
  }
}

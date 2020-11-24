package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlueInstanceTerminationOption extends js.Object {
  
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
  implicit class BlueInstanceTerminationOptionOps[Self <: BlueInstanceTerminationOption] (val x: Self) extends AnyVal {
    
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
    def setAction(value: InstanceAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setTerminationWaitTimeInMinutes(value: Duration): Self = this.set("terminationWaitTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationWaitTimeInMinutes: Self = this.set("terminationWaitTimeInMinutes", js.undefined)
  }
}

package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoDeployment extends js.Object {
  
  /**
    * If set to true, StackSets automatically deploys additional stack instances to AWS Organizations accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack instances from the account in the specified Regions.
    */
  var Enabled: js.UndefOr[AutoDeploymentNullable] = js.native
  
  /**
    * If set to true, stack resources are retained when an account is removed from a target organization or OU. If set to false, stack resources are deleted. Specify only if Enabled is set to True.
    */
  var RetainStacksOnAccountRemoval: js.UndefOr[RetainStacksOnAccountRemovalNullable] = js.native
}
object AutoDeployment {
  
  @scala.inline
  def apply(): AutoDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDeployment]
  }
  
  @scala.inline
  implicit class AutoDeploymentOps[Self <: AutoDeployment] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: AutoDeploymentNullable): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setRetainStacksOnAccountRemoval(value: RetainStacksOnAccountRemovalNullable): Self = this.set("RetainStacksOnAccountRemoval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainStacksOnAccountRemoval: Self = this.set("RetainStacksOnAccountRemoval", js.undefined)
  }
}

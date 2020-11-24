package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericRevisionInfo extends js.Object {
  
  /**
    * The deployment groups for which this is the current target revision.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.native
  
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * When the revision was first used by AWS CodeDeploy.
    */
  var firstUsedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * When the revision was last used by AWS CodeDeploy.
    */
  var lastUsedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * When the revision was registered with AWS CodeDeploy.
    */
  var registerTime: js.UndefOr[Timestamp] = js.native
}
object GenericRevisionInfo {
  
  @scala.inline
  def apply(): GenericRevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericRevisionInfo]
  }
  
  @scala.inline
  implicit class GenericRevisionInfoOps[Self <: GenericRevisionInfo] (val x: Self) extends AnyVal {
    
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
    def setDeploymentGroupsVarargs(value: DeploymentGroupName*): Self = this.set("deploymentGroups", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentGroups(value: DeploymentGroupsList): Self = this.set("deploymentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentGroups: Self = this.set("deploymentGroups", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFirstUsedTime(value: Timestamp): Self = this.set("firstUsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstUsedTime: Self = this.set("firstUsedTime", js.undefined)
    
    @scala.inline
    def setLastUsedTime(value: Timestamp): Self = this.set("lastUsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUsedTime: Self = this.set("lastUsedTime", js.undefined)
    
    @scala.inline
    def setRegisterTime(value: Timestamp): Self = this.set("registerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterTime: Self = this.set("registerTime", js.undefined)
  }
}

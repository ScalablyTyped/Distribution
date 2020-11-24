package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnErrorDeploymentExtended extends js.Object {
  
  /**
    * The deployment to be used on error case.
    */
  var deploymentName: js.UndefOr[String] = js.native
  
  /**
    * The state of the provisioning for the on error deployment.
    */
  val provisioningState: js.UndefOr[String] = js.native
  
  /**
    * The deployment on error behavior type. Possible values are LastSuccessful and
    * SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'
    */
  var `type`: js.UndefOr[String] = js.native
}
object OnErrorDeploymentExtended {
  
  @scala.inline
  def apply(): OnErrorDeploymentExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorDeploymentExtended]
  }
  
  @scala.inline
  implicit class OnErrorDeploymentExtendedOps[Self <: OnErrorDeploymentExtended] (val x: Self) extends AnyVal {
    
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
    def setDeploymentName(value: String): Self = this.set("deploymentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentName: Self = this.set("deploymentName", js.undefined)
    
    @scala.inline
    def setProvisioningState(value: String): Self = this.set("provisioningState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningState: Self = this.set("provisioningState", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

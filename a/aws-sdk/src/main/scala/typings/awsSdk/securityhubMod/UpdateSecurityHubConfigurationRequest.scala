package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSecurityHubConfigurationRequest extends js.Object {
  
  /**
    * Whether to automatically enable new controls when they are added to standards that are enabled. By default, this is set to true, and new controls are enabled automatically. To not automatically enable new controls, set this to false. 
    */
  var AutoEnableControls: js.UndefOr[Boolean] = js.native
}
object UpdateSecurityHubConfigurationRequest {
  
  @scala.inline
  def apply(): UpdateSecurityHubConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityHubConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateSecurityHubConfigurationRequestOps[Self <: UpdateSecurityHubConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setAutoEnableControls(value: Boolean): Self = this.set("AutoEnableControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEnableControls: Self = this.set("AutoEnableControls", js.undefined)
  }
}

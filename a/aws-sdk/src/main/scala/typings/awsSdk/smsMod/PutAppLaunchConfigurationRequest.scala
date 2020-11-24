package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppLaunchConfigurationRequest extends js.Object {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
  
  /**
    * Indicates whether the application is configured to launch automatically after replication is complete.
    */
  var autoLaunch: js.UndefOr[AutoLaunch] = js.native
  
  /**
    * The name of service role in the customer's account that AWS CloudFormation uses to launch the application.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  
  /**
    * Information about the launch configurations for server groups in the application.
    */
  var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.native
}
object PutAppLaunchConfigurationRequest {
  
  @scala.inline
  def apply(): PutAppLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppLaunchConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutAppLaunchConfigurationRequestOps[Self <: PutAppLaunchConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAutoLaunch(value: AutoLaunch): Self = this.set("autoLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLaunch: Self = this.set("autoLaunch", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setServerGroupLaunchConfigurationsVarargs(value: ServerGroupLaunchConfiguration*): Self = this.set("serverGroupLaunchConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setServerGroupLaunchConfigurations(value: ServerGroupLaunchConfigurations): Self = this.set("serverGroupLaunchConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerGroupLaunchConfigurations: Self = this.set("serverGroupLaunchConfigurations", js.undefined)
  }
}

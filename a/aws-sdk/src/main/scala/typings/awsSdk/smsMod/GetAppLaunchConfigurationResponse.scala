package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppLaunchConfigurationResponse extends js.Object {
  /**
    * ID of the application associated with the launch configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Name of the service role in the customer's account that Amazon CloudFormation uses to launch the application.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * List of launch configurations for server groups in this application.
    */
  var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.native
}

object GetAppLaunchConfigurationResponse {
  @scala.inline
  def apply(): GetAppLaunchConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppLaunchConfigurationResponse]
  }
  @scala.inline
  implicit class GetAppLaunchConfigurationResponseOps[Self <: GetAppLaunchConfigurationResponse] (val x: Self) extends AnyVal {
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


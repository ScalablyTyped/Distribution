package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppLaunchConfigurationRequest extends js.Object {
  /**
    * ID of the application launch configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object GetAppLaunchConfigurationRequest {
  @scala.inline
  def apply(): GetAppLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppLaunchConfigurationRequest]
  }
  @scala.inline
  implicit class GetAppLaunchConfigurationRequestOps[Self <: GetAppLaunchConfigurationRequest] (val x: Self) extends AnyVal {
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
  }
  
}


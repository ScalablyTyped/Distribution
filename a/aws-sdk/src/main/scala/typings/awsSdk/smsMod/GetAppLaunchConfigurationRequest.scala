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
  def apply(appId: AppId = null): GetAppLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppLaunchConfigurationRequest]
  }
}


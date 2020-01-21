package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchAppRequest extends js.Object {
  /**
    * ID of the application to launch.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object LaunchAppRequest {
  @scala.inline
  def apply(appId: AppId = null): LaunchAppRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchAppRequest]
  }
}


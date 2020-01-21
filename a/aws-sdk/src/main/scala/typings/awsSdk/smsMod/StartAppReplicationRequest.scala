package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAppReplicationRequest extends js.Object {
  /**
    * ID of the application to replicate.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object StartAppReplicationRequest {
  @scala.inline
  def apply(appId: AppId = null): StartAppReplicationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAppReplicationRequest]
  }
}


package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppRequest extends js.Object {
  /**
    * ID of the application whose information is being retrieved.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object GetAppRequest {
  @scala.inline
  def apply(appId: AppId = null): GetAppRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppRequest]
  }
}


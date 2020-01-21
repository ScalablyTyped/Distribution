package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppReplicationConfigurationRequest extends js.Object {
  /**
    * ID of the application associated with the replication configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object DeleteAppReplicationConfigurationRequest {
  @scala.inline
  def apply(appId: AppId = null): DeleteAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppReplicationConfigurationRequest]
  }
}


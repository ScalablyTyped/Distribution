package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppRequest extends js.Object {
  /**
    * ID of the application to delete.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * While deleting the application, stop all replication jobs corresponding to the servers in the application.
    */
  var forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.native
  /**
    * While deleting the application, terminate the stack corresponding to the application.
    */
  var forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.native
}

object DeleteAppRequest {
  @scala.inline
  def apply(
    appId: AppId = null,
    forceStopAppReplication: js.UndefOr[Boolean] = js.undefined,
    forceTerminateApp: js.UndefOr[Boolean] = js.undefined
  ): DeleteAppRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (!js.isUndefined(forceStopAppReplication)) __obj.updateDynamic("forceStopAppReplication")(forceStopAppReplication.asInstanceOf[js.Any])
    if (!js.isUndefined(forceTerminateApp)) __obj.updateDynamic("forceTerminateApp")(forceTerminateApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppRequest]
  }
}


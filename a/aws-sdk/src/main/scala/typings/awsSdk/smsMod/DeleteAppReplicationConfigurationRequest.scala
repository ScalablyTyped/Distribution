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
  def apply(): DeleteAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAppReplicationConfigurationRequest]
  }
  @scala.inline
  implicit class DeleteAppReplicationConfigurationRequestOps[Self <: DeleteAppReplicationConfigurationRequest] (val x: Self) extends AnyVal {
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


package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAppReplicationConfigurationRequest extends js.Object {
  /**
    * ID of the application tassociated with the replication configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Replication configurations for server groups in the application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.native
}

object PutAppReplicationConfigurationRequest {
  @scala.inline
  def apply(): PutAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppReplicationConfigurationRequest]
  }
  @scala.inline
  implicit class PutAppReplicationConfigurationRequestOps[Self <: PutAppReplicationConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setServerGroupReplicationConfigurationsVarargs(value: ServerGroupReplicationConfiguration*): Self = this.set("serverGroupReplicationConfigurations", js.Array(value :_*))
    @scala.inline
    def setServerGroupReplicationConfigurations(value: ServerGroupReplicationConfigurations): Self = this.set("serverGroupReplicationConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerGroupReplicationConfigurations: Self = this.set("serverGroupReplicationConfigurations", js.undefined)
  }
  
}


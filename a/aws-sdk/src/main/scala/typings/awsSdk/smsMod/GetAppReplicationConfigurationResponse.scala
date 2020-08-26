package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppReplicationConfigurationResponse extends js.Object {
  /**
    * Replication configurations associated with server groups in this application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.native
}

object GetAppReplicationConfigurationResponse {
  @scala.inline
  def apply(): GetAppReplicationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppReplicationConfigurationResponse]
  }
  @scala.inline
  implicit class GetAppReplicationConfigurationResponseOps[Self <: GetAppReplicationConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setServerGroupReplicationConfigurationsVarargs(value: ServerGroupReplicationConfiguration*): Self = this.set("serverGroupReplicationConfigurations", js.Array(value :_*))
    @scala.inline
    def setServerGroupReplicationConfigurations(value: ServerGroupReplicationConfigurations): Self = this.set("serverGroupReplicationConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerGroupReplicationConfigurations: Self = this.set("serverGroupReplicationConfigurations", js.undefined)
  }
  
}


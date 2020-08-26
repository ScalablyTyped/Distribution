package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerReplicationConfiguration extends js.Object {
  /**
    * Identifier of the server this replication configuration is associated with.
    */
  var server: js.UndefOr[Server] = js.native
  /**
    * Parameters for replicating the server.
    */
  var serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.native
}

object ServerReplicationConfiguration {
  @scala.inline
  def apply(): ServerReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerReplicationConfiguration]
  }
  @scala.inline
  implicit class ServerReplicationConfigurationOps[Self <: ServerReplicationConfiguration] (val x: Self) extends AnyVal {
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
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setServerReplicationParameters(value: ServerReplicationParameters): Self = this.set("serverReplicationParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerReplicationParameters: Self = this.set("serverReplicationParameters", js.undefined)
  }
  
}


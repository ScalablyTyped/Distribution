package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
  /**
    * Indicates whether the replication job is deleted or failed.
    */
  var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.native
  /**
    * The identifier of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.native
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.native
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.native
}

object Server {
  @scala.inline
  def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
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
    def setReplicationJobId(value: ReplicationJobId): Self = this.set("replicationJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationJobId: Self = this.set("replicationJobId", js.undefined)
    @scala.inline
    def setReplicationJobTerminated(value: ReplicationJobTerminated): Self = this.set("replicationJobTerminated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationJobTerminated: Self = this.set("replicationJobTerminated", js.undefined)
    @scala.inline
    def setServerId(value: ServerId): Self = this.set("serverId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerId: Self = this.set("serverId", js.undefined)
    @scala.inline
    def setServerType(value: ServerType): Self = this.set("serverType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerType: Self = this.set("serverType", js.undefined)
    @scala.inline
    def setVmServer(value: VmServer): Self = this.set("vmServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmServer: Self = this.set("vmServer", js.undefined)
  }
  
}


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
  def apply(
    replicationJobId: ReplicationJobId = null,
    replicationJobTerminated: js.UndefOr[Boolean] = js.undefined,
    serverId: ServerId = null,
    serverType: ServerType = null,
    vmServer: VmServer = null
  ): Server = {
    val __obj = js.Dynamic.literal()
    if (replicationJobId != null) __obj.updateDynamic("replicationJobId")(replicationJobId.asInstanceOf[js.Any])
    if (!js.isUndefined(replicationJobTerminated)) __obj.updateDynamic("replicationJobTerminated")(replicationJobTerminated.asInstanceOf[js.Any])
    if (serverId != null) __obj.updateDynamic("serverId")(serverId.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (vmServer != null) __obj.updateDynamic("vmServer")(vmServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}


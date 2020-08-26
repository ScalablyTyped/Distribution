package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceConnectionStatus extends js.Object {
  /**
    * The connection state of the WorkSpace. The connection state is unknown if the WorkSpace is stopped.
    */
  var ConnectionState: js.UndefOr[typings.awsSdk.workspacesMod.ConnectionState] = js.native
  /**
    * The timestamp of the connection status check.
    */
  var ConnectionStateCheckTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The timestamp of the last known user connection.
    */
  var LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceId] = js.native
}

object WorkspaceConnectionStatus {
  @scala.inline
  def apply(): WorkspaceConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceConnectionStatus]
  }
  @scala.inline
  implicit class WorkspaceConnectionStatusOps[Self <: WorkspaceConnectionStatus] (val x: Self) extends AnyVal {
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
    def setConnectionState(value: ConnectionState): Self = this.set("ConnectionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionState: Self = this.set("ConnectionState", js.undefined)
    @scala.inline
    def setConnectionStateCheckTimestamp(value: Timestamp): Self = this.set("ConnectionStateCheckTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionStateCheckTimestamp: Self = this.set("ConnectionStateCheckTimestamp", js.undefined)
    @scala.inline
    def setLastKnownUserConnectionTimestamp(value: Timestamp): Self = this.set("LastKnownUserConnectionTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastKnownUserConnectionTimestamp: Self = this.set("LastKnownUserConnectionTimestamp", js.undefined)
    @scala.inline
    def setWorkspaceId(value: WorkspaceId): Self = this.set("WorkspaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceId: Self = this.set("WorkspaceId", js.undefined)
  }
  
}


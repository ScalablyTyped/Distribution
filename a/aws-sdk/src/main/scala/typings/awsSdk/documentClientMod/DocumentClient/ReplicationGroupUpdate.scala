package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupUpdate extends js.Object {
  /**
    * The parameters required for creating a replica for the table.
    */
  var Create: js.UndefOr[CreateReplicationGroupMemberAction] = js.native
  /**
    * The parameters required for deleting a replica for the table.
    */
  var Delete: js.UndefOr[DeleteReplicationGroupMemberAction] = js.native
  /**
    * The parameters required for updating a replica for the table.
    */
  var Update: js.UndefOr[UpdateReplicationGroupMemberAction] = js.native
}

object ReplicationGroupUpdate {
  @scala.inline
  def apply(): ReplicationGroupUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupUpdate]
  }
  @scala.inline
  implicit class ReplicationGroupUpdateOps[Self <: ReplicationGroupUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: CreateReplicationGroupMemberAction): Self = this.set("Create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("Create", js.undefined)
    @scala.inline
    def setDelete(value: DeleteReplicationGroupMemberAction): Self = this.set("Delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("Delete", js.undefined)
    @scala.inline
    def setUpdate(value: UpdateReplicationGroupMemberAction): Self = this.set("Update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("Update", js.undefined)
  }
  
}


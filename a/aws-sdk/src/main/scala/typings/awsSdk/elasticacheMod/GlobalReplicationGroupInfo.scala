package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalReplicationGroupInfo extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The role of the replication group in a Global Datastore. Can be primary or secondary.
    */
  var GlobalReplicationGroupMemberRole: js.UndefOr[String] = js.native
}

object GlobalReplicationGroupInfo {
  @scala.inline
  def apply(): GlobalReplicationGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroupInfo]
  }
  @scala.inline
  implicit class GlobalReplicationGroupInfoOps[Self <: GlobalReplicationGroupInfo] (val x: Self) extends AnyVal {
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
    def setGlobalReplicationGroupId(value: String): Self = this.set("GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalReplicationGroupId: Self = this.set("GlobalReplicationGroupId", js.undefined)
    @scala.inline
    def setGlobalReplicationGroupMemberRole(value: String): Self = this.set("GlobalReplicationGroupMemberRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalReplicationGroupMemberRole: Self = this.set("GlobalReplicationGroupMemberRole", js.undefined)
  }
  
}


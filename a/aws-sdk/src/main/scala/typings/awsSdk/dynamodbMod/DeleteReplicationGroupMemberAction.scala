package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationGroupMemberAction extends js.Object {
  /**
    * The Region where the replica exists.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName = js.native
}

object DeleteReplicationGroupMemberAction {
  @scala.inline
  def apply(RegionName: RegionName): DeleteReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationGroupMemberAction]
  }
  @scala.inline
  implicit class DeleteReplicationGroupMemberActionOps[Self <: DeleteReplicationGroupMemberAction] (val x: Self) extends AnyVal {
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
    def setRegionName(value: RegionName): Self = this.set("RegionName", value.asInstanceOf[js.Any])
  }
  
}


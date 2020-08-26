package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMountTargetSecurityGroupsRequest extends js.Object {
  /**
    * The ID of the mount target whose security groups you want to retrieve.
    */
  var MountTargetId: typings.awsSdk.efsMod.MountTargetId = js.native
}

object DescribeMountTargetSecurityGroupsRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId): DescribeMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMountTargetSecurityGroupsRequest]
  }
  @scala.inline
  implicit class DescribeMountTargetSecurityGroupsRequestOps[Self <: DescribeMountTargetSecurityGroupsRequest] (val x: Self) extends AnyVal {
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
    def setMountTargetId(value: MountTargetId): Self = this.set("MountTargetId", value.asInstanceOf[js.Any])
  }
  
}


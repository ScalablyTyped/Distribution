package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMountTargetRequest extends js.Object {
  /**
    * The ID of the file system for which to create the mount target.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  /**
    * Valid IPv4 address within the address range of the specified subnet.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.efsMod.IpAddress] = js.native
  /**
    * Up to five VPC security group IDs, of the form sg-xxxxxxxx. These must be for the same VPC as subnet specified.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.efsMod.SecurityGroups] = js.native
  /**
    * The ID of the subnet to add the mount target in.
    */
  var SubnetId: typings.awsSdk.efsMod.SubnetId = js.native
}

object CreateMountTargetRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, SubnetId: SubnetId): CreateMountTargetRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMountTargetRequest]
  }
  @scala.inline
  implicit class CreateMountTargetRequestOps[Self <: CreateMountTargetRequest] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
  }
  
}


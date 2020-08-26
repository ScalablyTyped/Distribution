package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalConnectionRequirements extends js.Object {
  /**
    * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
    */
  var AvailabilityZone: js.UndefOr[NameString] = js.native
  /**
    * The security group ID list used by the connection.
    */
  var SecurityGroupIdList: js.UndefOr[typings.awsSdk.glueMod.SecurityGroupIdList] = js.native
  /**
    * The subnet ID used by the connection.
    */
  var SubnetId: js.UndefOr[NameString] = js.native
}

object PhysicalConnectionRequirements {
  @scala.inline
  def apply(): PhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalConnectionRequirements]
  }
  @scala.inline
  implicit class PhysicalConnectionRequirementsOps[Self <: PhysicalConnectionRequirements] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: NameString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setSecurityGroupIdListVarargs(value: NameString*): Self = this.set("SecurityGroupIdList", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIdList(value: SecurityGroupIdList): Self = this.set("SecurityGroupIdList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIdList: Self = this.set("SecurityGroupIdList", js.undefined)
    @scala.inline
    def setSubnetId(value: NameString): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
  
}


package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2SecurityGroupDetails extends js.Object {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The inbound rules associated with the security group.
    */
  var IpPermissions: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.native
  
  /**
    * [VPC only] The outbound rules associated with the security group.
    */
  var IpPermissionsEgress: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.native
  
  /**
    * The AWS account ID of the owner of the security group.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * [VPC only] The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2SecurityGroupDetails {
  
  @scala.inline
  def apply(): AwsEc2SecurityGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupDetails]
  }
  
  @scala.inline
  implicit class AwsEc2SecurityGroupDetailsOps[Self <: AwsEc2SecurityGroupDetails] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: NonEmptyString): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setIpPermissionsVarargs(value: AwsEc2SecurityGroupIpPermission*): Self = this.set("IpPermissions", js.Array(value :_*))
    
    @scala.inline
    def setIpPermissions(value: AwsEc2SecurityGroupIpPermissionList): Self = this.set("IpPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpPermissions: Self = this.set("IpPermissions", js.undefined)
    
    @scala.inline
    def setIpPermissionsEgressVarargs(value: AwsEc2SecurityGroupIpPermission*): Self = this.set("IpPermissionsEgress", js.Array(value :_*))
    
    @scala.inline
    def setIpPermissionsEgress(value: AwsEc2SecurityGroupIpPermissionList): Self = this.set("IpPermissionsEgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpPermissionsEgress: Self = this.set("IpPermissionsEgress", js.undefined)
    
    @scala.inline
    def setOwnerId(value: NonEmptyString): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}

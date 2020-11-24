package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeSecurityGroupEgressRequest extends js.Object {
  
  /**
    * Not supported. Use a set of IP permissions to specify the CIDR.
    */
  var CidrIp: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the security group.
    */
  var GroupId: SecurityGroupId = js.native
  
  /**
    * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.native
  
  /**
    * Not supported. Use a set of IP permissions to specify the protocol name or number.
    */
  var IpProtocol: js.UndefOr[String] = js.native
  
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.native
  
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}
object AuthorizeSecurityGroupEgressRequest {
  
  @scala.inline
  def apply(GroupId: SecurityGroupId): AuthorizeSecurityGroupEgressRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeSecurityGroupEgressRequest]
  }
  
  @scala.inline
  implicit class AuthorizeSecurityGroupEgressRequestOps[Self <: AuthorizeSecurityGroupEgressRequest] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: SecurityGroupId): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrIp(value: String): Self = this.set("CidrIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrIp: Self = this.set("CidrIp", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFromPort(value: Integer): Self = this.set("FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPort: Self = this.set("FromPort", js.undefined)
    
    @scala.inline
    def setIpPermissionsVarargs(value: IpPermission*): Self = this.set("IpPermissions", js.Array(value :_*))
    
    @scala.inline
    def setIpPermissions(value: IpPermissionList): Self = this.set("IpPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpPermissions: Self = this.set("IpPermissions", js.undefined)
    
    @scala.inline
    def setIpProtocol(value: String): Self = this.set("IpProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpProtocol: Self = this.set("IpProtocol", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroupName(value: String): Self = this.set("SourceSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSecurityGroupName: Self = this.set("SourceSecurityGroupName", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroupOwnerId(value: String): Self = this.set("SourceSecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSecurityGroupOwnerId: Self = this.set("SourceSecurityGroupOwnerId", js.undefined)
    
    @scala.inline
    def setToPort(value: Integer): Self = this.set("ToPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPort: Self = this.set("ToPort", js.undefined)
  }
}

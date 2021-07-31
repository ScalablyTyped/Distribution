package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeSecurityGroupIngressRequest extends StObject {
  
  /**
    * The IPv4 address range, in CIDR format. You can't specify this parameter when specifying a source security group. To specify an IPv6 address range, use a set of IP permissions. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var CidrIp: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use -1 to specify all types. If you specify all ICMP types, you must specify all codes. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
    */
  var GroupId: js.UndefOr[SecurityGroupId] = js.undefined
  
  /**
    * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the security group name in the request.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.undefined
  
  /**
    * The sets of IP permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  
  /**
    * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers). To specify icmpv6, use a set of IP permissions. [VPC only] Use -1 to specify all protocols. If you specify -1 or a protocol other than tcp, udp, or icmp, traffic on all ports is allowed, regardless of any ports you specify. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be in the same VPC.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a different account. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use -1 to specify all codes. If you specify all ICMP types, you must specify all codes. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}
object AuthorizeSecurityGroupIngressRequest {
  
  @scala.inline
  def apply(): AuthorizeSecurityGroupIngressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeSecurityGroupIngressRequest]
  }
  
  @scala.inline
  implicit class AuthorizeSecurityGroupIngressRequestMutableBuilder[Self <: AuthorizeSecurityGroupIngressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrIp(value: String): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    @scala.inline
    def setGroupId(value: SecurityGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: SecurityGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setIpPermissions(value: IpPermissionList): Self = StObject.set(x, "IpPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPermissionsUndefined: Self = StObject.set(x, "IpPermissions", js.undefined)
    
    @scala.inline
    def setIpPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "IpPermissions", js.Array(value :_*))
    
    @scala.inline
    def setIpProtocol(value: String): Self = StObject.set(x, "IpProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpProtocolUndefined: Self = StObject.set(x, "IpProtocol", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroupName(value: String): Self = StObject.set(x, "SourceSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSecurityGroupNameUndefined: Self = StObject.set(x, "SourceSecurityGroupName", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroupOwnerId(value: String): Self = StObject.set(x, "SourceSecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSecurityGroupOwnerIdUndefined: Self = StObject.set(x, "SourceSecurityGroupOwnerId", js.undefined)
    
    @scala.inline
    def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}

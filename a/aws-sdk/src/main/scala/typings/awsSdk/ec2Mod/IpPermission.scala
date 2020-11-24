package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpPermission extends js.Object {
  
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number (see Protocol Numbers). [VPC only] Use -1 to specify all protocols. When authorizing security group rules, specifying -1 or a protocol number other than tcp, udp, icmp, or icmpv6 allows traffic on all ports, regardless of any port range you specify. For tcp, udp, and icmp, you must specify a port range. For icmpv6, the port range is optional; if you omit the port range, traffic for all types and codes is allowed.
    */
  var IpProtocol: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 ranges.
    */
  var IpRanges: js.UndefOr[IpRangeList] = js.native
  
  /**
    * [VPC only] The IPv6 ranges.
    */
  var Ipv6Ranges: js.UndefOr[Ipv6RangeList] = js.native
  
  /**
    * [VPC only] The prefix list IDs.
    */
  var PrefixListIds: js.UndefOr[PrefixListIdList] = js.native
  
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var ToPort: js.UndefOr[Integer] = js.native
  
  /**
    * The security group and AWS account ID pairs.
    */
  var UserIdGroupPairs: js.UndefOr[UserIdGroupPairList] = js.native
}
object IpPermission {
  
  @scala.inline
  def apply(): IpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpPermission]
  }
  
  @scala.inline
  implicit class IpPermissionOps[Self <: IpPermission] (val x: Self) extends AnyVal {
    
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
    def setFromPort(value: Integer): Self = this.set("FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPort: Self = this.set("FromPort", js.undefined)
    
    @scala.inline
    def setIpProtocol(value: String): Self = this.set("IpProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpProtocol: Self = this.set("IpProtocol", js.undefined)
    
    @scala.inline
    def setIpRangesVarargs(value: IpRange*): Self = this.set("IpRanges", js.Array(value :_*))
    
    @scala.inline
    def setIpRanges(value: IpRangeList): Self = this.set("IpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpRanges: Self = this.set("IpRanges", js.undefined)
    
    @scala.inline
    def setIpv6RangesVarargs(value: Ipv6Range*): Self = this.set("Ipv6Ranges", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Ranges(value: Ipv6RangeList): Self = this.set("Ipv6Ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Ranges: Self = this.set("Ipv6Ranges", js.undefined)
    
    @scala.inline
    def setPrefixListIdsVarargs(value: PrefixListId*): Self = this.set("PrefixListIds", js.Array(value :_*))
    
    @scala.inline
    def setPrefixListIds(value: PrefixListIdList): Self = this.set("PrefixListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListIds: Self = this.set("PrefixListIds", js.undefined)
    
    @scala.inline
    def setToPort(value: Integer): Self = this.set("ToPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPort: Self = this.set("ToPort", js.undefined)
    
    @scala.inline
    def setUserIdGroupPairsVarargs(value: UserIdGroupPair*): Self = this.set("UserIdGroupPairs", js.Array(value :_*))
    
    @scala.inline
    def setUserIdGroupPairs(value: UserIdGroupPairList): Self = this.set("UserIdGroupPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIdGroupPairs: Self = this.set("UserIdGroupPairs", js.undefined)
  }
}

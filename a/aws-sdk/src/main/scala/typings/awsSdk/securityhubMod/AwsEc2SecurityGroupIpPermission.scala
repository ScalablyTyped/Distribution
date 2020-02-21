package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupIpPermission extends js.Object {
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes. 
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number. [VPC only] Use -1 to specify all protocols. When authorizing security group rules, specifying -1 or a protocol number other than tcp, udp, icmp, or icmpv6 allows traffic on all ports, regardless of any port range you specify. For tcp, udp, and icmp, you must specify a port range. For icmpv6, the port range is optional. If you omit the port range, traffic for all types and codes is allowed. 
    */
  var IpProtocol: js.UndefOr[NonEmptyString] = js.native
  /**
    * The IPv4 ranges.
    */
  var IpRanges: js.UndefOr[AwsEc2SecurityGroupIpRangeList] = js.native
  /**
    * The IPv6 ranges.
    */
  var Ipv6Ranges: js.UndefOr[AwsEc2SecurityGroupIpv6RangeList] = js.native
  /**
    * [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access through a VPC endpoint from instances associated with the security group.
    */
  var PrefixListIds: js.UndefOr[AwsEc2SecurityGroupPrefixListIdList] = js.native
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var ToPort: js.UndefOr[Integer] = js.native
  /**
    * The security group and AWS account ID pairs.
    */
  var UserIdGroupPairs: js.UndefOr[AwsEc2SecurityGroupUserIdGroupPairList] = js.native
}

object AwsEc2SecurityGroupIpPermission {
  @scala.inline
  def apply(
    FromPort: Int | scala.Double = null,
    IpProtocol: NonEmptyString = null,
    IpRanges: AwsEc2SecurityGroupIpRangeList = null,
    Ipv6Ranges: AwsEc2SecurityGroupIpv6RangeList = null,
    PrefixListIds: AwsEc2SecurityGroupPrefixListIdList = null,
    ToPort: Int | scala.Double = null,
    UserIdGroupPairs: AwsEc2SecurityGroupUserIdGroupPairList = null
  ): AwsEc2SecurityGroupIpPermission = {
    val __obj = js.Dynamic.literal()
    if (FromPort != null) __obj.updateDynamic("FromPort")(FromPort.asInstanceOf[js.Any])
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol.asInstanceOf[js.Any])
    if (IpRanges != null) __obj.updateDynamic("IpRanges")(IpRanges.asInstanceOf[js.Any])
    if (Ipv6Ranges != null) __obj.updateDynamic("Ipv6Ranges")(Ipv6Ranges.asInstanceOf[js.Any])
    if (PrefixListIds != null) __obj.updateDynamic("PrefixListIds")(PrefixListIds.asInstanceOf[js.Any])
    if (ToPort != null) __obj.updateDynamic("ToPort")(ToPort.asInstanceOf[js.Any])
    if (UserIdGroupPairs != null) __obj.updateDynamic("UserIdGroupPairs")(UserIdGroupPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2SecurityGroupIpPermission]
  }
}


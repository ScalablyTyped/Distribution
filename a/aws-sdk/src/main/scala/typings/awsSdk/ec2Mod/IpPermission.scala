package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpPermission extends StObject {
  
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number (see Protocol Numbers). [VPC only] Use -1 to specify all protocols. When authorizing security group rules, specifying -1 or a protocol number other than tcp, udp, icmp, or icmpv6 allows traffic on all ports, regardless of any port range you specify. For tcp, udp, and icmp, you must specify a port range. For icmpv6, the port range is optional; if you omit the port range, traffic for all types and codes is allowed.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv4 ranges.
    */
  var IpRanges: js.UndefOr[IpRangeList] = js.undefined
  
  /**
    * [VPC only] The IPv6 ranges.
    */
  var Ipv6Ranges: js.UndefOr[Ipv6RangeList] = js.undefined
  
  /**
    * [VPC only] The prefix list IDs.
    */
  var PrefixListIds: js.UndefOr[PrefixListIdList] = js.undefined
  
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The security group and Amazon Web Services account ID pairs.
    */
  var UserIdGroupPairs: js.UndefOr[UserIdGroupPairList] = js.undefined
}
object IpPermission {
  
  inline def apply(): IpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpPermission]
  }
  
  extension [Self <: IpPermission](x: Self) {
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "IpProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "IpProtocol", js.undefined)
    
    inline def setIpRanges(value: IpRangeList): Self = StObject.set(x, "IpRanges", value.asInstanceOf[js.Any])
    
    inline def setIpRangesUndefined: Self = StObject.set(x, "IpRanges", js.undefined)
    
    inline def setIpRangesVarargs(value: IpRange*): Self = StObject.set(x, "IpRanges", js.Array(value*))
    
    inline def setIpv6Ranges(value: Ipv6RangeList): Self = StObject.set(x, "Ipv6Ranges", value.asInstanceOf[js.Any])
    
    inline def setIpv6RangesUndefined: Self = StObject.set(x, "Ipv6Ranges", js.undefined)
    
    inline def setIpv6RangesVarargs(value: Ipv6Range*): Self = StObject.set(x, "Ipv6Ranges", js.Array(value*))
    
    inline def setPrefixListIds(value: PrefixListIdList): Self = StObject.set(x, "PrefixListIds", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdsUndefined: Self = StObject.set(x, "PrefixListIds", js.undefined)
    
    inline def setPrefixListIdsVarargs(value: PrefixListId*): Self = StObject.set(x, "PrefixListIds", js.Array(value*))
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
    
    inline def setUserIdGroupPairs(value: UserIdGroupPairList): Self = StObject.set(x, "UserIdGroupPairs", value.asInstanceOf[js.Any])
    
    inline def setUserIdGroupPairsUndefined: Self = StObject.set(x, "UserIdGroupPairs", js.undefined)
    
    inline def setUserIdGroupPairsVarargs(value: UserIdGroupPair*): Self = StObject.set(x, "UserIdGroupPairs", js.Array(value*))
  }
}

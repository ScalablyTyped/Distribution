package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupRuleRequest extends StObject {
  
  /**
    * The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length. 
    */
  var CidrIpv4: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
    */
  var CidrIpv6: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the security group rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number (see Protocol Numbers).  Use -1 to specify all protocols.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: js.UndefOr[PrefixListResourceId] = js.undefined
  
  /**
    * The ID of the security group that is referenced in the security group rule.
    */
  var ReferencedGroupId: js.UndefOr[SecurityGroupId] = js.undefined
  
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes. 
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}
object SecurityGroupRuleRequest {
  
  inline def apply(): SecurityGroupRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRuleRequest]
  }
  
  extension [Self <: SecurityGroupRuleRequest](x: Self) {
    
    inline def setCidrIpv4(value: String): Self = StObject.set(x, "CidrIpv4", value.asInstanceOf[js.Any])
    
    inline def setCidrIpv4Undefined: Self = StObject.set(x, "CidrIpv4", js.undefined)
    
    inline def setCidrIpv6(value: String): Self = StObject.set(x, "CidrIpv6", value.asInstanceOf[js.Any])
    
    inline def setCidrIpv6Undefined: Self = StObject.set(x, "CidrIpv6", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "IpProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "IpProtocol", js.undefined)
    
    inline def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setReferencedGroupId(value: SecurityGroupId): Self = StObject.set(x, "ReferencedGroupId", value.asInstanceOf[js.Any])
    
    inline def setReferencedGroupIdUndefined: Self = StObject.set(x, "ReferencedGroupId", js.undefined)
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}

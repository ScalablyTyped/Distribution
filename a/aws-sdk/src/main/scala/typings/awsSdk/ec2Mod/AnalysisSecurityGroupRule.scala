package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSecurityGroupRule extends StObject {
  
  /**
    * The IPv4 address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * The direction. The following are the possible values:   egress   ingress  
    */
  var Direction: js.UndefOr[String] = js.undefined
  
  /**
    * The port range.
    */
  var PortRange: js.UndefOr[typings.awsSdk.ec2Mod.PortRange] = js.undefined
  
  /**
    * The prefix list ID.
    */
  var PrefixListId: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol name.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The security group ID.
    */
  var SecurityGroupId: js.UndefOr[String] = js.undefined
}
object AnalysisSecurityGroupRule {
  
  inline def apply(): AnalysisSecurityGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSecurityGroupRule]
  }
  
  extension [Self <: AnalysisSecurityGroupRule](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "Direction", js.undefined)
    
    inline def setPortRange(value: PortRange): Self = StObject.set(x, "PortRange", value.asInstanceOf[js.Any])
    
    inline def setPortRangeUndefined: Self = StObject.set(x, "PortRange", js.undefined)
    
    inline def setPrefixListId(value: String): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSecurityGroupId(value: String): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
  }
}

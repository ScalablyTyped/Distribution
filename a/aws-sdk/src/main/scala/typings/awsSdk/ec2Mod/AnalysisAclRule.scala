package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisAclRule extends StObject {
  
  /**
    * The IPv4 address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the rule is an outbound rule.
    */
  var Egress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The range of ports.
    */
  var PortRange: js.UndefOr[typings.awsSdk.ec2Mod.PortRange] = js.undefined
  
  /**
    * The protocol.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to allow or deny traffic that matches the rule.
    */
  var RuleAction: js.UndefOr[String] = js.undefined
  
  /**
    * The rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.undefined
}
object AnalysisAclRule {
  
  inline def apply(): AnalysisAclRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisAclRule]
  }
  
  extension [Self <: AnalysisAclRule](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setEgress(value: Boolean): Self = StObject.set(x, "Egress", value.asInstanceOf[js.Any])
    
    inline def setEgressUndefined: Self = StObject.set(x, "Egress", js.undefined)
    
    inline def setPortRange(value: PortRange): Self = StObject.set(x, "PortRange", value.asInstanceOf[js.Any])
    
    inline def setPortRangeUndefined: Self = StObject.set(x, "PortRange", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setRuleAction(value: String): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    inline def setRuleActionUndefined: Self = StObject.set(x, "RuleAction", js.undefined)
    
    inline def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
    
    inline def setRuleNumberUndefined: Self = StObject.set(x, "RuleNumber", js.undefined)
  }
}

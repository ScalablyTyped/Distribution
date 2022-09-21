package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatelessRuleMatchAttributes extends StObject {
  
  /**
    * A list of port ranges to specify the destination ports to inspect for.
    */
  var DestinationPorts: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesDestinationPortsList] = js.undefined
  
  /**
    * The destination IP addresses and address ranges to inspect for, in CIDR notation.
    */
  var Destinations: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesDestinationsList] = js.undefined
  
  /**
    * The protocols to inspect for.
    */
  var Protocols: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesProtocolsList] = js.undefined
  
  /**
    * A list of port ranges to specify the source ports to inspect for.
    */
  var SourcePorts: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesSourcePortsList] = js.undefined
  
  /**
    * The source IP addresses and address ranges to inspect for, in CIDR notation.
    */
  var Sources: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesSourcesList] = js.undefined
  
  /**
    * The TCP flags and masks to inspect for.
    */
  var TcpFlags: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsList] = js.undefined
}
object RuleGroupSourceStatelessRuleMatchAttributes {
  
  inline def apply(): RuleGroupSourceStatelessRuleMatchAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributes]
  }
  
  extension [Self <: RuleGroupSourceStatelessRuleMatchAttributes](x: Self) {
    
    inline def setDestinationPorts(value: RuleGroupSourceStatelessRuleMatchAttributesDestinationPortsList): Self = StObject.set(x, "DestinationPorts", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortsUndefined: Self = StObject.set(x, "DestinationPorts", js.undefined)
    
    inline def setDestinationPortsVarargs(value: RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts*): Self = StObject.set(x, "DestinationPorts", js.Array(value*))
    
    inline def setDestinations(value: RuleGroupSourceStatelessRuleMatchAttributesDestinationsList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: RuleGroupSourceStatelessRuleMatchAttributesDestinations*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setProtocols(value: RuleGroupSourceStatelessRuleMatchAttributesProtocolsList): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Integer*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setSourcePorts(value: RuleGroupSourceStatelessRuleMatchAttributesSourcePortsList): Self = StObject.set(x, "SourcePorts", value.asInstanceOf[js.Any])
    
    inline def setSourcePortsUndefined: Self = StObject.set(x, "SourcePorts", js.undefined)
    
    inline def setSourcePortsVarargs(value: RuleGroupSourceStatelessRuleMatchAttributesSourcePorts*): Self = StObject.set(x, "SourcePorts", js.Array(value*))
    
    inline def setSources(value: RuleGroupSourceStatelessRuleMatchAttributesSourcesList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: RuleGroupSourceStatelessRuleMatchAttributesSources*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setTcpFlags(value: RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsList): Self = StObject.set(x, "TcpFlags", value.asInstanceOf[js.Any])
    
    inline def setTcpFlagsUndefined: Self = StObject.set(x, "TcpFlags", js.undefined)
    
    inline def setTcpFlagsVarargs(value: RuleGroupSourceStatelessRuleMatchAttributesTcpFlags*): Self = StObject.set(x, "TcpFlags", js.Array(value*))
  }
}

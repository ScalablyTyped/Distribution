package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallRuleInfo extends StObject {
  
  /**
    * End of the IP address range
    */
  var endIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Firewall rule name to set
    */
  var firewallRuleName: String
  
  /**
    * Fully qualified name of the server to create a new firewall rule on
    */
  var serverName: String
  
  /**
    * Start of the IP address range
    */
  var startIpAddress: js.UndefOr[String] = js.undefined
}
object FirewallRuleInfo {
  
  inline def apply(firewallRuleName: String, serverName: String): FirewallRuleInfo = {
    val __obj = js.Dynamic.literal(firewallRuleName = firewallRuleName.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallRuleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallRuleInfo] (val x: Self) extends AnyVal {
    
    inline def setEndIpAddress(value: String): Self = StObject.set(x, "endIpAddress", value.asInstanceOf[js.Any])
    
    inline def setEndIpAddressUndefined: Self = StObject.set(x, "endIpAddress", js.undefined)
    
    inline def setFirewallRuleName(value: String): Self = StObject.set(x, "firewallRuleName", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setStartIpAddress(value: String): Self = StObject.set(x, "startIpAddress", value.asInstanceOf[js.Any])
    
    inline def setStartIpAddressUndefined: Self = StObject.set(x, "startIpAddress", js.undefined)
  }
}

package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallRuleInfo extends StObject {
  
  var endIpAddress: js.UndefOr[String] = js.undefined
  
  var serverName: String
  
  var startIpAddress: js.UndefOr[String] = js.undefined
}
object FirewallRuleInfo {
  
  inline def apply(serverName: String): FirewallRuleInfo = {
    val __obj = js.Dynamic.literal(serverName = serverName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallRuleInfo]
  }
  
  extension [Self <: FirewallRuleInfo](x: Self) {
    
    inline def setEndIpAddress(value: String): Self = StObject.set(x, "endIpAddress", value.asInstanceOf[js.Any])
    
    inline def setEndIpAddressUndefined: Self = StObject.set(x, "endIpAddress", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setStartIpAddress(value: String): Self = StObject.set(x, "startIpAddress", value.asInstanceOf[js.Any])
    
    inline def setStartIpAddressUndefined: Self = StObject.set(x, "startIpAddress", js.undefined)
  }
}

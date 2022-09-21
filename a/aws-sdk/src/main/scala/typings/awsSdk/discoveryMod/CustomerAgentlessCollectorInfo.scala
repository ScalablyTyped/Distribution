package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerAgentlessCollectorInfo extends StObject {
  
  var activeAgentlessCollectors: Integer
  
  var denyListedAgentlessCollectors: Integer
  
  var healthyAgentlessCollectors: Integer
  
  var shutdownAgentlessCollectors: Integer
  
  var totalAgentlessCollectors: Integer
  
  var unhealthyAgentlessCollectors: Integer
  
  var unknownAgentlessCollectors: Integer
}
object CustomerAgentlessCollectorInfo {
  
  inline def apply(
    activeAgentlessCollectors: Integer,
    denyListedAgentlessCollectors: Integer,
    healthyAgentlessCollectors: Integer,
    shutdownAgentlessCollectors: Integer,
    totalAgentlessCollectors: Integer,
    unhealthyAgentlessCollectors: Integer,
    unknownAgentlessCollectors: Integer
  ): CustomerAgentlessCollectorInfo = {
    val __obj = js.Dynamic.literal(activeAgentlessCollectors = activeAgentlessCollectors.asInstanceOf[js.Any], denyListedAgentlessCollectors = denyListedAgentlessCollectors.asInstanceOf[js.Any], healthyAgentlessCollectors = healthyAgentlessCollectors.asInstanceOf[js.Any], shutdownAgentlessCollectors = shutdownAgentlessCollectors.asInstanceOf[js.Any], totalAgentlessCollectors = totalAgentlessCollectors.asInstanceOf[js.Any], unhealthyAgentlessCollectors = unhealthyAgentlessCollectors.asInstanceOf[js.Any], unknownAgentlessCollectors = unknownAgentlessCollectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerAgentlessCollectorInfo]
  }
  
  extension [Self <: CustomerAgentlessCollectorInfo](x: Self) {
    
    inline def setActiveAgentlessCollectors(value: Integer): Self = StObject.set(x, "activeAgentlessCollectors", value.asInstanceOf[js.Any])
    
    inline def setDenyListedAgentlessCollectors(value: Integer): Self = StObject.set(x, "denyListedAgentlessCollectors", value.asInstanceOf[js.Any])
    
    inline def setHealthyAgentlessCollectors(value: Integer): Self = StObject.set(x, "healthyAgentlessCollectors", value.asInstanceOf[js.Any])
    
    inline def setShutdownAgentlessCollectors(value: Integer): Self = StObject.set(x, "shutdownAgentlessCollectors", value.asInstanceOf[js.Any])
    
    inline def setTotalAgentlessCollectors(value: Integer): Self = StObject.set(x, "totalAgentlessCollectors", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyAgentlessCollectors(value: Integer): Self = StObject.set(x, "unhealthyAgentlessCollectors", value.asInstanceOf[js.Any])
    
    inline def setUnknownAgentlessCollectors(value: Integer): Self = StObject.set(x, "unknownAgentlessCollectors", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerConnectorInfo extends StObject {
  
  /**
    * Number of active discovery connectors.
    */
  var activeConnectors: Integer
  
  /**
    * Number of blacklisted discovery connectors.
    */
  var blackListedConnectors: Integer
  
  /**
    * Number of healthy discovery connectors.
    */
  var healthyConnectors: Integer
  
  /**
    * Number of discovery connectors with status SHUTDOWN,
    */
  var shutdownConnectors: Integer
  
  /**
    * Total number of discovery connectors.
    */
  var totalConnectors: Integer
  
  /**
    * Number of unhealthy discovery connectors.
    */
  var unhealthyConnectors: Integer
  
  /**
    * Number of unknown discovery connectors.
    */
  var unknownConnectors: Integer
}
object CustomerConnectorInfo {
  
  inline def apply(
    activeConnectors: Integer,
    blackListedConnectors: Integer,
    healthyConnectors: Integer,
    shutdownConnectors: Integer,
    totalConnectors: Integer,
    unhealthyConnectors: Integer,
    unknownConnectors: Integer
  ): CustomerConnectorInfo = {
    val __obj = js.Dynamic.literal(activeConnectors = activeConnectors.asInstanceOf[js.Any], blackListedConnectors = blackListedConnectors.asInstanceOf[js.Any], healthyConnectors = healthyConnectors.asInstanceOf[js.Any], shutdownConnectors = shutdownConnectors.asInstanceOf[js.Any], totalConnectors = totalConnectors.asInstanceOf[js.Any], unhealthyConnectors = unhealthyConnectors.asInstanceOf[js.Any], unknownConnectors = unknownConnectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerConnectorInfo]
  }
  
  extension [Self <: CustomerConnectorInfo](x: Self) {
    
    inline def setActiveConnectors(value: Integer): Self = StObject.set(x, "activeConnectors", value.asInstanceOf[js.Any])
    
    inline def setBlackListedConnectors(value: Integer): Self = StObject.set(x, "blackListedConnectors", value.asInstanceOf[js.Any])
    
    inline def setHealthyConnectors(value: Integer): Self = StObject.set(x, "healthyConnectors", value.asInstanceOf[js.Any])
    
    inline def setShutdownConnectors(value: Integer): Self = StObject.set(x, "shutdownConnectors", value.asInstanceOf[js.Any])
    
    inline def setTotalConnectors(value: Integer): Self = StObject.set(x, "totalConnectors", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyConnectors(value: Integer): Self = StObject.set(x, "unhealthyConnectors", value.asInstanceOf[js.Any])
    
    inline def setUnknownConnectors(value: Integer): Self = StObject.set(x, "unknownConnectors", value.asInstanceOf[js.Any])
  }
}

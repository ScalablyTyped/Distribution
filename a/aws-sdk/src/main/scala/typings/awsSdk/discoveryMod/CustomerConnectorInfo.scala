package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerConnectorInfo extends StObject {
  
  /**
    * Number of active discovery connectors.
    */
  var activeConnectors: Integer = js.native
  
  /**
    * Number of blacklisted discovery connectors.
    */
  var blackListedConnectors: Integer = js.native
  
  /**
    * Number of healthy discovery connectors.
    */
  var healthyConnectors: Integer = js.native
  
  /**
    * Number of discovery connectors with status SHUTDOWN,
    */
  var shutdownConnectors: Integer = js.native
  
  /**
    * Total number of discovery connectors.
    */
  var totalConnectors: Integer = js.native
  
  /**
    * Number of unhealthy discovery connectors.
    */
  var unhealthyConnectors: Integer = js.native
  
  /**
    * Number of unknown discovery connectors.
    */
  var unknownConnectors: Integer = js.native
}
object CustomerConnectorInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CustomerConnectorInfoMutableBuilder[Self <: CustomerConnectorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveConnectors(value: Integer): Self = StObject.set(x, "activeConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackListedConnectors(value: Integer): Self = StObject.set(x, "blackListedConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyConnectors(value: Integer): Self = StObject.set(x, "healthyConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdownConnectors(value: Integer): Self = StObject.set(x, "shutdownConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalConnectors(value: Integer): Self = StObject.set(x, "totalConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyConnectors(value: Integer): Self = StObject.set(x, "unhealthyConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownConnectors(value: Integer): Self = StObject.set(x, "unknownConnectors", value.asInstanceOf[js.Any])
  }
}

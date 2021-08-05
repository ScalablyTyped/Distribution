package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeighborConnectionDetail extends StObject {
  
  /**
    * The number of open network connections with the neighboring server.
    */
  var connectionsCount: Long
  
  /**
    * The destination network port for the connection.
    */
  var destinationPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The ID of the server that accepted the network connection.
    */
  var destinationServerId: ConfigurationId
  
  /**
    * The ID of the server that opened the network connection.
    */
  var sourceServerId: ConfigurationId
  
  /**
    * The network protocol used for the connection.
    */
  var transportProtocol: js.UndefOr[String] = js.undefined
}
object NeighborConnectionDetail {
  
  inline def apply(connectionsCount: Long, destinationServerId: ConfigurationId, sourceServerId: ConfigurationId): NeighborConnectionDetail = {
    val __obj = js.Dynamic.literal(connectionsCount = connectionsCount.asInstanceOf[js.Any], destinationServerId = destinationServerId.asInstanceOf[js.Any], sourceServerId = sourceServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeighborConnectionDetail]
  }
  
  extension [Self <: NeighborConnectionDetail](x: Self) {
    
    inline def setConnectionsCount(value: Long): Self = StObject.set(x, "connectionsCount", value.asInstanceOf[js.Any])
    
    inline def setDestinationPort(value: BoxedInteger): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    inline def setDestinationServerId(value: ConfigurationId): Self = StObject.set(x, "destinationServerId", value.asInstanceOf[js.Any])
    
    inline def setSourceServerId(value: ConfigurationId): Self = StObject.set(x, "sourceServerId", value.asInstanceOf[js.Any])
    
    inline def setTransportProtocol(value: String): Self = StObject.set(x, "transportProtocol", value.asInstanceOf[js.Any])
    
    inline def setTransportProtocolUndefined: Self = StObject.set(x, "transportProtocol", js.undefined)
  }
}

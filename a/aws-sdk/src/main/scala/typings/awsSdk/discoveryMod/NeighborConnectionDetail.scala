package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeighborConnectionDetail extends StObject {
  
  /**
    * The number of open network connections with the neighboring server.
    */
  var connectionsCount: Long = js.native
  
  /**
    * The destination network port for the connection.
    */
  var destinationPort: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The ID of the server that accepted the network connection.
    */
  var destinationServerId: ConfigurationId = js.native
  
  /**
    * The ID of the server that opened the network connection.
    */
  var sourceServerId: ConfigurationId = js.native
  
  /**
    * The network protocol used for the connection.
    */
  var transportProtocol: js.UndefOr[String] = js.native
}
object NeighborConnectionDetail {
  
  @scala.inline
  def apply(connectionsCount: Long, destinationServerId: ConfigurationId, sourceServerId: ConfigurationId): NeighborConnectionDetail = {
    val __obj = js.Dynamic.literal(connectionsCount = connectionsCount.asInstanceOf[js.Any], destinationServerId = destinationServerId.asInstanceOf[js.Any], sourceServerId = sourceServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeighborConnectionDetail]
  }
  
  @scala.inline
  implicit class NeighborConnectionDetailMutableBuilder[Self <: NeighborConnectionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionsCount(value: Long): Self = StObject.set(x, "connectionsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPort(value: BoxedInteger): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    @scala.inline
    def setDestinationServerId(value: ConfigurationId): Self = StObject.set(x, "destinationServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServerId(value: ConfigurationId): Self = StObject.set(x, "sourceServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportProtocol(value: String): Self = StObject.set(x, "transportProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportProtocolUndefined: Self = StObject.set(x, "transportProtocol", js.undefined)
  }
}

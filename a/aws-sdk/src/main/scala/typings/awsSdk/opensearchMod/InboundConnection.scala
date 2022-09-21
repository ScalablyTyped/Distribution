package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundConnection extends StObject {
  
  /**
    * The connection ID for the inbound cross-cluster connection.
    */
  var ConnectionId: js.UndefOr[typings.awsSdk.opensearchMod.ConnectionId] = js.undefined
  
  /**
    * The  InboundConnectionStatus  for the outbound connection. 
    */
  var ConnectionStatus: js.UndefOr[InboundConnectionStatus] = js.undefined
  
  /**
    * The  AWSDomainInformation  for the local OpenSearch domain. 
    */
  var LocalDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
  
  /**
    * The  AWSDomainInformation  for the remote OpenSearch domain. 
    */
  var RemoteDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
}
object InboundConnection {
  
  inline def apply(): InboundConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundConnection]
  }
  
  extension [Self <: InboundConnection](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    inline def setConnectionStatus(value: InboundConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setLocalDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "LocalDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setLocalDomainInfoUndefined: Self = StObject.set(x, "LocalDomainInfo", js.undefined)
    
    inline def setRemoteDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "RemoteDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainInfoUndefined: Self = StObject.set(x, "RemoteDomainInfo", js.undefined)
  }
}

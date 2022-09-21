package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOutboundConnectionResponse extends StObject {
  
  /**
    * The connection alias provided during the create connection request.
    */
  var ConnectionAlias: js.UndefOr[typings.awsSdk.opensearchMod.ConnectionAlias] = js.undefined
  
  /**
    * The unique ID for the created outbound connection, which is used for subsequent operations on the connection.
    */
  var ConnectionId: js.UndefOr[typings.awsSdk.opensearchMod.ConnectionId] = js.undefined
  
  /**
    * The  OutboundConnectionStatus  for the newly created connection. 
    */
  var ConnectionStatus: js.UndefOr[OutboundConnectionStatus] = js.undefined
  
  /**
    * The  AWSDomainInformation  for the local OpenSearch domain. 
    */
  var LocalDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
  
  /**
    * The  AWSDomainInformation  for the remote OpenSearch domain. 
    */
  var RemoteDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
}
object CreateOutboundConnectionResponse {
  
  inline def apply(): CreateOutboundConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOutboundConnectionResponse]
  }
  
  extension [Self <: CreateOutboundConnectionResponse](x: Self) {
    
    inline def setConnectionAlias(value: ConnectionAlias): Self = StObject.set(x, "ConnectionAlias", value.asInstanceOf[js.Any])
    
    inline def setConnectionAliasUndefined: Self = StObject.set(x, "ConnectionAlias", js.undefined)
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    inline def setConnectionStatus(value: OutboundConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setLocalDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "LocalDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setLocalDomainInfoUndefined: Self = StObject.set(x, "LocalDomainInfo", js.undefined)
    
    inline def setRemoteDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "RemoteDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainInfoUndefined: Self = StObject.set(x, "RemoteDomainInfo", js.undefined)
  }
}

package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutboundCrossClusterSearchConnection extends StObject {
  
  /**
    * Specifies the connection alias for the outbound cross-cluster search connection.
    */
  var ConnectionAlias: js.UndefOr[typings.awsSdk.esMod.ConnectionAlias] = js.undefined
  
  /**
    * Specifies the OutboundCrossClusterSearchConnectionStatus for the outbound connection.
    */
  var ConnectionStatus: js.UndefOr[OutboundCrossClusterSearchConnectionStatus] = js.undefined
  
  /**
    * Specifies the connection id for the outbound cross-cluster search connection.
    */
  var CrossClusterSearchConnectionId: js.UndefOr[typings.awsSdk.esMod.CrossClusterSearchConnectionId] = js.undefined
  
  /**
    * Specifies the DomainInformation for the destination Elasticsearch domain.
    */
  var DestinationDomainInfo: js.UndefOr[DomainInformation] = js.undefined
  
  /**
    * Specifies the DomainInformation for the source Elasticsearch domain.
    */
  var SourceDomainInfo: js.UndefOr[DomainInformation] = js.undefined
}
object OutboundCrossClusterSearchConnection {
  
  @scala.inline
  def apply(): OutboundCrossClusterSearchConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutboundCrossClusterSearchConnection]
  }
  
  @scala.inline
  implicit class OutboundCrossClusterSearchConnectionMutableBuilder[Self <: OutboundCrossClusterSearchConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionAlias(value: ConnectionAlias): Self = StObject.set(x, "ConnectionAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionAliasUndefined: Self = StObject.set(x, "ConnectionAlias", js.undefined)
    
    @scala.inline
    def setConnectionStatus(value: OutboundCrossClusterSearchConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    @scala.inline
    def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossClusterSearchConnectionIdUndefined: Self = StObject.set(x, "CrossClusterSearchConnectionId", js.undefined)
    
    @scala.inline
    def setDestinationDomainInfo(value: DomainInformation): Self = StObject.set(x, "DestinationDomainInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDomainInfoUndefined: Self = StObject.set(x, "DestinationDomainInfo", js.undefined)
    
    @scala.inline
    def setSourceDomainInfo(value: DomainInformation): Self = StObject.set(x, "SourceDomainInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDomainInfoUndefined: Self = StObject.set(x, "SourceDomainInfo", js.undefined)
  }
}

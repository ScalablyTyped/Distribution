package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundCrossClusterSearchConnection extends StObject {
  
  /**
    * Specifies the InboundCrossClusterSearchConnectionStatus for the outbound connection.
    */
  var ConnectionStatus: js.UndefOr[InboundCrossClusterSearchConnectionStatus] = js.undefined
  
  /**
    * Specifies the connection id for the inbound cross-cluster search connection.
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
object InboundCrossClusterSearchConnection {
  
  @scala.inline
  def apply(): InboundCrossClusterSearchConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundCrossClusterSearchConnection]
  }
  
  @scala.inline
  implicit class InboundCrossClusterSearchConnectionMutableBuilder[Self <: InboundCrossClusterSearchConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionStatus(value: InboundCrossClusterSearchConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
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

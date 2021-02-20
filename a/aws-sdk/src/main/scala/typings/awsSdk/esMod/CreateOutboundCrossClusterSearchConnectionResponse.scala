package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOutboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the connection alias provided during the create connection request.
    */
  var ConnectionAlias: js.UndefOr[typings.awsSdk.esMod.ConnectionAlias] = js.native
  
  /**
    * Specifies the OutboundCrossClusterSearchConnectionStatus for the newly created connection.
    */
  var ConnectionStatus: js.UndefOr[OutboundCrossClusterSearchConnectionStatus] = js.native
  
  /**
    * Unique id for the created outbound connection, which is used for subsequent operations on connection.
    */
  var CrossClusterSearchConnectionId: js.UndefOr[typings.awsSdk.esMod.CrossClusterSearchConnectionId] = js.native
  
  /**
    * Specifies the DomainInformation for the destination Elasticsearch domain.
    */
  var DestinationDomainInfo: js.UndefOr[DomainInformation] = js.native
  
  /**
    * Specifies the DomainInformation for the source Elasticsearch domain.
    */
  var SourceDomainInfo: js.UndefOr[DomainInformation] = js.native
}
object CreateOutboundCrossClusterSearchConnectionResponse {
  
  @scala.inline
  def apply(): CreateOutboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOutboundCrossClusterSearchConnectionResponse]
  }
  
  @scala.inline
  implicit class CreateOutboundCrossClusterSearchConnectionResponseMutableBuilder[Self <: CreateOutboundCrossClusterSearchConnectionResponse] (val x: Self) extends AnyVal {
    
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

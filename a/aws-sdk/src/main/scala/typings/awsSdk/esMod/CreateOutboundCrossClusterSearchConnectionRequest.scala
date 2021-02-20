package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOutboundCrossClusterSearchConnectionRequest extends StObject {
  
  /**
    * Specifies the connection alias that will be used by the customer for this connection.
    */
  var ConnectionAlias: typings.awsSdk.esMod.ConnectionAlias = js.native
  
  /**
    * Specifies the DomainInformation for the destination Elasticsearch domain.
    */
  var DestinationDomainInfo: DomainInformation = js.native
  
  /**
    * Specifies the DomainInformation for the source Elasticsearch domain.
    */
  var SourceDomainInfo: DomainInformation = js.native
}
object CreateOutboundCrossClusterSearchConnectionRequest {
  
  @scala.inline
  def apply(
    ConnectionAlias: ConnectionAlias,
    DestinationDomainInfo: DomainInformation,
    SourceDomainInfo: DomainInformation
  ): CreateOutboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionAlias = ConnectionAlias.asInstanceOf[js.Any], DestinationDomainInfo = DestinationDomainInfo.asInstanceOf[js.Any], SourceDomainInfo = SourceDomainInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOutboundCrossClusterSearchConnectionRequest]
  }
  
  @scala.inline
  implicit class CreateOutboundCrossClusterSearchConnectionRequestMutableBuilder[Self <: CreateOutboundCrossClusterSearchConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionAlias(value: ConnectionAlias): Self = StObject.set(x, "ConnectionAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDomainInfo(value: DomainInformation): Self = StObject.set(x, "DestinationDomainInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDomainInfo(value: DomainInformation): Self = StObject.set(x, "SourceDomainInfo", value.asInstanceOf[js.Any])
  }
}

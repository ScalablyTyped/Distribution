package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOutboundCrossClusterSearchConnectionResponse extends js.Object {
  
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
  implicit class CreateOutboundCrossClusterSearchConnectionResponseOps[Self <: CreateOutboundCrossClusterSearchConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionAlias(value: ConnectionAlias): Self = this.set("ConnectionAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionAlias: Self = this.set("ConnectionAlias", js.undefined)
    
    @scala.inline
    def setConnectionStatus(value: OutboundCrossClusterSearchConnectionStatus): Self = this.set("ConnectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionStatus: Self = this.set("ConnectionStatus", js.undefined)
    
    @scala.inline
    def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = this.set("CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossClusterSearchConnectionId: Self = this.set("CrossClusterSearchConnectionId", js.undefined)
    
    @scala.inline
    def setDestinationDomainInfo(value: DomainInformation): Self = this.set("DestinationDomainInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationDomainInfo: Self = this.set("DestinationDomainInfo", js.undefined)
    
    @scala.inline
    def setSourceDomainInfo(value: DomainInformation): Self = this.set("SourceDomainInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDomainInfo: Self = this.set("SourceDomainInfo", js.undefined)
  }
}

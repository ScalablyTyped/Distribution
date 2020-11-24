package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InboundCrossClusterSearchConnection extends js.Object {
  
  /**
    * Specifies the InboundCrossClusterSearchConnectionStatus for the outbound connection.
    */
  var ConnectionStatus: js.UndefOr[InboundCrossClusterSearchConnectionStatus] = js.native
  
  /**
    * Specifies the connection id for the inbound cross-cluster search connection.
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
object InboundCrossClusterSearchConnection {
  
  @scala.inline
  def apply(): InboundCrossClusterSearchConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundCrossClusterSearchConnection]
  }
  
  @scala.inline
  implicit class InboundCrossClusterSearchConnectionOps[Self <: InboundCrossClusterSearchConnection] (val x: Self) extends AnyVal {
    
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
    def setConnectionStatus(value: InboundCrossClusterSearchConnectionStatus): Self = this.set("ConnectionStatus", value.asInstanceOf[js.Any])
    
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

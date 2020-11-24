package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOutboundCrossClusterSearchConnectionRequest extends js.Object {
  
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
  implicit class CreateOutboundCrossClusterSearchConnectionRequestOps[Self <: CreateOutboundCrossClusterSearchConnectionRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationDomainInfo(value: DomainInformation): Self = this.set("DestinationDomainInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDomainInfo(value: DomainInformation): Self = this.set("SourceDomainInfo", value.asInstanceOf[js.Any])
  }
}

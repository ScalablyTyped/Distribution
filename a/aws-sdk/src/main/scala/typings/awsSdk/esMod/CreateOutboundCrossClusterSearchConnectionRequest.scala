package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}


package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ConnectionAlias: ConnectionAlias = null,
    ConnectionStatus: OutboundCrossClusterSearchConnectionStatus = null,
    CrossClusterSearchConnectionId: CrossClusterSearchConnectionId = null,
    DestinationDomainInfo: DomainInformation = null,
    SourceDomainInfo: DomainInformation = null
  ): CreateOutboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (ConnectionAlias != null) __obj.updateDynamic("ConnectionAlias")(ConnectionAlias.asInstanceOf[js.Any])
    if (ConnectionStatus != null) __obj.updateDynamic("ConnectionStatus")(ConnectionStatus.asInstanceOf[js.Any])
    if (CrossClusterSearchConnectionId != null) __obj.updateDynamic("CrossClusterSearchConnectionId")(CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    if (DestinationDomainInfo != null) __obj.updateDynamic("DestinationDomainInfo")(DestinationDomainInfo.asInstanceOf[js.Any])
    if (SourceDomainInfo != null) __obj.updateDynamic("SourceDomainInfo")(SourceDomainInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOutboundCrossClusterSearchConnectionResponse]
  }
}


package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoaRequest extends js.Object {
  /**
    * The ID of a connection, LAG, or interconnect.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
  /**
    * The name of the service provider who establishes connectivity on your behalf. If you specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
}

object DescribeLoaRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    loaContentType: LoaContentType = null,
    providerName: ProviderName = null
  ): DescribeLoaRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    if (loaContentType != null) __obj.updateDynamic("loaContentType")(loaContentType.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoaRequest]
  }
}


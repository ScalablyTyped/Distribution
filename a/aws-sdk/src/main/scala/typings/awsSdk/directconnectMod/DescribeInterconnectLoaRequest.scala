package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInterconnectLoaRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId = js.native
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
  /**
    * The name of the service provider who establishes connectivity on your behalf. If you supply this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
}

object DescribeInterconnectLoaRequest {
  @scala.inline
  def apply(
    interconnectId: InterconnectId,
    loaContentType: LoaContentType = null,
    providerName: ProviderName = null
  ): DescribeInterconnectLoaRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    if (loaContentType != null) __obj.updateDynamic("loaContentType")(loaContentType.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInterconnectLoaRequest]
  }
}


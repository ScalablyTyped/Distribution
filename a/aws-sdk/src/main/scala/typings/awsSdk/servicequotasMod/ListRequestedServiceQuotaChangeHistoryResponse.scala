package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRequestedServiceQuotaChangeHistoryResponse extends js.Object {
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.native
  /**
    * Returns a list of service quota requests.
    */
  var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.native
}

object ListRequestedServiceQuotaChangeHistoryResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    RequestedQuotas: RequestedServiceQuotaChangeHistoryListDefinition = null
  ): ListRequestedServiceQuotaChangeHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestedQuotas != null) __obj.updateDynamic("RequestedQuotas")(RequestedQuotas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryResponse]
  }
}


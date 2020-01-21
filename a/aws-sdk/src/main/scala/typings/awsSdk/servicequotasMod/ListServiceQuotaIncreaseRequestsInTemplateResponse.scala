package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceQuotaIncreaseRequestsInTemplateResponse extends js.Object {
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.native
  /**
    * Returns the list of values of the quota increase request in the template.
    */
  var ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceQuotaIncreaseRequestInTemplateList] = js.native
}

object ListServiceQuotaIncreaseRequestsInTemplateResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    ServiceQuotaIncreaseRequestInTemplateList: ServiceQuotaIncreaseRequestInTemplateList = null
  ): ListServiceQuotaIncreaseRequestsInTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServiceQuotaIncreaseRequestInTemplateList != null) __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplateList")(ServiceQuotaIncreaseRequestInTemplateList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateResponse]
  }
}


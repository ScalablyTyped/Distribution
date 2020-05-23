package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationRequestsResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The number of Qualification requests on this page in the filtered results list, equivalent to the number of Qualification requests being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  /**
    * The Qualification request. The response includes one QualificationRequest element for each Qualification request returned by the query.
    */
  var QualificationRequests: js.UndefOr[QualificationRequestList] = js.native
}

object ListQualificationRequestsResponse {
  @scala.inline
  def apply(
    NextToken: PaginationToken = null,
    NumResults: js.UndefOr[Integer] = js.undefined,
    QualificationRequests: QualificationRequestList = null
  ): ListQualificationRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(NumResults)) __obj.updateDynamic("NumResults")(NumResults.get.asInstanceOf[js.Any])
    if (QualificationRequests != null) __obj.updateDynamic("QualificationRequests")(QualificationRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQualificationRequestsResponse]
  }
}


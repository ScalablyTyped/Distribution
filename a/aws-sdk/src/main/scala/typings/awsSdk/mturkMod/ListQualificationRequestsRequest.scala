package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationRequestsRequest extends js.Object {
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
}

object ListQualificationRequestsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[ResultSize] = js.undefined,
    NextToken: PaginationToken = null,
    QualificationTypeId: EntityId = null
  ): ListQualificationRequestsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (QualificationTypeId != null) __obj.updateDynamic("QualificationTypeId")(QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQualificationRequestsRequest]
  }
}


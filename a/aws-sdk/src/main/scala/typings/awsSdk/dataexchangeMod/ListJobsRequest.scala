package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: js.UndefOr[string] = js.native
  /**
    * The maximum number of results returned by a single call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.dataexchangeMod.MaxResults] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: js.UndefOr[string] = js.native
}

object ListJobsRequest {
  @scala.inline
  def apply(
    DataSetId: string = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: string = null,
    RevisionId: string = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (DataSetId != null) __obj.updateDynamic("DataSetId")(DataSetId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
}


package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCollectionsRequest extends js.Object {
  /**
    * Maximum number of collection IDs to return. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * Pagination token from the previous response.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListCollectionsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[PageSize] = js.undefined, NextToken: PaginationToken = null): ListCollectionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCollectionsRequest]
  }
}


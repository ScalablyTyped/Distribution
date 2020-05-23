package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSharedProjectsInput extends js.Object {
  /**
    *  The maximum number of paginated shared build projects returned per response. Use nextToken to iterate pages in the list of returned Project objects. The default value is 100. 
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The criterion to be used to list build projects shared with the current AWS account or user. Valid values include:     ARN: List based on the ARN.     MODIFIED_TIME: List based on when information about the shared project was last changed.   
    */
  var sortBy: js.UndefOr[SharedResourceSortByType] = js.native
  /**
    * The order in which to list shared build projects. Valid values include:    ASCENDING: List in ascending order.    DESCENDING: List in descending order.  
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.native
}

object ListSharedProjectsInput {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[PageSize] = js.undefined,
    nextToken: NonEmptyString = null,
    sortBy: SharedResourceSortByType = null,
    sortOrder: SortOrderType = null
  ): ListSharedProjectsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSharedProjectsInput]
  }
}


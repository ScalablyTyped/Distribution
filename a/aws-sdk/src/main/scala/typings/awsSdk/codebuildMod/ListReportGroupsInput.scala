package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReportGroupsInput extends js.Object {
  /**
    *  The maximum number of paginated report groups returned per response. Use nextToken to iterate pages in the list of returned ReportGroup objects. The default value is 100. 
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    *  The criterion to be used to list build report groups. Valid values include:     CREATED_TIME: List based on when each report group was created.    LAST_MODIFIED_TIME: List based on when each report group was last changed.    NAME: List based on each report group's name.  
    */
  var sortBy: js.UndefOr[ReportGroupSortByType] = js.native
  /**
    *  Used to specify the order to sort the list of returned report groups. Valid values are ASCENDING and DESCENDING. 
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.native
}

object ListReportGroupsInput {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[PageSize] = js.undefined,
    nextToken: String = null,
    sortBy: ReportGroupSortByType = null,
    sortOrder: SortOrderType = null
  ): ListReportGroupsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReportGroupsInput]
  }
}


package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReportsForReportGroupInput extends js.Object {
  /**
    *  A ReportFilter object used to filter the returned reports. 
    */
  var filter: js.UndefOr[ReportFilter] = js.native
  /**
    *  The maximum number of paginated reports in this report group returned per response. Use nextToken to iterate pages in the list of returned Report objects. The default value is 100. 
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    *  The ARN of the report group for which you want to return report ARNs. 
    */
  var reportGroupArn: String = js.native
  /**
    *  Use to specify whether the results are returned in ascending or descending order. 
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.native
}

object ListReportsForReportGroupInput {
  @scala.inline
  def apply(
    reportGroupArn: String,
    filter: ReportFilter = null,
    maxResults: js.UndefOr[PageSize] = js.undefined,
    nextToken: String = null,
    sortOrder: SortOrderType = null
  ): ListReportsForReportGroupInput = {
    val __obj = js.Dynamic.literal(reportGroupArn = reportGroupArn.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReportsForReportGroupInput]
  }
}


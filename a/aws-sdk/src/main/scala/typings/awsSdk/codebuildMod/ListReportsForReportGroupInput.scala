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
  def apply(reportGroupArn: String): ListReportsForReportGroupInput = {
    val __obj = js.Dynamic.literal(reportGroupArn = reportGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReportsForReportGroupInput]
  }
  @scala.inline
  implicit class ListReportsForReportGroupInputOps[Self <: ListReportsForReportGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReportGroupArn(value: String): Self = this.set("reportGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: ReportFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}


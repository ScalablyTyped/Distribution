package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageStatisticsRequest extends js.Object {
  /**
    * An array of objects, one for each condition to use to filter the query results. If the array contains more than one object, Amazon Macie uses an AND operator to join the conditions specified by the objects.
    */
  var filterBy: js.UndefOr[listOfUsageStatisticsFilter] = js.native
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.native
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  /**
    * The criteria to use to sort the query results.
    */
  var sortBy: js.UndefOr[UsageStatisticsSortBy] = js.native
}

object GetUsageStatisticsRequest {
  @scala.inline
  def apply(): GetUsageStatisticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageStatisticsRequest]
  }
  @scala.inline
  implicit class GetUsageStatisticsRequestOps[Self <: GetUsageStatisticsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilterByVarargs(value: UsageStatisticsFilter*): Self = this.set("filterBy", js.Array(value :_*))
    @scala.inline
    def setFilterBy(value: listOfUsageStatisticsFilter): Self = this.set("filterBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    @scala.inline
    def setMaxResults(value: integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSortBy(value: UsageStatisticsSortBy): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
  }
  
}


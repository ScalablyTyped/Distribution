package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageStatisticsResponse extends js.Object {
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
  /**
    * An array of objects that contains the results of the query. Each object contains the data for an account that meets the filter criteria specified in the request.
    */
  var records: js.UndefOr[listOfUsageRecord] = js.native
}

object GetUsageStatisticsResponse {
  @scala.inline
  def apply(): GetUsageStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageStatisticsResponse]
  }
  @scala.inline
  implicit class GetUsageStatisticsResponseOps[Self <: GetUsageStatisticsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRecordsVarargs(value: UsageRecord*): Self = this.set("records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: listOfUsageRecord): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
  }
  
}


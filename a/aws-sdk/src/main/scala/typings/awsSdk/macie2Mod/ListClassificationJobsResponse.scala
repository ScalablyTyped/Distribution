package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClassificationJobsResponse extends js.Object {
  /**
    * An array of objects, one for each job that meets the filter criteria specified in the request.
    */
  var items: js.UndefOr[listOfJobSummary] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object ListClassificationJobsResponse {
  @scala.inline
  def apply(): ListClassificationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClassificationJobsResponse]
  }
  @scala.inline
  implicit class ListClassificationJobsResponseOps[Self <: ListClassificationJobsResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: JobSummary*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: listOfJobSummary): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


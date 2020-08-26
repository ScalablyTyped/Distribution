package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHarvestJobsResponse extends js.Object {
  /**
    * A list of HarvestJob records.
    */
  var HarvestJobs: js.UndefOr[listOfHarvestJob] = js.native
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListHarvestJobsResponse {
  @scala.inline
  def apply(): ListHarvestJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHarvestJobsResponse]
  }
  @scala.inline
  implicit class ListHarvestJobsResponseOps[Self <: ListHarvestJobsResponse] (val x: Self) extends AnyVal {
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
    def setHarvestJobsVarargs(value: HarvestJob*): Self = this.set("HarvestJobs", js.Array(value :_*))
    @scala.inline
    def setHarvestJobs(value: listOfHarvestJob): Self = this.set("HarvestJobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHarvestJobs: Self = this.set("HarvestJobs", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


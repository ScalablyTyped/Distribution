package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResult extends js.Object {
  /**
    * The list of current jobs and jobs that have ended within the last 30 days.
    */
  var Jobs: js.UndefOr[JobListDescriptorList] = js.native
  /**
    * If the List Jobs request produced more than the maximum number of results, you can pass this value into a subsequent List Jobs request in order to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[StringForNextToken] = js.native
}

object ListJobsResult {
  @scala.inline
  def apply(): ListJobsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResult]
  }
  @scala.inline
  implicit class ListJobsResultOps[Self <: ListJobsResult] (val x: Self) extends AnyVal {
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
    def setJobsVarargs(value: JobListDescriptor*): Self = this.set("Jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: JobListDescriptorList): Self = this.set("Jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobs: Self = this.set("Jobs", js.undefined)
    @scala.inline
    def setNextToken(value: StringForNextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


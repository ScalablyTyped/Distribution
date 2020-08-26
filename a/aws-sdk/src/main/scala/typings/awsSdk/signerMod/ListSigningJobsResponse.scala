package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSigningJobsResponse extends js.Object {
  /**
    * A list of your signing jobs.
    */
  var jobs: js.UndefOr[SigningJobs] = js.native
  /**
    * String for specifying the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListSigningJobsResponse {
  @scala.inline
  def apply(): ListSigningJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningJobsResponse]
  }
  @scala.inline
  implicit class ListSigningJobsResponseOps[Self <: ListSigningJobsResponse] (val x: Self) extends AnyVal {
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
    def setJobsVarargs(value: SigningJob*): Self = this.set("jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: SigningJobs): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


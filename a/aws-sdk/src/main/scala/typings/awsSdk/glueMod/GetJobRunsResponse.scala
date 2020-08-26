package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunsResponse extends js.Object {
  /**
    * A list of job-run metadata objects.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.native
  /**
    * A continuation token, if not all requested job runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetJobRunsResponse {
  @scala.inline
  def apply(): GetJobRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunsResponse]
  }
  @scala.inline
  implicit class GetJobRunsResponseOps[Self <: GetJobRunsResponse] (val x: Self) extends AnyVal {
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
    def setJobRunsVarargs(value: JobRun*): Self = this.set("JobRuns", js.Array(value :_*))
    @scala.inline
    def setJobRuns(value: JobRunList): Self = this.set("JobRuns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobRuns: Self = this.set("JobRuns", js.undefined)
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetJobsResponse extends js.Object {
  
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.native
  
  /**
    * A list of names of jobs not found.
    */
  var JobsNotFound: js.UndefOr[JobNameList] = js.native
}
object BatchGetJobsResponse {
  
  @scala.inline
  def apply(): BatchGetJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetJobsResponse]
  }
  
  @scala.inline
  implicit class BatchGetJobsResponseOps[Self <: BatchGetJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setJobsVarargs(value: Job*): Self = this.set("Jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: JobList): Self = this.set("Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("Jobs", js.undefined)
    
    @scala.inline
    def setJobsNotFoundVarargs(value: NameString*): Self = this.set("JobsNotFound", js.Array(value :_*))
    
    @scala.inline
    def setJobsNotFound(value: JobNameList): Self = this.set("JobsNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobsNotFound: Self = this.set("JobsNotFound", js.undefined)
  }
}

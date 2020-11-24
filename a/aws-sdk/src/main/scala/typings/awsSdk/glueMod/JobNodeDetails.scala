package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobNodeDetails extends js.Object {
  
  /**
    * The information for the job runs represented by the job node.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.native
}
object JobNodeDetails {
  
  @scala.inline
  def apply(): JobNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobNodeDetails]
  }
  
  @scala.inline
  implicit class JobNodeDetailsOps[Self <: JobNodeDetails] (val x: Self) extends AnyVal {
    
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
  }
}

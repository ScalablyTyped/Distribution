package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsOutput extends js.Object {
  
  var IsTruncated: js.UndefOr[typings.awsSdk.importexportMod.IsTruncated] = js.native
  
  var Jobs: js.UndefOr[JobsList] = js.native
}
object ListJobsOutput {
  
  @scala.inline
  def apply(): ListJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsOutput]
  }
  
  @scala.inline
  implicit class ListJobsOutputOps[Self <: ListJobsOutput] (val x: Self) extends AnyVal {
    
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
    def setIsTruncated(value: IsTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: Job*): Self = this.set("Jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: JobsList): Self = this.set("Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("Jobs", js.undefined)
  }
}

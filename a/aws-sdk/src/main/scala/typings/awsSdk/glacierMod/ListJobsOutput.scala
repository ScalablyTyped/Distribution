package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsOutput extends js.Object {
  
  /**
    * A list of job objects. Each job object contains metadata describing the job.
    */
  var JobList: js.UndefOr[typings.awsSdk.glacierMod.JobList] = js.native
  
  /**
    *  An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of the results started in a previous List Jobs request. 
    */
  var Marker: js.UndefOr[String] = js.native
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
    def setJobListVarargs(value: GlacierJobDescription*): Self = this.set("JobList", js.Array(value :_*))
    
    @scala.inline
    def setJobList(value: JobList): Self = this.set("JobList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobList: Self = this.set("JobList", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}

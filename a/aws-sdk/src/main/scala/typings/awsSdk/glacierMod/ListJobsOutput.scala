package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsOutput extends StObject {
  
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
  implicit class ListJobsOutputMutableBuilder[Self <: ListJobsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobList(value: JobList): Self = StObject.set(x, "JobList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobListUndefined: Self = StObject.set(x, "JobList", js.undefined)
    
    @scala.inline
    def setJobListVarargs(value: GlacierJobDescription*): Self = StObject.set(x, "JobList", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}

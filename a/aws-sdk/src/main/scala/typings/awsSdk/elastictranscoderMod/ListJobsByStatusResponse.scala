package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsByStatusResponse extends StObject {
  
  /**
    * An array of Job objects that have the specified status.
    */
  var Jobs: js.UndefOr[typings.awsSdk.elastictranscoderMod.Jobs] = js.native
  
  /**
    *  A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified pipeline fit on one page or when you've reached the last page of results, the value of NextPageToken is null. 
    */
  var NextPageToken: js.UndefOr[Id] = js.native
}
object ListJobsByStatusResponse {
  
  @scala.inline
  def apply(): ListJobsByStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsByStatusResponse]
  }
  
  @scala.inline
  implicit class ListJobsByStatusResponseMutableBuilder[Self <: ListJobsByStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: Jobs): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: Id): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}

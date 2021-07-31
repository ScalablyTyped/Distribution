package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsResponse extends StObject {
  
  /**
    * List of jobs
    */
  var Jobs: js.UndefOr[listOfJob] = js.undefined
  
  /**
    * Use this string to request the next batch of jobs.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListJobsResponse {
  
  @scala.inline
  def apply(): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResponse]
  }
  
  @scala.inline
  implicit class ListJobsResponseMutableBuilder[Self <: ListJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: listOfJob): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

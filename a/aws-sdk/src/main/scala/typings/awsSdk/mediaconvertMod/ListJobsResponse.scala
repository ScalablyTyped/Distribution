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
  
  inline def apply(): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResponse]
  }
  
  extension [Self <: ListJobsResponse](x: Self) {
    
    inline def setJobs(value: listOfJob): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

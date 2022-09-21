package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsResponse extends StObject {
  
  /**
    * A list of jobs that are defined.
    */
  var Jobs: JobList
  
  /**
    * A token that you can use in a subsequent call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.databrewMod.NextToken] = js.undefined
}
object ListJobsResponse {
  
  inline def apply(Jobs: JobList): ListJobsResponse = {
    val __obj = js.Dynamic.literal(Jobs = Jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResponse]
  }
  
  extension [Self <: ListJobsResponse](x: Self) {
    
    inline def setJobs(value: JobList): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

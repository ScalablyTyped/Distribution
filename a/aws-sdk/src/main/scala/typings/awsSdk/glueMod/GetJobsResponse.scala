package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobsResponse extends StObject {
  
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.undefined
  
  /**
    * A continuation token, if not all job definitions have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetJobsResponse {
  
  inline def apply(): GetJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobsResponse]
  }
  
  extension [Self <: GetJobsResponse](x: Self) {
    
    inline def setJobs(value: JobList): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

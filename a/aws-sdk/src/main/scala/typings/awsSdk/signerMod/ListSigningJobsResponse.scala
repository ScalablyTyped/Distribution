package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSigningJobsResponse extends StObject {
  
  /**
    * A list of your signing jobs.
    */
  var jobs: js.UndefOr[SigningJobs] = js.undefined
  
  /**
    * String for specifying the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListSigningJobsResponse {
  
  inline def apply(): ListSigningJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningJobsResponse]
  }
  
  extension [Self <: ListSigningJobsResponse](x: Self) {
    
    inline def setJobs(value: SigningJobs): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SigningJob*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

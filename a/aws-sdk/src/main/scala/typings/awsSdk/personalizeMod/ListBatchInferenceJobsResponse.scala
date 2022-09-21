package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchInferenceJobsResponse extends StObject {
  
  /**
    * A list containing information on each job that is returned.
    */
  var batchInferenceJobs: js.UndefOr[BatchInferenceJobs] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBatchInferenceJobsResponse {
  
  inline def apply(): ListBatchInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchInferenceJobsResponse]
  }
  
  extension [Self <: ListBatchInferenceJobsResponse](x: Self) {
    
    inline def setBatchInferenceJobs(value: BatchInferenceJobs): Self = StObject.set(x, "batchInferenceJobs", value.asInstanceOf[js.Any])
    
    inline def setBatchInferenceJobsUndefined: Self = StObject.set(x, "batchInferenceJobs", js.undefined)
    
    inline def setBatchInferenceJobsVarargs(value: BatchInferenceJobSummary*): Self = StObject.set(x, "batchInferenceJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

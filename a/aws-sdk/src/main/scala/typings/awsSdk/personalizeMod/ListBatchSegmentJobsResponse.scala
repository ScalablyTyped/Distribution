package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchSegmentJobsResponse extends StObject {
  
  /**
    * A list containing information on each job that is returned.
    */
  var batchSegmentJobs: js.UndefOr[BatchSegmentJobs] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBatchSegmentJobsResponse {
  
  inline def apply(): ListBatchSegmentJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchSegmentJobsResponse]
  }
  
  extension [Self <: ListBatchSegmentJobsResponse](x: Self) {
    
    inline def setBatchSegmentJobs(value: BatchSegmentJobs): Self = StObject.set(x, "batchSegmentJobs", value.asInstanceOf[js.Any])
    
    inline def setBatchSegmentJobsUndefined: Self = StObject.set(x, "batchSegmentJobs", js.undefined)
    
    inline def setBatchSegmentJobsVarargs(value: BatchSegmentJobSummary*): Self = StObject.set(x, "batchSegmentJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

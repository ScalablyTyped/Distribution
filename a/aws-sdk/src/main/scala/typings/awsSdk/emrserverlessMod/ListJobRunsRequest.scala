package typings.awsSdk.emrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobRunsRequest extends StObject {
  
  /**
    * The ID of the application for which to list the job run.
    */
  var applicationId: ApplicationId
  
  /**
    * The lower bound of the option to filter by creation date and time.
    */
  var createdAtAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The upper bound of the option to filter by creation date and time.
    */
  var createdAtBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of job runs that can be listed.
    */
  var maxResults: js.UndefOr[ListJobRunsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token for the next set of job run results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An optional filter for job run states. Note that if this filter contains multiple states, the resulting list will be grouped by the state.
    */
  var states: js.UndefOr[JobRunStateSet] = js.undefined
}
object ListJobRunsRequest {
  
  inline def apply(applicationId: ApplicationId): ListJobRunsRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobRunsRequest]
  }
  
  extension [Self <: ListJobRunsRequest](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtAfter(value: js.Date): Self = StObject.set(x, "createdAtAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtAfterUndefined: Self = StObject.set(x, "createdAtAfter", js.undefined)
    
    inline def setCreatedAtBefore(value: js.Date): Self = StObject.set(x, "createdAtBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtBeforeUndefined: Self = StObject.set(x, "createdAtBefore", js.undefined)
    
    inline def setMaxResults(value: ListJobRunsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStates(value: JobRunStateSet): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: JobRunState*): Self = StObject.set(x, "states", js.Array(value*))
  }
}

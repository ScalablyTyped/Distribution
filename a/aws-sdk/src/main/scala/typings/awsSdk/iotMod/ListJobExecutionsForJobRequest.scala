package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobExecutionsForJobRequest extends StObject {
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
  
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The status of the job.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
}
object ListJobExecutionsForJobRequest {
  
  @scala.inline
  def apply(jobId: JobId): ListJobExecutionsForJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobExecutionsForJobRequest]
  }
  
  @scala.inline
  implicit class ListJobExecutionsForJobRequestMutableBuilder[Self <: ListJobExecutionsForJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: LaserMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

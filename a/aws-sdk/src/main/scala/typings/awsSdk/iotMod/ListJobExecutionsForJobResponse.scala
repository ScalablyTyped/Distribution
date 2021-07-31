package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobExecutionsForJobResponse extends StObject {
  
  /**
    * A list of job execution summaries.
    */
  var executionSummaries: js.UndefOr[JobExecutionSummaryForJobList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListJobExecutionsForJobResponse {
  
  @scala.inline
  def apply(): ListJobExecutionsForJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobExecutionsForJobResponse]
  }
  
  @scala.inline
  implicit class ListJobExecutionsForJobResponseMutableBuilder[Self <: ListJobExecutionsForJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionSummaries(value: JobExecutionSummaryForJobList): Self = StObject.set(x, "executionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionSummariesUndefined: Self = StObject.set(x, "executionSummaries", js.undefined)
    
    @scala.inline
    def setExecutionSummariesVarargs(value: JobExecutionSummaryForJob*): Self = StObject.set(x, "executionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

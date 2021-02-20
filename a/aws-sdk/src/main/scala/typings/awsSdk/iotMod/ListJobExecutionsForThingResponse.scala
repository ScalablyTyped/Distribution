package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobExecutionsForThingResponse extends StObject {
  
  /**
    * A list of job execution summaries.
    */
  var executionSummaries: js.UndefOr[JobExecutionSummaryForThingList] = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListJobExecutionsForThingResponse {
  
  @scala.inline
  def apply(): ListJobExecutionsForThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobExecutionsForThingResponse]
  }
  
  @scala.inline
  implicit class ListJobExecutionsForThingResponseMutableBuilder[Self <: ListJobExecutionsForThingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionSummaries(value: JobExecutionSummaryForThingList): Self = StObject.set(x, "executionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionSummariesUndefined: Self = StObject.set(x, "executionSummaries", js.undefined)
    
    @scala.inline
    def setExecutionSummariesVarargs(value: JobExecutionSummaryForThing*): Self = StObject.set(x, "executionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

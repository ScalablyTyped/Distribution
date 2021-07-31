package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAutoMLJobsResponse extends StObject {
  
  /**
    * Returns a summary list of jobs.
    */
  var AutoMLJobSummaries: typings.awsSdk.sagemakerMod.AutoMLJobSummaries
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListAutoMLJobsResponse {
  
  @scala.inline
  def apply(AutoMLJobSummaries: AutoMLJobSummaries): ListAutoMLJobsResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobSummaries = AutoMLJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAutoMLJobsResponse]
  }
  
  @scala.inline
  implicit class ListAutoMLJobsResponseMutableBuilder[Self <: ListAutoMLJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMLJobSummaries(value: AutoMLJobSummaries): Self = StObject.set(x, "AutoMLJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobSummariesVarargs(value: AutoMLJobSummary*): Self = StObject.set(x, "AutoMLJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

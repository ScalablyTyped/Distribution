package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStackSetOperationResultsOutput extends StObject {
  
  /**
    * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of StackSetOperationResultSummary structures that contain information about the specified operation results, for accounts and Regions that are included in the operation.
    */
  var Summaries: js.UndefOr[StackSetOperationResultSummaries] = js.native
}
object ListStackSetOperationResultsOutput {
  
  @scala.inline
  def apply(): ListStackSetOperationResultsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackSetOperationResultsOutput]
  }
  
  @scala.inline
  implicit class ListStackSetOperationResultsOutputMutableBuilder[Self <: ListStackSetOperationResultsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSummaries(value: StackSetOperationResultSummaries): Self = StObject.set(x, "Summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesUndefined: Self = StObject.set(x, "Summaries", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: StackSetOperationResultSummary*): Self = StObject.set(x, "Summaries", js.Array(value :_*))
  }
}

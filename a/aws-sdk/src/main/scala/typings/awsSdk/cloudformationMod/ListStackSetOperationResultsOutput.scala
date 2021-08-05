package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStackSetOperationResultsOutput extends StObject {
  
  /**
    * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of StackSetOperationResultSummary structures that contain information about the specified operation results, for accounts and Regions that are included in the operation.
    */
  var Summaries: js.UndefOr[StackSetOperationResultSummaries] = js.undefined
}
object ListStackSetOperationResultsOutput {
  
  inline def apply(): ListStackSetOperationResultsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackSetOperationResultsOutput]
  }
  
  extension [Self <: ListStackSetOperationResultsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaries(value: StackSetOperationResultSummaries): Self = StObject.set(x, "Summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "Summaries", js.undefined)
    
    inline def setSummariesVarargs(value: StackSetOperationResultSummary*): Self = StObject.set(x, "Summaries", js.Array(value :_*))
  }
}

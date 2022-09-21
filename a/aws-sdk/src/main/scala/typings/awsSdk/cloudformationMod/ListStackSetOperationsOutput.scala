package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStackSetOperationsOutput extends StObject {
  
  /**
    * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of StackSetOperationSummary structures that contain summary information about operations for the specified stack set.
    */
  var Summaries: js.UndefOr[StackSetOperationSummaries] = js.undefined
}
object ListStackSetOperationsOutput {
  
  inline def apply(): ListStackSetOperationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackSetOperationsOutput]
  }
  
  extension [Self <: ListStackSetOperationsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaries(value: StackSetOperationSummaries): Self = StObject.set(x, "Summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "Summaries", js.undefined)
    
    inline def setSummariesVarargs(value: StackSetOperationSummary*): Self = StObject.set(x, "Summaries", js.Array(value*))
  }
}

package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStackInstancesOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of StackInstanceSummary structures that contain information about the specified stack instances.
    */
  var Summaries: js.UndefOr[StackInstanceSummaries] = js.undefined
}
object ListStackInstancesOutput {
  
  inline def apply(): ListStackInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackInstancesOutput]
  }
  
  extension [Self <: ListStackInstancesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaries(value: StackInstanceSummaries): Self = StObject.set(x, "Summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "Summaries", js.undefined)
    
    inline def setSummariesVarargs(value: StackInstanceSummary*): Self = StObject.set(x, "Summaries", js.Array(value :_*))
  }
}

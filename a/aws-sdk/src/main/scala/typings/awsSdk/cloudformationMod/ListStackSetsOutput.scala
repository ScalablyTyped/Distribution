package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStackSetsOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of StackSetSummary structures that contain information about the user's stack sets.
    */
  var Summaries: js.UndefOr[StackSetSummaries] = js.undefined
}
object ListStackSetsOutput {
  
  @scala.inline
  def apply(): ListStackSetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackSetsOutput]
  }
  
  @scala.inline
  implicit class ListStackSetsOutputMutableBuilder[Self <: ListStackSetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSummaries(value: StackSetSummaries): Self = StObject.set(x, "Summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesUndefined: Self = StObject.set(x, "Summaries", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: StackSetSummary*): Self = StObject.set(x, "Summaries", js.Array(value :_*))
  }
}

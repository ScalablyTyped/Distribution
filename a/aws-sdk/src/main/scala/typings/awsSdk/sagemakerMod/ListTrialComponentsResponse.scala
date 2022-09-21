package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrialComponentsResponse extends StObject {
  
  /**
    * A token for getting the next set of components, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of the summaries of your trial components.
    */
  var TrialComponentSummaries: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentSummaries] = js.undefined
}
object ListTrialComponentsResponse {
  
  inline def apply(): ListTrialComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialComponentsResponse]
  }
  
  extension [Self <: ListTrialComponentsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrialComponentSummaries(value: TrialComponentSummaries): Self = StObject.set(x, "TrialComponentSummaries", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentSummariesUndefined: Self = StObject.set(x, "TrialComponentSummaries", js.undefined)
    
    inline def setTrialComponentSummariesVarargs(value: TrialComponentSummary*): Self = StObject.set(x, "TrialComponentSummaries", js.Array(value*))
  }
}

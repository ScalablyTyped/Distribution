package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceEventsResponse extends StObject {
  
  /**
    * Provides an array of information about the individual inference events returned from the ListInferenceEvents operation, including scheduler used, event start time, event end time, diagnostics, and so on. 
    */
  var InferenceEventSummaries: js.UndefOr[typings.awsSdk.lookoutequipmentMod.InferenceEventSummaries] = js.undefined
  
  /**
    * An opaque pagination token indicating where to continue the listing of inference executions. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.lookoutequipmentMod.NextToken] = js.undefined
}
object ListInferenceEventsResponse {
  
  inline def apply(): ListInferenceEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInferenceEventsResponse]
  }
  
  extension [Self <: ListInferenceEventsResponse](x: Self) {
    
    inline def setInferenceEventSummaries(value: InferenceEventSummaries): Self = StObject.set(x, "InferenceEventSummaries", value.asInstanceOf[js.Any])
    
    inline def setInferenceEventSummariesUndefined: Self = StObject.set(x, "InferenceEventSummaries", js.undefined)
    
    inline def setInferenceEventSummariesVarargs(value: InferenceEventSummary*): Self = StObject.set(x, "InferenceEventSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

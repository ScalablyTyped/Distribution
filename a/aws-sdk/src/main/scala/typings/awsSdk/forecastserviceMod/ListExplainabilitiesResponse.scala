package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExplainabilitiesResponse extends StObject {
  
  /**
    * An array of objects that summarize the properties of each Explainability resource.
    */
  var Explainabilities: js.UndefOr[typings.awsSdk.forecastserviceMod.Explainabilities] = js.undefined
  
  /**
    * Returns this token if the response is truncated. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.undefined
}
object ListExplainabilitiesResponse {
  
  inline def apply(): ListExplainabilitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExplainabilitiesResponse]
  }
  
  extension [Self <: ListExplainabilitiesResponse](x: Self) {
    
    inline def setExplainabilities(value: Explainabilities): Self = StObject.set(x, "Explainabilities", value.asInstanceOf[js.Any])
    
    inline def setExplainabilitiesUndefined: Self = StObject.set(x, "Explainabilities", js.undefined)
    
    inline def setExplainabilitiesVarargs(value: ExplainabilitySummary*): Self = StObject.set(x, "Explainabilities", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

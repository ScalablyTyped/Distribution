package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAdvisorLsaAnalysisResponse extends StObject {
  
  /**
    * A list of FleetAdvisorLsaAnalysisResponse objects.
    */
  var Analysis: js.UndefOr[FleetAdvisorLsaAnalysisResponseList] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetAdvisorLsaAnalysisResponse {
  
  inline def apply(): DescribeFleetAdvisorLsaAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAdvisorLsaAnalysisResponse]
  }
  
  extension [Self <: DescribeFleetAdvisorLsaAnalysisResponse](x: Self) {
    
    inline def setAnalysis(value: FleetAdvisorLsaAnalysisResponseList): Self = StObject.set(x, "Analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalysisUndefined: Self = StObject.set(x, "Analysis", js.undefined)
    
    inline def setAnalysisVarargs(value: FleetAdvisorLsaAnalysisResponse*): Self = StObject.set(x, "Analysis", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

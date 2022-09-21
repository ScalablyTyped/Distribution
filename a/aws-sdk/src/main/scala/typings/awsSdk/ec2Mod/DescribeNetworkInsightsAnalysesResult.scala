package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInsightsAnalysesResult extends StObject {
  
  /**
    * Information about the network insights analyses.
    */
  var NetworkInsightsAnalyses: js.UndefOr[NetworkInsightsAnalysisList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkInsightsAnalysesResult {
  
  inline def apply(): DescribeNetworkInsightsAnalysesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInsightsAnalysesResult]
  }
  
  extension [Self <: DescribeNetworkInsightsAnalysesResult](x: Self) {
    
    inline def setNetworkInsightsAnalyses(value: NetworkInsightsAnalysisList): Self = StObject.set(x, "NetworkInsightsAnalyses", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAnalysesUndefined: Self = StObject.set(x, "NetworkInsightsAnalyses", js.undefined)
    
    inline def setNetworkInsightsAnalysesVarargs(value: NetworkInsightsAnalysis*): Self = StObject.set(x, "NetworkInsightsAnalyses", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

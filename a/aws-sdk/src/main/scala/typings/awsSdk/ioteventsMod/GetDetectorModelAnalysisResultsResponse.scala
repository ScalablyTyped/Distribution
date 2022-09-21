package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetectorModelAnalysisResultsResponse extends StObject {
  
  /**
    * Contains information about one or more analysis results.
    */
  var analysisResults: js.UndefOr[AnalysisResults] = js.undefined
  
  /**
    * The token that you can use to return the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetDetectorModelAnalysisResultsResponse {
  
  inline def apply(): GetDetectorModelAnalysisResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorModelAnalysisResultsResponse]
  }
  
  extension [Self <: GetDetectorModelAnalysisResultsResponse](x: Self) {
    
    inline def setAnalysisResults(value: AnalysisResults): Self = StObject.set(x, "analysisResults", value.asInstanceOf[js.Any])
    
    inline def setAnalysisResultsUndefined: Self = StObject.set(x, "analysisResults", js.undefined)
    
    inline def setAnalysisResultsVarargs(value: AnalysisResult*): Self = StObject.set(x, "analysisResults", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

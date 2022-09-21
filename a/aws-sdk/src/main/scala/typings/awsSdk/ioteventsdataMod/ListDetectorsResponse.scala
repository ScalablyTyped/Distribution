package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectorsResponse extends StObject {
  
  /**
    * A list of summary information about the detectors (instances).
    */
  var detectorSummaries: js.UndefOr[DetectorSummaries] = js.undefined
  
  /**
    * The token that you can use to return the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDetectorsResponse {
  
  inline def apply(): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorsResponse]
  }
  
  extension [Self <: ListDetectorsResponse](x: Self) {
    
    inline def setDetectorSummaries(value: DetectorSummaries): Self = StObject.set(x, "detectorSummaries", value.asInstanceOf[js.Any])
    
    inline def setDetectorSummariesUndefined: Self = StObject.set(x, "detectorSummaries", js.undefined)
    
    inline def setDetectorSummariesVarargs(value: DetectorSummary*): Self = StObject.set(x, "detectorSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

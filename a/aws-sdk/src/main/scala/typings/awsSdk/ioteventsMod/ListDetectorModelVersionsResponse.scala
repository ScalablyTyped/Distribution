package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectorModelVersionsResponse extends StObject {
  
  /**
    * Summary information about the detector model versions.
    */
  var detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries] = js.undefined
  
  /**
    * The token that you can use to return the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDetectorModelVersionsResponse {
  
  inline def apply(): ListDetectorModelVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorModelVersionsResponse]
  }
  
  extension [Self <: ListDetectorModelVersionsResponse](x: Self) {
    
    inline def setDetectorModelVersionSummaries(value: DetectorModelVersionSummaries): Self = StObject.set(x, "detectorModelVersionSummaries", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelVersionSummariesUndefined: Self = StObject.set(x, "detectorModelVersionSummaries", js.undefined)
    
    inline def setDetectorModelVersionSummariesVarargs(value: DetectorModelVersionSummary*): Self = StObject.set(x, "detectorModelVersionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

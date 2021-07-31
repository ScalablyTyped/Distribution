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
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDetectorModelVersionsResponse {
  
  @scala.inline
  def apply(): ListDetectorModelVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorModelVersionsResponse]
  }
  
  @scala.inline
  implicit class ListDetectorModelVersionsResponseMutableBuilder[Self <: ListDetectorModelVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelVersionSummaries(value: DetectorModelVersionSummaries): Self = StObject.set(x, "detectorModelVersionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelVersionSummariesUndefined: Self = StObject.set(x, "detectorModelVersionSummaries", js.undefined)
    
    @scala.inline
    def setDetectorModelVersionSummariesVarargs(value: DetectorModelVersionSummary*): Self = StObject.set(x, "detectorModelVersionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectorModelsResponse extends StObject {
  
  /**
    * Summary information about the detector models.
    */
  var detectorModelSummaries: js.UndefOr[DetectorModelSummaries] = js.undefined
  
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDetectorModelsResponse {
  
  @scala.inline
  def apply(): ListDetectorModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorModelsResponse]
  }
  
  @scala.inline
  implicit class ListDetectorModelsResponseMutableBuilder[Self <: ListDetectorModelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelSummaries(value: DetectorModelSummaries): Self = StObject.set(x, "detectorModelSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelSummariesUndefined: Self = StObject.set(x, "detectorModelSummaries", js.undefined)
    
    @scala.inline
    def setDetectorModelSummariesVarargs(value: DetectorModelSummary*): Self = StObject.set(x, "detectorModelSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

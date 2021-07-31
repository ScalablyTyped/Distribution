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
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDetectorsResponse {
  
  @scala.inline
  def apply(): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorsResponse]
  }
  
  @scala.inline
  implicit class ListDetectorsResponseMutableBuilder[Self <: ListDetectorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorSummaries(value: DetectorSummaries): Self = StObject.set(x, "detectorSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorSummariesUndefined: Self = StObject.set(x, "detectorSummaries", js.undefined)
    
    @scala.inline
    def setDetectorSummariesVarargs(value: DetectorSummary*): Self = StObject.set(x, "detectorSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

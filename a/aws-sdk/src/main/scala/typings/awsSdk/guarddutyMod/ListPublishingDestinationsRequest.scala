package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPublishingDestinationsRequest extends StObject {
  
  /**
    * The ID of the detector to retrieve publishing destinations for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.guarddutyMod.MaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListPublishingDestinationsRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): ListPublishingDestinationsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublishingDestinationsRequest]
  }
  
  @scala.inline
  implicit class ListPublishingDestinationsRequestMutableBuilder[Self <: ListPublishingDestinationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

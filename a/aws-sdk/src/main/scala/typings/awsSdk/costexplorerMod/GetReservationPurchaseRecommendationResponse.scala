package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservationPurchaseRecommendationResponse extends StObject {
  
  /**
    * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this recommendation.
    */
  var Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata] = js.undefined
  
  /**
    * The pagination token for the next set of retrievable results.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
  
  /**
    * Recommendations for reservations to purchase.
    */
  var Recommendations: js.UndefOr[ReservationPurchaseRecommendations] = js.undefined
}
object GetReservationPurchaseRecommendationResponse {
  
  @scala.inline
  def apply(): GetReservationPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservationPurchaseRecommendationResponse]
  }
  
  @scala.inline
  implicit class GetReservationPurchaseRecommendationResponseMutableBuilder[Self <: GetReservationPurchaseRecommendationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: ReservationPurchaseRecommendationMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setRecommendations(value: ReservationPurchaseRecommendations): Self = StObject.set(x, "Recommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationsUndefined: Self = StObject.set(x, "Recommendations", js.undefined)
    
    @scala.inline
    def setRecommendationsVarargs(value: ReservationPurchaseRecommendation*): Self = StObject.set(x, "Recommendations", js.Array(value :_*))
  }
}

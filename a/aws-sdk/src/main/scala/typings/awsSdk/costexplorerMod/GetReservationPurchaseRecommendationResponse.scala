package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReservationPurchaseRecommendationResponse extends js.Object {
  
  /**
    * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this recommendation.
    */
  var Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata] = js.native
  
  /**
    * The pagination token for the next set of retrievable results.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * Recommendations for reservations to purchase.
    */
  var Recommendations: js.UndefOr[ReservationPurchaseRecommendations] = js.native
}
object GetReservationPurchaseRecommendationResponse {
  
  @scala.inline
  def apply(): GetReservationPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservationPurchaseRecommendationResponse]
  }
  
  @scala.inline
  implicit class GetReservationPurchaseRecommendationResponseOps[Self <: GetReservationPurchaseRecommendationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMetadata(value: ReservationPurchaseRecommendationMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setRecommendationsVarargs(value: ReservationPurchaseRecommendation*): Self = this.set("Recommendations", js.Array(value :_*))
    
    @scala.inline
    def setRecommendations(value: ReservationPurchaseRecommendations): Self = this.set("Recommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendations: Self = this.set("Recommendations", js.undefined)
  }
}

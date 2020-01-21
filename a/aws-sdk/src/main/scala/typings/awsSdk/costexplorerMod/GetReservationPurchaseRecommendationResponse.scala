package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Metadata: ReservationPurchaseRecommendationMetadata = null,
    NextPageToken: NextPageToken = null,
    Recommendations: ReservationPurchaseRecommendations = null
  ): GetReservationPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (Recommendations != null) __obj.updateDynamic("Recommendations")(Recommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationPurchaseRecommendationResponse]
  }
}


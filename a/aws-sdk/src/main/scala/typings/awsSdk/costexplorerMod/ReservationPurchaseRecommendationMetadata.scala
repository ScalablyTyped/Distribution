package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendationMetadata extends js.Object {
  /**
    * The time stamp for when AWS made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  /**
    * The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.native
}

object ReservationPurchaseRecommendationMetadata {
  @scala.inline
  def apply(GenerationTimestamp: GenericString = null, RecommendationId: GenericString = null): ReservationPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    if (GenerationTimestamp != null) __obj.updateDynamic("GenerationTimestamp")(GenerationTimestamp.asInstanceOf[js.Any])
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationPurchaseRecommendationMetadata]
  }
}


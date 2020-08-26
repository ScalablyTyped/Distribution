package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendationMetadata extends js.Object {
  /**
    * The timestamp for when AWS made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  /**
    * The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.native
}

object ReservationPurchaseRecommendationMetadata {
  @scala.inline
  def apply(): ReservationPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationMetadata]
  }
  @scala.inline
  implicit class ReservationPurchaseRecommendationMetadataOps[Self <: ReservationPurchaseRecommendationMetadata] (val x: Self) extends AnyVal {
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
    def setGenerationTimestamp(value: GenericString): Self = this.set("GenerationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerationTimestamp: Self = this.set("GenerationTimestamp", js.undefined)
    @scala.inline
    def setRecommendationId(value: GenericString): Self = this.set("RecommendationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationId: Self = this.set("RecommendationId", js.undefined)
  }
  
}


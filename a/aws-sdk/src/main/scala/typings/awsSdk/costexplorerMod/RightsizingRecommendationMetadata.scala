package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsizingRecommendationMetadata extends js.Object {
  /**
    *  The time stamp for when Amazon Web Services made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  /**
    *  How many days of previous usage that Amazon Web Services considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  /**
    *  The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.native
}

object RightsizingRecommendationMetadata {
  @scala.inline
  def apply(
    GenerationTimestamp: GenericString = null,
    LookbackPeriodInDays: LookbackPeriodInDays = null,
    RecommendationId: GenericString = null
  ): RightsizingRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    if (GenerationTimestamp != null) __obj.updateDynamic("GenerationTimestamp")(GenerationTimestamp.asInstanceOf[js.Any])
    if (LookbackPeriodInDays != null) __obj.updateDynamic("LookbackPeriodInDays")(LookbackPeriodInDays.asInstanceOf[js.Any])
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightsizingRecommendationMetadata]
  }
}


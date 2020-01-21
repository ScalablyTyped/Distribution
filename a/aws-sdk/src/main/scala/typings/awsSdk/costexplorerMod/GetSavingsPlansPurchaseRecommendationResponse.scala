package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansPurchaseRecommendationResponse extends js.Object {
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[SavingsPlansPurchaseRecommendationMetadata] = js.native
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
    */
  var SavingsPlansPurchaseRecommendation: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendation] = js.native
}

object GetSavingsPlansPurchaseRecommendationResponse {
  @scala.inline
  def apply(
    Metadata: SavingsPlansPurchaseRecommendationMetadata = null,
    NextPageToken: NextPageToken = null,
    SavingsPlansPurchaseRecommendation: SavingsPlansPurchaseRecommendation = null
  ): GetSavingsPlansPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (SavingsPlansPurchaseRecommendation != null) __obj.updateDynamic("SavingsPlansPurchaseRecommendation")(SavingsPlansPurchaseRecommendation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationResponse]
  }
}


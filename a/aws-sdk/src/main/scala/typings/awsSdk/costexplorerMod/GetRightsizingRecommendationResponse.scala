package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRightsizingRecommendationResponse extends js.Object {
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[RightsizingRecommendationMetadata] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * Recommendations to rightsize resources.
    */
  var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList] = js.native
  /**
    * Summary of this recommendation set.
    */
  var Summary: js.UndefOr[RightsizingRecommendationSummary] = js.native
}

object GetRightsizingRecommendationResponse {
  @scala.inline
  def apply(
    Metadata: RightsizingRecommendationMetadata = null,
    NextPageToken: NextPageToken = null,
    RightsizingRecommendations: RightsizingRecommendationList = null,
    Summary: RightsizingRecommendationSummary = null
  ): GetRightsizingRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (RightsizingRecommendations != null) __obj.updateDynamic("RightsizingRecommendations")(RightsizingRecommendations.asInstanceOf[js.Any])
    if (Summary != null) __obj.updateDynamic("Summary")(Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRightsizingRecommendationResponse]
  }
}


package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRightsizingRecommendationResponse extends js.Object {
  /**
    * Enables you to customize recommendations across two attributes. You can choose to view recommendations for instances within the same instance families or across different instance families. You can also choose to view your estimated savings associated with recommendations with consideration of existing Savings Plans or RI benefits, or niether. 
    */
  var Configuration: js.UndefOr[RightsizingRecommendationConfiguration] = js.native
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
    Configuration: RightsizingRecommendationConfiguration = null,
    Metadata: RightsizingRecommendationMetadata = null,
    NextPageToken: NextPageToken = null,
    RightsizingRecommendations: RightsizingRecommendationList = null,
    Summary: RightsizingRecommendationSummary = null
  ): GetRightsizingRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (RightsizingRecommendations != null) __obj.updateDynamic("RightsizingRecommendations")(RightsizingRecommendations.asInstanceOf[js.Any])
    if (Summary != null) __obj.updateDynamic("Summary")(Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRightsizingRecommendationResponse]
  }
}


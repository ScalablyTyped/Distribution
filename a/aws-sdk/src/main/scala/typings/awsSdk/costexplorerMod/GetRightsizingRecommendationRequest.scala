package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRightsizingRecommendationRequest extends js.Object {
  /**
    *  Enables you to customize recommendations across two attributes. You can choose to view recommendations for instances within the same instance families or across different instance families. You can also choose to view your estimated savings associated with recommendations with consideration of existing Savings Plans or RI benefits, or niether. 
    */
  var Configuration: js.UndefOr[RightsizingRecommendationConfiguration] = js.native
  var Filter: js.UndefOr[Expression] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The specific service that you want recommendations for. The only valid value for GetRightsizingRecommendation is "AmazonEC2".
    */
  var Service: GenericString = js.native
}

object GetRightsizingRecommendationRequest {
  @scala.inline
  def apply(
    Service: GenericString,
    Configuration: RightsizingRecommendationConfiguration = null,
    Filter: Expression = null,
    NextPageToken: NextPageToken = null,
    PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
  ): GetRightsizingRecommendationRequest = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRightsizingRecommendationRequest]
  }
}


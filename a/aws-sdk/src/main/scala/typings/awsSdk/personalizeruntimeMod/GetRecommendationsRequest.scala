package typings.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
    */
  var campaignArn: Arn = js.native
  /**
    * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.
    */
  var context: js.UndefOr[Context] = js.native
  /**
    * The item ID to provide recommendations for. Required for RELATED_ITEMS recipe type.
    */
  var itemId: js.UndefOr[ItemID] = js.native
  /**
    * The number of results to return. The default is 25. The maximum is 500.
    */
  var numResults: js.UndefOr[NumResults] = js.native
  /**
    * The user ID to provide recommendations for. Required for USER_PERSONALIZATION recipe type.
    */
  var userId: js.UndefOr[UserID] = js.native
}

object GetRecommendationsRequest {
  @scala.inline
  def apply(
    campaignArn: Arn,
    context: Context = null,
    itemId: ItemID = null,
    numResults: js.UndefOr[NumResults] = js.undefined,
    userId: UserID = null
  ): GetRecommendationsRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (!js.isUndefined(numResults)) __obj.updateDynamic("numResults")(numResults.get.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsRequest]
  }
}


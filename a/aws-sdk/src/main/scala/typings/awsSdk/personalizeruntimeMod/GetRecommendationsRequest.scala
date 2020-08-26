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
    * The ARN of the filter to apply to the returned recommendations. For more information, see Using Filters with Amazon Personalize. When using this parameter, be sure the filter resource is ACTIVE.
    */
  var filterArn: js.UndefOr[Arn] = js.native
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
  def apply(campaignArn: Arn): GetRecommendationsRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsRequest]
  }
  @scala.inline
  implicit class GetRecommendationsRequestOps[Self <: GetRecommendationsRequest] (val x: Self) extends AnyVal {
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
    def setCampaignArn(value: Arn): Self = this.set("campaignArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFilterArn(value: Arn): Self = this.set("filterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterArn: Self = this.set("filterArn", js.undefined)
    @scala.inline
    def setItemId(value: ItemID): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setNumResults(value: NumResults): Self = this.set("numResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumResults: Self = this.set("numResults", js.undefined)
    @scala.inline
    def setUserId(value: UserID): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}


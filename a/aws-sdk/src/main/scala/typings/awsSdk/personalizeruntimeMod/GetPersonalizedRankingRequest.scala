package typings.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPersonalizedRankingRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
    */
  var campaignArn: Arn = js.native
  /**
    * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.
    */
  var context: js.UndefOr[Context] = js.native
  /**
    * The Amazon Resource Name (ARN) of a filter you created to include or exclude items from recommendations for a given user.
    */
  var filterArn: js.UndefOr[Arn] = js.native
  /**
    * A list of items (by itemId) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.
    */
  var inputList: InputList = js.native
  /**
    * The user for which you want the campaign to provide a personalized ranking.
    */
  var userId: UserID = js.native
}

object GetPersonalizedRankingRequest {
  @scala.inline
  def apply(campaignArn: Arn, inputList: InputList, userId: UserID): GetPersonalizedRankingRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any], inputList = inputList.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPersonalizedRankingRequest]
  }
  @scala.inline
  implicit class GetPersonalizedRankingRequestOps[Self <: GetPersonalizedRankingRequest] (val x: Self) extends AnyVal {
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
    def setInputListVarargs(value: ItemID*): Self = this.set("inputList", js.Array(value :_*))
    @scala.inline
    def setInputList(value: InputList): Self = this.set("inputList", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: UserID): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFilterArn(value: Arn): Self = this.set("filterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterArn: Self = this.set("filterArn", js.undefined)
  }
  
}


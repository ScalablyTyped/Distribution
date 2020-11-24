package typings.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecommendationsResponse extends js.Object {
  
  /**
    * A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.
    */
  var itemList: js.UndefOr[ItemList] = js.native
  
  /**
    * The ID of the recommendation.
    */
  var recommendationId: js.UndefOr[RecommendationID] = js.native
}
object GetRecommendationsResponse {
  
  @scala.inline
  def apply(): GetRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationsResponse]
  }
  
  @scala.inline
  implicit class GetRecommendationsResponseOps[Self <: GetRecommendationsResponse] (val x: Self) extends AnyVal {
    
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
    def setItemListVarargs(value: PredictedItem*): Self = this.set("itemList", js.Array(value :_*))
    
    @scala.inline
    def setItemList(value: ItemList): Self = this.set("itemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemList: Self = this.set("itemList", js.undefined)
    
    @scala.inline
    def setRecommendationId(value: RecommendationID): Self = this.set("recommendationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationId: Self = this.set("recommendationId", js.undefined)
  }
}

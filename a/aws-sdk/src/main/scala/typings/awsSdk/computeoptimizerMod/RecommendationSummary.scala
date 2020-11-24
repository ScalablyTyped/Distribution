package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendationSummary extends js.Object {
  
  /**
    * The AWS account ID of the recommendation summary.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The resource type of the recommendation.
    */
  var recommendationResourceType: js.UndefOr[RecommendationSourceType] = js.native
  
  /**
    * An array of objects that describe a recommendation summary.
    */
  var summaries: js.UndefOr[Summaries] = js.native
}
object RecommendationSummary {
  
  @scala.inline
  def apply(): RecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSummary]
  }
  
  @scala.inline
  implicit class RecommendationSummaryOps[Self <: RecommendationSummary] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setRecommendationResourceType(value: RecommendationSourceType): Self = this.set("recommendationResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationResourceType: Self = this.set("recommendationResourceType", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: Summary*): Self = this.set("summaries", js.Array(value :_*))
    
    @scala.inline
    def setSummaries(value: Summaries): Self = this.set("summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaries: Self = this.set("summaries", js.undefined)
  }
}

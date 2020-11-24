package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetSavingsPlansPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationResponse]
  }
  
  @scala.inline
  implicit class GetSavingsPlansPurchaseRecommendationResponseOps[Self <: GetSavingsPlansPurchaseRecommendationResponse] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: SavingsPlansPurchaseRecommendationMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendation(value: SavingsPlansPurchaseRecommendation): Self = this.set("SavingsPlansPurchaseRecommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlansPurchaseRecommendation: Self = this.set("SavingsPlansPurchaseRecommendation", js.undefined)
  }
}

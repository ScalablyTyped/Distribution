package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansPurchaseRecommendationResponse extends StObject {
  
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[SavingsPlansPurchaseRecommendationMetadata] = js.undefined
  
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
  
  /**
    * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
    */
  var SavingsPlansPurchaseRecommendation: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendation] = js.undefined
}
object GetSavingsPlansPurchaseRecommendationResponse {
  
  @scala.inline
  def apply(): GetSavingsPlansPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationResponse]
  }
  
  @scala.inline
  implicit class GetSavingsPlansPurchaseRecommendationResponseMutableBuilder[Self <: GetSavingsPlansPurchaseRecommendationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SavingsPlansPurchaseRecommendationMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendation(value: SavingsPlansPurchaseRecommendation): Self = StObject.set(x, "SavingsPlansPurchaseRecommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationUndefined: Self = StObject.set(x, "SavingsPlansPurchaseRecommendation", js.undefined)
  }
}

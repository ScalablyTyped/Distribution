package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansPurchaseRecommendationMetadata extends StObject {
  
  /**
    * Additional metadata that may be applicable to the recommendation.
    */
  var AdditionalMetadata: js.UndefOr[GenericString] = js.native
  
  /**
    * The timestamp showing when the recommendations were generated.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  
  /**
    * The unique identifier for the recommendation set.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.native
}
object SavingsPlansPurchaseRecommendationMetadata {
  
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationMetadata]
  }
  
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationMetadataMutableBuilder[Self <: SavingsPlansPurchaseRecommendationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalMetadata(value: GenericString): Self = StObject.set(x, "AdditionalMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalMetadataUndefined: Self = StObject.set(x, "AdditionalMetadata", js.undefined)
    
    @scala.inline
    def setGenerationTimestamp(value: GenericString): Self = StObject.set(x, "GenerationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationTimestampUndefined: Self = StObject.set(x, "GenerationTimestamp", js.undefined)
    
    @scala.inline
    def setRecommendationId(value: GenericString): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
  }
}

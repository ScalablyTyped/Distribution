package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationPurchaseRecommendationMetadata extends StObject {
  
  /**
    * The timestamp for when AWS made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.undefined
}
object ReservationPurchaseRecommendationMetadata {
  
  @scala.inline
  def apply(): ReservationPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationMetadata]
  }
  
  @scala.inline
  implicit class ReservationPurchaseRecommendationMetadataMutableBuilder[Self <: ReservationPurchaseRecommendationMetadata] (val x: Self) extends AnyVal {
    
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

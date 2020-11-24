package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightsizingRecommendationMetadata extends js.Object {
  
  /**
    *  The timestamp for when AWS made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  
  /**
    *  How many days of previous usage that AWS considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  
  /**
    *  The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.native
}
object RightsizingRecommendationMetadata {
  
  @scala.inline
  def apply(): RightsizingRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendationMetadata]
  }
  
  @scala.inline
  implicit class RightsizingRecommendationMetadataOps[Self <: RightsizingRecommendationMetadata] (val x: Self) extends AnyVal {
    
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
    def setGenerationTimestamp(value: GenericString): Self = this.set("GenerationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerationTimestamp: Self = this.set("GenerationTimestamp", js.undefined)
    
    @scala.inline
    def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = this.set("LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookbackPeriodInDays: Self = this.set("LookbackPeriodInDays", js.undefined)
    
    @scala.inline
    def setRecommendationId(value: GenericString): Self = this.set("RecommendationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationId: Self = this.set("RecommendationId", js.undefined)
  }
}

package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRightsizingRecommendationResponse extends js.Object {
  
  /**
    *  Enables you to customize recommendations across two attributes. You can choose to view recommendations for instances within the same instance families or across different instance families. You can also choose to view your estimated savings associated with recommendations with consideration of existing Savings Plans or RI benefits, or neither. 
    */
  var Configuration: js.UndefOr[RightsizingRecommendationConfiguration] = js.native
  
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[RightsizingRecommendationMetadata] = js.native
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * Recommendations to rightsize resources.
    */
  var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList] = js.native
  
  /**
    * Summary of this recommendation set.
    */
  var Summary: js.UndefOr[RightsizingRecommendationSummary] = js.native
}
object GetRightsizingRecommendationResponse {
  
  @scala.inline
  def apply(): GetRightsizingRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRightsizingRecommendationResponse]
  }
  
  @scala.inline
  implicit class GetRightsizingRecommendationResponseOps[Self <: GetRightsizingRecommendationResponse] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: RightsizingRecommendationConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    
    @scala.inline
    def setMetadata(value: RightsizingRecommendationMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setRightsizingRecommendationsVarargs(value: RightsizingRecommendation*): Self = this.set("RightsizingRecommendations", js.Array(value :_*))
    
    @scala.inline
    def setRightsizingRecommendations(value: RightsizingRecommendationList): Self = this.set("RightsizingRecommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightsizingRecommendations: Self = this.set("RightsizingRecommendations", js.undefined)
    
    @scala.inline
    def setSummary(value: RightsizingRecommendationSummary): Self = this.set("Summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("Summary", js.undefined)
  }
}

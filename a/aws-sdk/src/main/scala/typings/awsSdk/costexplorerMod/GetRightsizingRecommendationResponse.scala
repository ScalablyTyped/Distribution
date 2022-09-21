package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRightsizingRecommendationResponse extends StObject {
  
  /**
    * You can use Configuration to customize recommendations across two attributes. You can choose to view recommendations for instances within the same instance families or across different instance families. You can also choose to view your estimated savings that are associated with recommendations with consideration of existing Savings Plans or RI benefits, or neither. 
    */
  var Configuration: js.UndefOr[RightsizingRecommendationConfiguration] = js.undefined
  
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[RightsizingRecommendationMetadata] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
  
  /**
    * Recommendations to rightsize resources.
    */
  var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList] = js.undefined
  
  /**
    * Summary of this recommendation set.
    */
  var Summary: js.UndefOr[RightsizingRecommendationSummary] = js.undefined
}
object GetRightsizingRecommendationResponse {
  
  inline def apply(): GetRightsizingRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRightsizingRecommendationResponse]
  }
  
  extension [Self <: GetRightsizingRecommendationResponse](x: Self) {
    
    inline def setConfiguration(value: RightsizingRecommendationConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setMetadata(value: RightsizingRecommendationMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setRightsizingRecommendations(value: RightsizingRecommendationList): Self = StObject.set(x, "RightsizingRecommendations", value.asInstanceOf[js.Any])
    
    inline def setRightsizingRecommendationsUndefined: Self = StObject.set(x, "RightsizingRecommendations", js.undefined)
    
    inline def setRightsizingRecommendationsVarargs(value: RightsizingRecommendation*): Self = StObject.set(x, "RightsizingRecommendations", js.Array(value*))
    
    inline def setSummary(value: RightsizingRecommendationSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}

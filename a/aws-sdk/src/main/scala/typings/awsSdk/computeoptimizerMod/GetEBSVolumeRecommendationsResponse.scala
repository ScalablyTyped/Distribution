package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEBSVolumeRecommendationsResponse extends StObject {
  
  /**
    * An array of objects that describe errors of the request. For example, an error is returned if you request recommendations for an unsupported volume.
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.undefined
  
  /**
    * The token to use to advance to the next page of volume recommendations. This value is null when there are no more pages of volume recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that describe volume recommendations.
    */
  var volumeRecommendations: js.UndefOr[VolumeRecommendations] = js.undefined
}
object GetEBSVolumeRecommendationsResponse {
  
  inline def apply(): GetEBSVolumeRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEBSVolumeRecommendationsResponse]
  }
  
  extension [Self <: GetEBSVolumeRecommendationsResponse](x: Self) {
    
    inline def setErrors(value: GetRecommendationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GetRecommendationError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVolumeRecommendations(value: VolumeRecommendations): Self = StObject.set(x, "volumeRecommendations", value.asInstanceOf[js.Any])
    
    inline def setVolumeRecommendationsUndefined: Self = StObject.set(x, "volumeRecommendations", js.undefined)
    
    inline def setVolumeRecommendationsVarargs(value: VolumeRecommendation*): Self = StObject.set(x, "volumeRecommendations", js.Array(value*))
  }
}

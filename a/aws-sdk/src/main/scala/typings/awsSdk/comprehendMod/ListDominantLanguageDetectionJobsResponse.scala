package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDominantLanguageDetectionJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var DominantLanguageDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.DominantLanguageDetectionJobPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDominantLanguageDetectionJobsResponse {
  
  inline def apply(): ListDominantLanguageDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDominantLanguageDetectionJobsResponse]
  }
  
  extension [Self <: ListDominantLanguageDetectionJobsResponse](x: Self) {
    
    inline def setDominantLanguageDetectionJobPropertiesList(value: DominantLanguageDetectionJobPropertiesList): Self = StObject.set(x, "DominantLanguageDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setDominantLanguageDetectionJobPropertiesListUndefined: Self = StObject.set(x, "DominantLanguageDetectionJobPropertiesList", js.undefined)
    
    inline def setDominantLanguageDetectionJobPropertiesListVarargs(value: DominantLanguageDetectionJobProperties*): Self = StObject.set(x, "DominantLanguageDetectionJobPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

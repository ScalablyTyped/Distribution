package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyPhrasesDetectionJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.KeyPhrasesDetectionJobPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListKeyPhrasesDetectionJobsResponse {
  
  inline def apply(): ListKeyPhrasesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
  }
  
  extension [Self <: ListKeyPhrasesDetectionJobsResponse](x: Self) {
    
    inline def setKeyPhrasesDetectionJobPropertiesList(value: KeyPhrasesDetectionJobPropertiesList): Self = StObject.set(x, "KeyPhrasesDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setKeyPhrasesDetectionJobPropertiesListUndefined: Self = StObject.set(x, "KeyPhrasesDetectionJobPropertiesList", js.undefined)
    
    inline def setKeyPhrasesDetectionJobPropertiesListVarargs(value: KeyPhrasesDetectionJobProperties*): Self = StObject.set(x, "KeyPhrasesDetectionJobPropertiesList", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

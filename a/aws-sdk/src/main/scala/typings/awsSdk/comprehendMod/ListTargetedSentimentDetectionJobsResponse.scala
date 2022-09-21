package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetedSentimentDetectionJobsResponse extends StObject {
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var TargetedSentimentDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.TargetedSentimentDetectionJobPropertiesList] = js.undefined
}
object ListTargetedSentimentDetectionJobsResponse {
  
  inline def apply(): ListTargetedSentimentDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetedSentimentDetectionJobsResponse]
  }
  
  extension [Self <: ListTargetedSentimentDetectionJobsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTargetedSentimentDetectionJobPropertiesList(value: TargetedSentimentDetectionJobPropertiesList): Self = StObject.set(x, "TargetedSentimentDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setTargetedSentimentDetectionJobPropertiesListUndefined: Self = StObject.set(x, "TargetedSentimentDetectionJobPropertiesList", js.undefined)
    
    inline def setTargetedSentimentDetectionJobPropertiesListVarargs(value: TargetedSentimentDetectionJobProperties*): Self = StObject.set(x, "TargetedSentimentDetectionJobPropertiesList", js.Array(value*))
  }
}

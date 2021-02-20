package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSentimentDetectionJobsResponse extends StObject {
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var SentimentDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.SentimentDetectionJobPropertiesList] = js.native
}
object ListSentimentDetectionJobsResponse {
  
  @scala.inline
  def apply(): ListSentimentDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSentimentDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListSentimentDetectionJobsResponseMutableBuilder[Self <: ListSentimentDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSentimentDetectionJobPropertiesList(value: SentimentDetectionJobPropertiesList): Self = StObject.set(x, "SentimentDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentDetectionJobPropertiesListUndefined: Self = StObject.set(x, "SentimentDetectionJobPropertiesList", js.undefined)
    
    @scala.inline
    def setSentimentDetectionJobPropertiesListVarargs(value: SentimentDetectionJobProperties*): Self = StObject.set(x, "SentimentDetectionJobPropertiesList", js.Array(value :_*))
  }
}

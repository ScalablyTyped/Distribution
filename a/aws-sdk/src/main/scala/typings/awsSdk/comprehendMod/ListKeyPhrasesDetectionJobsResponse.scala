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
  
  @scala.inline
  def apply(): ListKeyPhrasesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListKeyPhrasesDetectionJobsResponseMutableBuilder[Self <: ListKeyPhrasesDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPhrasesDetectionJobPropertiesList(value: KeyPhrasesDetectionJobPropertiesList): Self = StObject.set(x, "KeyPhrasesDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPhrasesDetectionJobPropertiesListUndefined: Self = StObject.set(x, "KeyPhrasesDetectionJobPropertiesList", js.undefined)
    
    @scala.inline
    def setKeyPhrasesDetectionJobPropertiesListVarargs(value: KeyPhrasesDetectionJobProperties*): Self = StObject.set(x, "KeyPhrasesDetectionJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

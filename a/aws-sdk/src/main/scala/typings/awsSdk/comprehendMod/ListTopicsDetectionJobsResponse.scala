package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicsDetectionJobsResponse extends StObject {
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var TopicsDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.TopicsDetectionJobPropertiesList] = js.undefined
}
object ListTopicsDetectionJobsResponse {
  
  @scala.inline
  def apply(): ListTopicsDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListTopicsDetectionJobsResponseMutableBuilder[Self <: ListTopicsDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTopicsDetectionJobPropertiesList(value: TopicsDetectionJobPropertiesList): Self = StObject.set(x, "TopicsDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsDetectionJobPropertiesListUndefined: Self = StObject.set(x, "TopicsDetectionJobPropertiesList", js.undefined)
    
    @scala.inline
    def setTopicsDetectionJobPropertiesListVarargs(value: TopicsDetectionJobProperties*): Self = StObject.set(x, "TopicsDetectionJobPropertiesList", js.Array(value :_*))
  }
}

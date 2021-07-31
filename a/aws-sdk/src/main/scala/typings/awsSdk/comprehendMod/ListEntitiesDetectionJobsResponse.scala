package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitiesDetectionJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var EntitiesDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.EntitiesDetectionJobPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEntitiesDetectionJobsResponse {
  
  @scala.inline
  def apply(): ListEntitiesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListEntitiesDetectionJobsResponseMutableBuilder[Self <: ListEntitiesDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitiesDetectionJobPropertiesList(value: EntitiesDetectionJobPropertiesList): Self = StObject.set(x, "EntitiesDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesDetectionJobPropertiesListUndefined: Self = StObject.set(x, "EntitiesDetectionJobPropertiesList", js.undefined)
    
    @scala.inline
    def setEntitiesDetectionJobPropertiesListVarargs(value: EntitiesDetectionJobProperties*): Self = StObject.set(x, "EntitiesDetectionJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

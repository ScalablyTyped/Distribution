package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventsDetectionJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var EventsDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.EventsDetectionJobPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEventsDetectionJobsResponse {
  
  inline def apply(): ListEventsDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventsDetectionJobsResponse]
  }
  
  extension [Self <: ListEventsDetectionJobsResponse](x: Self) {
    
    inline def setEventsDetectionJobPropertiesList(value: EventsDetectionJobPropertiesList): Self = StObject.set(x, "EventsDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setEventsDetectionJobPropertiesListUndefined: Self = StObject.set(x, "EventsDetectionJobPropertiesList", js.undefined)
    
    inline def setEventsDetectionJobPropertiesListVarargs(value: EventsDetectionJobProperties*): Self = StObject.set(x, "EventsDetectionJobPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

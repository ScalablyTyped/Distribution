package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProjectEventsRequest extends StObject {
  
  /**
    * An array of event structures that contain the performance data that is being sent to Evidently.
    */
  var events: EventList
  
  /**
    * The name or ARN of the project to write the events to.
    */
  var project: ProjectRef
}
object PutProjectEventsRequest {
  
  inline def apply(events: EventList, project: ProjectRef): PutProjectEventsRequest = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutProjectEventsRequest]
  }
  
  extension [Self <: PutProjectEventsRequest](x: Self) {
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}

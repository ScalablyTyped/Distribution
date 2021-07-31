package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateEventSourceRequest extends StObject {
  
  /**
    * The name of the partner event source to deactivate.
    */
  var Name: EventSourceName
}
object DeactivateEventSourceRequest {
  
  @scala.inline
  def apply(Name: EventSourceName): DeactivateEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateEventSourceRequest]
  }
  
  @scala.inline
  implicit class DeactivateEventSourceRequestMutableBuilder[Self <: DeactivateEventSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduleRequest extends StObject {
  
  /**
    * The name of the schedule to be deleted.
    */
  var Name: ScheduleName
}
object DeleteScheduleRequest {
  
  @scala.inline
  def apply(Name: ScheduleName): DeleteScheduleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduleRequest]
  }
  
  @scala.inline
  implicit class DeleteScheduleRequestMutableBuilder[Self <: DeleteScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

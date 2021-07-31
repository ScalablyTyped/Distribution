package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduleResponse extends StObject {
  
  /**
    * The name of the schedule that was created.
    */
  var Name: ScheduleName
}
object CreateScheduleResponse {
  
  @scala.inline
  def apply(Name: ScheduleName): CreateScheduleResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduleResponse]
  }
  
  @scala.inline
  implicit class CreateScheduleResponseMutableBuilder[Self <: CreateScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

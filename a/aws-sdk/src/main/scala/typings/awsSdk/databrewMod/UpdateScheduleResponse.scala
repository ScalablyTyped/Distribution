package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateScheduleResponse extends StObject {
  
  /**
    * The name of the schedule that was updated.
    */
  var Name: ScheduleName = js.native
}
object UpdateScheduleResponse {
  
  @scala.inline
  def apply(Name: ScheduleName): UpdateScheduleResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScheduleResponse]
  }
  
  @scala.inline
  implicit class UpdateScheduleResponseMutableBuilder[Self <: UpdateScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

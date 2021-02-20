package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteScheduleResponse extends StObject {
  
  /**
    * The name of the schedule that was deleted.
    */
  var Name: ScheduleName = js.native
}
object DeleteScheduleResponse {
  
  @scala.inline
  def apply(Name: ScheduleName): DeleteScheduleResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduleResponse]
  }
  
  @scala.inline
  implicit class DeleteScheduleResponseMutableBuilder[Self <: DeleteScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

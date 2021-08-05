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
  
  inline def apply(Name: ScheduleName): CreateScheduleResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduleResponse]
  }
  
  extension [Self <: CreateScheduleResponse](x: Self) {
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

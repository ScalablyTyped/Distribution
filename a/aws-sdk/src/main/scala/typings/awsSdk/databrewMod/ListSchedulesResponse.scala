package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchedulesResponse extends StObject {
  
  /**
    * A token that you can use in a subsequent call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.databrewMod.NextToken] = js.undefined
  
  /**
    * A list of schedules that are defined.
    */
  var Schedules: ScheduleList
}
object ListSchedulesResponse {
  
  inline def apply(Schedules: ScheduleList): ListSchedulesResponse = {
    val __obj = js.Dynamic.literal(Schedules = Schedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchedulesResponse]
  }
  
  extension [Self <: ListSchedulesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchedules(value: ScheduleList): Self = StObject.set(x, "Schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesVarargs(value: Schedule*): Self = StObject.set(x, "Schedules", js.Array(value*))
  }
}

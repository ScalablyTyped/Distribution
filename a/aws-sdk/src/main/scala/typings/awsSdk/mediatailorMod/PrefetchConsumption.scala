package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefetchConsumption extends StObject {
  
  /**
    * If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic variables, such as scte.event_id, set the avail matching criteria.
    */
  var AvailMatchingCriteria: js.UndefOr[listOfAvailMatchingCriteria] = js.undefined
  
  /**
    * The time when MediaTailor no longer considers the prefetched ads for use in an ad break. MediaTailor automatically deletes prefetch schedules no less than seven days after the end time. If you'd like to manually delete the prefetch schedule, you can call DeletePrefetchSchedule.
    */
  var EndTime: js.Date
  
  /**
    * The time when prefetched ads are considered for use in an ad break. If you don't specify StartTime, the prefetched ads are available after MediaTailor retrives them from the ad decision server.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object PrefetchConsumption {
  
  inline def apply(EndTime: js.Date): PrefetchConsumption = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchConsumption]
  }
  
  extension [Self <: PrefetchConsumption](x: Self) {
    
    inline def setAvailMatchingCriteria(value: listOfAvailMatchingCriteria): Self = StObject.set(x, "AvailMatchingCriteria", value.asInstanceOf[js.Any])
    
    inline def setAvailMatchingCriteriaUndefined: Self = StObject.set(x, "AvailMatchingCriteria", js.undefined)
    
    inline def setAvailMatchingCriteriaVarargs(value: AvailMatchingCriteria*): Self = StObject.set(x, "AvailMatchingCriteria", js.Array(value*))
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}

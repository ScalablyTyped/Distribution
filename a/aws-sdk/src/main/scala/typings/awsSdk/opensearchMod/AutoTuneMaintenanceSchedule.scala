package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneMaintenanceSchedule extends StObject {
  
  /**
    * A cron expression for a recurring maintenance schedule. See  Auto-Tune for Amazon OpenSearch Service  for more information. 
    */
  var CronExpressionForRecurrence: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies maintenance schedule duration: duration value and duration unit. See  Auto-Tune for Amazon OpenSearch Service  for more information. 
    */
  var Duration: js.UndefOr[typings.awsSdk.opensearchMod.Duration] = js.undefined
  
  /**
    * The timestamp at which the Auto-Tune maintenance schedule starts.
    */
  var StartAt: js.UndefOr[js.Date] = js.undefined
}
object AutoTuneMaintenanceSchedule {
  
  inline def apply(): AutoTuneMaintenanceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneMaintenanceSchedule]
  }
  
  extension [Self <: AutoTuneMaintenanceSchedule](x: Self) {
    
    inline def setCronExpressionForRecurrence(value: String): Self = StObject.set(x, "CronExpressionForRecurrence", value.asInstanceOf[js.Any])
    
    inline def setCronExpressionForRecurrenceUndefined: Self = StObject.set(x, "CronExpressionForRecurrence", js.undefined)
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setStartAt(value: js.Date): Self = StObject.set(x, "StartAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "StartAt", js.undefined)
  }
}

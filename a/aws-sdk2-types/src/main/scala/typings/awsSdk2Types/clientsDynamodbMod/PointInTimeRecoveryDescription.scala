package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointInTimeRecoveryDescription extends StObject {
  
  /**
    * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days. 
    */
  var EarliestRestorableDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var LatestRestorableDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of point in time recovery:    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
    */
  var PointInTimeRecoveryStatus: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.PointInTimeRecoveryStatus] = js.undefined
}
object PointInTimeRecoveryDescription {
  
  inline def apply(): PointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointInTimeRecoveryDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointInTimeRecoveryDescription] (val x: Self) extends AnyVal {
    
    inline def setEarliestRestorableDateTime(value: js.Date): Self = StObject.set(x, "EarliestRestorableDateTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestRestorableDateTimeUndefined: Self = StObject.set(x, "EarliestRestorableDateTime", js.undefined)
    
    inline def setLatestRestorableDateTime(value: js.Date): Self = StObject.set(x, "LatestRestorableDateTime", value.asInstanceOf[js.Any])
    
    inline def setLatestRestorableDateTimeUndefined: Self = StObject.set(x, "LatestRestorableDateTime", js.undefined)
    
    inline def setPointInTimeRecoveryStatus(value: PointInTimeRecoveryStatus): Self = StObject.set(x, "PointInTimeRecoveryStatus", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryStatusUndefined: Self = StObject.set(x, "PointInTimeRecoveryStatus", js.undefined)
  }
}

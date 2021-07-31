package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoSnapshotAddOnRequest extends StObject {
  
  /**
    * The daily time when an automatic snapshot will be created. Constraints:   Must be in HH:00 format, and in an hourly increment.   Specified in Coordinated Universal Time (UTC).   The snapshot will be automatically created between the time specified and up to 45 minutes after.  
    */
  var snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.undefined
}
object AutoSnapshotAddOnRequest {
  
  @scala.inline
  def apply(): AutoSnapshotAddOnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSnapshotAddOnRequest]
  }
  
  @scala.inline
  implicit class AutoSnapshotAddOnRequestMutableBuilder[Self <: AutoSnapshotAddOnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotTimeOfDay(value: TimeOfDay): Self = StObject.set(x, "snapshotTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTimeOfDayUndefined: Self = StObject.set(x, "snapshotTimeOfDay", js.undefined)
  }
}

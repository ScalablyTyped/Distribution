package typings.dashjs.mod

import typings.dashjs.dashjsStrings.periodSwitchCompleted
import typings.dashjs.dashjsStrings.periodSwitchStarted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeriodSwitchEvent
  extends StObject
     with Event {
  
  var fromStreamInfo: js.UndefOr[StreamInfo | Null] = js.undefined
  
  var toStreamInfo: StreamInfo | Null
  
  @JSName("type")
  var type_PeriodSwitchEvent: periodSwitchCompleted | periodSwitchStarted
}
object PeriodSwitchEvent {
  
  inline def apply(`type`: periodSwitchCompleted | periodSwitchStarted): PeriodSwitchEvent = {
    val __obj = js.Dynamic.literal(toStreamInfo = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodSwitchEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeriodSwitchEvent] (val x: Self) extends AnyVal {
    
    inline def setFromStreamInfo(value: StreamInfo): Self = StObject.set(x, "fromStreamInfo", value.asInstanceOf[js.Any])
    
    inline def setFromStreamInfoNull: Self = StObject.set(x, "fromStreamInfo", null)
    
    inline def setFromStreamInfoUndefined: Self = StObject.set(x, "fromStreamInfo", js.undefined)
    
    inline def setToStreamInfo(value: StreamInfo): Self = StObject.set(x, "toStreamInfo", value.asInstanceOf[js.Any])
    
    inline def setToStreamInfoNull: Self = StObject.set(x, "toStreamInfo", null)
    
    inline def setType(value: periodSwitchCompleted | periodSwitchStarted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

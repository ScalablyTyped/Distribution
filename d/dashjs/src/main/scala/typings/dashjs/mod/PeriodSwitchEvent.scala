package typings.dashjs.mod

import typings.dashjs.dashjsStrings.periodSwitchCompleted
import typings.dashjs.dashjsStrings.periodSwitchStarted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeriodSwitchEvent extends Event {
  
  var fromStreamInfo: js.UndefOr[StreamInfo | Null] = js.native
  
  var toStreamInfo: StreamInfo | Null = js.native
  
  @JSName("type")
  var type_PeriodSwitchEvent: periodSwitchCompleted | periodSwitchStarted = js.native
}
object PeriodSwitchEvent {
  
  @scala.inline
  def apply(`type`: periodSwitchCompleted | periodSwitchStarted): PeriodSwitchEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodSwitchEvent]
  }
  
  @scala.inline
  implicit class PeriodSwitchEventMutableBuilder[Self <: PeriodSwitchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromStreamInfo(value: StreamInfo): Self = StObject.set(x, "fromStreamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromStreamInfoNull: Self = StObject.set(x, "fromStreamInfo", null)
    
    @scala.inline
    def setFromStreamInfoUndefined: Self = StObject.set(x, "fromStreamInfo", js.undefined)
    
    @scala.inline
    def setToStreamInfo(value: StreamInfo): Self = StObject.set(x, "toStreamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStreamInfoNull: Self = StObject.set(x, "toStreamInfo", null)
    
    @scala.inline
    def setType(value: periodSwitchCompleted | periodSwitchStarted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

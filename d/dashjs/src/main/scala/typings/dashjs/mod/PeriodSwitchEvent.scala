package typings.dashjs.mod

import typings.dashjs.dashjsStrings.periodSwitchCompleted
import typings.dashjs.dashjsStrings.periodSwitchStarted
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
  implicit class PeriodSwitchEventOps[Self <: PeriodSwitchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: periodSwitchCompleted | periodSwitchStarted): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromStreamInfo(value: StreamInfo): Self = this.set("fromStreamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromStreamInfo: Self = this.set("fromStreamInfo", js.undefined)
    
    @scala.inline
    def setFromStreamInfoNull: Self = this.set("fromStreamInfo", null)
    
    @scala.inline
    def setToStreamInfo(value: StreamInfo): Self = this.set("toStreamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStreamInfoNull: Self = this.set("toStreamInfo", null)
  }
}

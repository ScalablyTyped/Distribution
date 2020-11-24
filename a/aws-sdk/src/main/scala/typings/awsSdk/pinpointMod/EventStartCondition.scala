package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStartCondition extends js.Object {
  
  var EventFilter: js.UndefOr[typings.awsSdk.pinpointMod.EventFilter] = js.native
  
  var SegmentId: js.UndefOr[string] = js.native
}
object EventStartCondition {
  
  @scala.inline
  def apply(): EventStartCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventStartCondition]
  }
  
  @scala.inline
  implicit class EventStartConditionOps[Self <: EventStartCondition] (val x: Self) extends AnyVal {
    
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
    def setEventFilter(value: EventFilter): Self = this.set("EventFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventFilter: Self = this.set("EventFilter", js.undefined)
    
    @scala.inline
    def setSegmentId(value: string): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentId: Self = this.set("SegmentId", js.undefined)
  }
}

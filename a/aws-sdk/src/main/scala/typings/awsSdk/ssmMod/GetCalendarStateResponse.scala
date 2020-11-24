package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCalendarStateResponse extends js.Object {
  
  /**
    * The time, as an ISO 8601 string, that you specified in your command. If you did not specify a time, GetCalendarState uses the current time.
    */
  var AtTime: js.UndefOr[ISO8601String] = js.native
  
  /**
    * The time, as an ISO 8601 string, that the calendar state will change. If the current calendar state is OPEN, NextTransitionTime indicates when the calendar state changes to CLOSED, and vice-versa.
    */
  var NextTransitionTime: js.UndefOr[ISO8601String] = js.native
  
  /**
    * The state of the calendar. An OPEN calendar indicates that actions are allowed to proceed, and a CLOSED calendar indicates that actions are not allowed to proceed.
    */
  var State: js.UndefOr[CalendarState] = js.native
}
object GetCalendarStateResponse {
  
  @scala.inline
  def apply(): GetCalendarStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCalendarStateResponse]
  }
  
  @scala.inline
  implicit class GetCalendarStateResponseOps[Self <: GetCalendarStateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAtTime(value: ISO8601String): Self = this.set("AtTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtTime: Self = this.set("AtTime", js.undefined)
    
    @scala.inline
    def setNextTransitionTime(value: ISO8601String): Self = this.set("NextTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextTransitionTime: Self = this.set("NextTransitionTime", js.undefined)
    
    @scala.inline
    def setState(value: CalendarState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}

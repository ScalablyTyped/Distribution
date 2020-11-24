package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitTime extends js.Object {
  
  /**
    * The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's conditions have been met or moving participants to the next activity in the journey.
    */
  var WaitFor: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions have been met or the activity moves participants to the next activity in the journey.
    */
  var WaitUntil: js.UndefOr[string] = js.native
}
object WaitTime {
  
  @scala.inline
  def apply(): WaitTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitTime]
  }
  
  @scala.inline
  implicit class WaitTimeOps[Self <: WaitTime] (val x: Self) extends AnyVal {
    
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
    def setWaitFor(value: string): Self = this.set("WaitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitFor: Self = this.set("WaitFor", js.undefined)
    
    @scala.inline
    def setWaitUntil(value: string): Self = this.set("WaitUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitUntil: Self = this.set("WaitUntil", js.undefined)
  }
}

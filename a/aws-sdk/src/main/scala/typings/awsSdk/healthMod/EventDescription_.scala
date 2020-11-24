package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDescription_ extends js.Object {
  
  /**
    * The most recent description of the event.
    */
  var latestDescription: js.UndefOr[eventDescription] = js.native
}
object EventDescription_ {
  
  @scala.inline
  def apply(): EventDescription_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDescription_]
  }
  
  @scala.inline
  implicit class EventDescription_Ops[Self <: EventDescription_] (val x: Self) extends AnyVal {
    
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
    def setLatestDescription(value: eventDescription): Self = this.set("latestDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestDescription: Self = this.set("latestDescription", js.undefined)
  }
}

package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
  /**
    * The duration of the session, in milliseconds.
    */
  var Duration: js.UndefOr[integer] = js.native
  
  /**
    * The unique identifier for the session.
    */
  var Id: string = js.native
  
  /**
    * The date and time when the session began.
    */
  var StartTimestamp: string = js.native
  
  /**
    * The date and time when the session ended.
    */
  var StopTimestamp: js.UndefOr[string] = js.native
}
object Session {
  
  @scala.inline
  def apply(Id: string, StartTimestamp: string): Session = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestamp(value: string): Self = this.set("StartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setStopTimestamp(value: string): Self = this.set("StopTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTimestamp: Self = this.set("StopTimestamp", js.undefined)
  }
}

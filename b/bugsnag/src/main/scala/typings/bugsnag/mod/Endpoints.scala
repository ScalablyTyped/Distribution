package typings.bugsnag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoints extends js.Object {
  
  @JSName("notify")
  var notify_FEndpoints: String = js.native
  
  var sessions: js.UndefOr[String] = js.native
}
object Endpoints {
  
  @scala.inline
  def apply(notify: String): Endpoints = {
    val __obj = js.Dynamic.literal(notify = notify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoints]
  }
  
  @scala.inline
  implicit class EndpointsOps[Self <: Endpoints] (val x: Self) extends AnyVal {
    
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
    def setNotify(value: String): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessions(value: String): Self = this.set("sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessions: Self = this.set("sessions", js.undefined)
  }
}

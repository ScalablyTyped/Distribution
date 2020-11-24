package typings.clearbladejsServer.CbServer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerCreateOptions extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var frequency: js.UndefOr[Double] = js.native
  
  var repeats: js.UndefOr[Double] = js.native
  
  var service_name: js.UndefOr[String] = js.native
  
  var start_time: js.UndefOr[Date] = js.native
  
  var user_id: js.UndefOr[String] = js.native
  
  var user_token: js.UndefOr[String] = js.native
}
object TimerCreateOptions {
  
  @scala.inline
  def apply(): TimerCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimerCreateOptions]
  }
  
  @scala.inline
  implicit class TimerCreateOptionsOps[Self <: TimerCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setRepeats(value: Double): Self = this.set("repeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeats: Self = this.set("repeats", js.undefined)
    
    @scala.inline
    def setService_name(value: String): Self = this.set("service_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService_name: Self = this.set("service_name", js.undefined)
    
    @scala.inline
    def setStart_time(value: Date): Self = this.set("start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
    
    @scala.inline
    def setUser_token(value: String): Self = this.set("user_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_token: Self = this.set("user_token", js.undefined)
  }
}

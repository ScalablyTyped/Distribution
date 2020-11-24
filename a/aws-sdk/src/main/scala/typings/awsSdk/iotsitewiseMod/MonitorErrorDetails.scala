package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorErrorDetails extends js.Object {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[MonitorErrorCode] = js.native
  
  /**
    * The error message.
    */
  var message: js.UndefOr[MonitorErrorMessage] = js.native
}
object MonitorErrorDetails {
  
  @scala.inline
  def apply(): MonitorErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorErrorDetails]
  }
  
  @scala.inline
  implicit class MonitorErrorDetailsOps[Self <: MonitorErrorDetails] (val x: Self) extends AnyVal {
    
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
    def setCode(value: MonitorErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setMessage(value: MonitorErrorMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}

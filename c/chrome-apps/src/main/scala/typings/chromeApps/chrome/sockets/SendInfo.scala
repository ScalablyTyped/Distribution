package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendInfo extends js.Object {
  
  /** The number of bytes sent (if result == 0) */
  var bytesSent: js.UndefOr[integer] = js.native
  
  /** The result code returned from the underlying network call. A negative value indicates an error. */
  var resultCode: integer = js.native
}
object SendInfo {
  
  @scala.inline
  def apply(resultCode: integer): SendInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendInfo]
  }
  
  @scala.inline
  implicit class SendInfoOps[Self <: SendInfo] (val x: Self) extends AnyVal {
    
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
    def setResultCode(value: integer): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: integer): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesSent: Self = this.set("bytesSent", js.undefined)
  }
}

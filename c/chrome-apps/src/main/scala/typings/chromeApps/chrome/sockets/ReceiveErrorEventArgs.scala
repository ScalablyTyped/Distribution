package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiveErrorEventArgs extends js.Object {
  
  /** The result code returned from the underlying network call. */
  var resultCode: integer = js.native
  
  /** The socket identifier. */
  var socketId: integer = js.native
}
object ReceiveErrorEventArgs {
  
  @scala.inline
  def apply(resultCode: integer, socketId: integer): ReceiveErrorEventArgs = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveErrorEventArgs]
  }
  
  @scala.inline
  implicit class ReceiveErrorEventArgsOps[Self <: ReceiveErrorEventArgs] (val x: Self) extends AnyVal {
    
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
    def setSocketId(value: integer): Self = this.set("socketId", value.asInstanceOf[js.Any])
  }
}

package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiveEventArgs extends js.Object {
  
  /** The data received, with a maxium size of *bufferSize*. */
  var data: ArrayBuffer = js.native
  
  /** The socket identifier. */
  var socketId: integer = js.native
}
object ReceiveEventArgs {
  
  @scala.inline
  def apply(data: ArrayBuffer, socketId: integer): ReceiveEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveEventArgs]
  }
  
  @scala.inline
  implicit class ReceiveEventArgsOps[Self <: ReceiveEventArgs] (val x: Self) extends AnyVal {
    
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
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketId(value: integer): Self = this.set("socketId", value.asInstanceOf[js.Any])
  }
}

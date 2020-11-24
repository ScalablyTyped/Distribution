package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInfo extends js.Object {
  
  /**
    * The ID of the newly created socket.
    * Note that socket IDs created from this
    * API are not compatible with socket IDs
    * created from other APIs, such as the
    * sockets.tcp API.
    */
  var socketId: integer = js.native
}
object CreateInfo {
  
  @scala.inline
  def apply(socketId: integer): CreateInfo = {
    val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInfo]
  }
  
  @scala.inline
  implicit class CreateInfoOps[Self <: CreateInfo] (val x: Self) extends AnyVal {
    
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
    def setSocketId(value: integer): Self = this.set("socketId", value.asInstanceOf[js.Any])
  }
}

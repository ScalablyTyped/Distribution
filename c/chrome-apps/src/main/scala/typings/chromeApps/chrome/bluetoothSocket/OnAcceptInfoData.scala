package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAcceptInfoData extends js.Object {
  /**
    * The client socket identifier, i.e. the socket
    * identifier of the newly established connection.
    * This socket identifier should be used only with
    * functions from the chrome.bluetoothSocket namespace.
    * Note the client socket is initially paused and must
    * be explictly un-paused by the application to start
    * receiving data.
    */
  var clientSocketId: integer = js.native
  /** The server socket identifier. */
  var socketId: integer = js.native
}

object OnAcceptInfoData {
  @scala.inline
  def apply(clientSocketId: integer, socketId: integer): OnAcceptInfoData = {
    val __obj = js.Dynamic.literal(clientSocketId = clientSocketId.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAcceptInfoData]
  }
  @scala.inline
  implicit class OnAcceptInfoDataOps[Self <: OnAcceptInfoData] (val x: Self) extends AnyVal {
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
    def setClientSocketId(value: integer): Self = this.set("clientSocketId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocketId(value: integer): Self = this.set("socketId", value.asInstanceOf[js.Any])
  }
  
}


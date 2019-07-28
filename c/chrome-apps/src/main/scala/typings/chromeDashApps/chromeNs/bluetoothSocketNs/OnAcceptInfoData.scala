package typings.chromeDashApps.chromeNs.bluetoothSocketNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var clientSocketId: integer
  /** The server socket identifier. */
  var socketId: integer
}

object OnAcceptInfoData {
  @scala.inline
  def apply(clientSocketId: integer, socketId: integer): OnAcceptInfoData = {
    val __obj = js.Dynamic.literal(clientSocketId = clientSocketId, socketId = socketId)
  
    __obj.asInstanceOf[OnAcceptInfoData]
  }
}


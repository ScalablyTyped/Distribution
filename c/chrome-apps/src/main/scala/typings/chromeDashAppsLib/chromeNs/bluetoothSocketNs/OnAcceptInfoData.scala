package typings
package chromeDashAppsLib.chromeNs.bluetoothSocketNs

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
  var clientSocketId: chromeDashAppsLib.chromeNs.integer
  /** The server socket identifier. */
  var socketId: chromeDashAppsLib.chromeNs.integer
}

object OnAcceptInfoData {
  @scala.inline
  def apply(clientSocketId: chromeDashAppsLib.chromeNs.integer, socketId: chromeDashAppsLib.chromeNs.integer): OnAcceptInfoData = {
    val __obj = js.Dynamic.literal(clientSocketId = clientSocketId, socketId = socketId)
  
    __obj.asInstanceOf[OnAcceptInfoData]
  }
}


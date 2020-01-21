package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInfo extends js.Object {
  /**
    * The ID of the newly created socket.
    * Note that socket IDs created from this API are
    * **not compatible** with socket IDs created from
    * other APIs, such as the deprecated socket API.
    */
  var socketId: integer
}

object CreateInfo {
  @scala.inline
  def apply(socketId: integer): CreateInfo = {
    val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateInfo]
  }
}


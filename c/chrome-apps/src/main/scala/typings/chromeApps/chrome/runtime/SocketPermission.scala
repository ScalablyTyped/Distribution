package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketPermission extends Permission {
  /**
    * **Possible values includes:**
    * 'tcp-connect',
    * 'udp-send-to',
    * 'udp-send-to::*'
    * 'udp-bind',
    * 'udp-multicast-membership',
    * 'resolve-host',
    * 'network-state'
    */
  var socket: js.Array[String]
}

object SocketPermission {
  @scala.inline
  def apply(socket: js.Array[String]): SocketPermission = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketPermission]
  }
}


package typings
package chromeDashAppsLib.chromeNs.runtimeNs

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
  var socket: js.Array[java.lang.String]
}

object SocketPermission {
  @scala.inline
  def apply(socket: js.Array[java.lang.String]): SocketPermission = {
    val __obj = js.Dynamic.literal(socket = socket)
  
    __obj.asInstanceOf[SocketPermission]
  }
}


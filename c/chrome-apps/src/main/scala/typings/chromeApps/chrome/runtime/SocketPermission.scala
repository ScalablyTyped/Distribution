package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var socket: js.Array[String] = js.native
}
object SocketPermission {
  
  @scala.inline
  def apply(socket: js.Array[String]): SocketPermission = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketPermission]
  }
  
  @scala.inline
  implicit class SocketPermissionOps[Self <: SocketPermission] (val x: Self) extends AnyVal {
    
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
    def setSocketVarargs(value: String*): Self = this.set("socket", js.Array(value :_*))
    
    @scala.inline
    def setSocket(value: js.Array[String]): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
}

package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketPermission
  extends StObject
     with Permission {
  
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
  
  @scala.inline
  implicit class SocketPermissionMutableBuilder[Self <: SocketPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocket(value: js.Array[String]): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketVarargs(value: String*): Self = StObject.set(x, "socket", js.Array(value :_*))
  }
}

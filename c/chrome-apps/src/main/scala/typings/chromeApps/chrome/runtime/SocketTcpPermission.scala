package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// For chrome.sockets ///
@js.native
trait SocketTcpPermission extends StObject {
  
  /**
    * The host:port pattern for connect operations.
    * *:* are allowed
    */
  var connect: js.UndefOr[String | js.Array[String]] = js.native
}
object SocketTcpPermission {
  
  @scala.inline
  def apply(): SocketTcpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketTcpPermission]
  }
  
  @scala.inline
  implicit class SocketTcpPermissionMutableBuilder[Self <: SocketTcpPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: String | js.Array[String]): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setConnectVarargs(value: String*): Self = StObject.set(x, "connect", js.Array(value :_*))
  }
}

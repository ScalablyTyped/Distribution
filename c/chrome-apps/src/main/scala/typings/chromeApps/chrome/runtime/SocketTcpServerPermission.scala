package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketTcpServerPermission extends StObject {
  
  /**
    * The host:port pattern for listen operations.
    * *:* are allowed
    */
  var listen: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SocketTcpServerPermission {
  
  @scala.inline
  def apply(): SocketTcpServerPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketTcpServerPermission]
  }
  
  @scala.inline
  implicit class SocketTcpServerPermissionMutableBuilder[Self <: SocketTcpServerPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListen(value: String | js.Array[String]): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
    
    @scala.inline
    def setListenVarargs(value: String*): Self = StObject.set(x, "listen", js.Array(value :_*))
  }
}

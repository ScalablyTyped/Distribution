package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// For chrome.sockets ///
trait SocketTcpPermission extends StObject {
  
  /**
    * The host:port pattern for connect operations.
    * *:* are allowed
    */
  var connect: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SocketTcpPermission {
  
  inline def apply(): SocketTcpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketTcpPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketTcpPermission] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: String | js.Array[String]): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setConnectVarargs(value: String*): Self = StObject.set(x, "connect", js.Array(value*))
  }
}

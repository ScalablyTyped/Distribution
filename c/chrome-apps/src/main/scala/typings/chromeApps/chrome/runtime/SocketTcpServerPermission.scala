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
  
  inline def apply(): SocketTcpServerPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketTcpServerPermission]
  }
  
  extension [Self <: SocketTcpServerPermission](x: Self) {
    
    inline def setListen(value: String | js.Array[String]): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    inline def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
    
    inline def setListenVarargs(value: String*): Self = StObject.set(x, "listen", js.Array(value :_*))
  }
}

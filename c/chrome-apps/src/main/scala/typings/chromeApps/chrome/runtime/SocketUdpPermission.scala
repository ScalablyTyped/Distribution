package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketUdpPermission extends StObject {
  
  /**
    * The host:port pattern for bind operations.
    * *:* are allowed
    */
  var bind: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * The host:port pattern for joinGroup operations.
    * *:* are allowed
    */
  var multicastMembership: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * The host:port pattern for send operations.
    * *:* are allowed
    */
  var send: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SocketUdpPermission {
  
  inline def apply(): SocketUdpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketUdpPermission]
  }
  
  extension [Self <: SocketUdpPermission](x: Self) {
    
    inline def setBind(value: String | js.Array[String]): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    inline def setBindVarargs(value: String*): Self = StObject.set(x, "bind", js.Array(value :_*))
    
    inline def setMulticastMembership(value: String | js.Array[String]): Self = StObject.set(x, "multicastMembership", value.asInstanceOf[js.Any])
    
    inline def setMulticastMembershipUndefined: Self = StObject.set(x, "multicastMembership", js.undefined)
    
    inline def setMulticastMembershipVarargs(value: String*): Self = StObject.set(x, "multicastMembership", js.Array(value :_*))
    
    inline def setSend(value: String | js.Array[String]): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    inline def setSendVarargs(value: String*): Self = StObject.set(x, "send", js.Array(value :_*))
  }
}

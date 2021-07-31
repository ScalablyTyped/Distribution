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
  
  @scala.inline
  def apply(): SocketUdpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketUdpPermission]
  }
  
  @scala.inline
  implicit class SocketUdpPermissionMutableBuilder[Self <: SocketUdpPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: String | js.Array[String]): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    @scala.inline
    def setBindVarargs(value: String*): Self = StObject.set(x, "bind", js.Array(value :_*))
    
    @scala.inline
    def setMulticastMembership(value: String | js.Array[String]): Self = StObject.set(x, "multicastMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticastMembershipUndefined: Self = StObject.set(x, "multicastMembership", js.undefined)
    
    @scala.inline
    def setMulticastMembershipVarargs(value: String*): Self = StObject.set(x, "multicastMembership", js.Array(value :_*))
    
    @scala.inline
    def setSend(value: String | js.Array[String]): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    @scala.inline
    def setSendVarargs(value: String*): Self = StObject.set(x, "send", js.Array(value :_*))
  }
}

package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// For chrome.sockets ///
@js.native
trait SocketTcpPermission extends js.Object {
  
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
  implicit class SocketTcpPermissionOps[Self <: SocketTcpPermission] (val x: Self) extends AnyVal {
    
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
    def setConnectVarargs(value: String*): Self = this.set("connect", js.Array(value :_*))
    
    @scala.inline
    def setConnect(value: String | js.Array[String]): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
  }
}

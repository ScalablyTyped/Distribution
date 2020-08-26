package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketTcpServerPermission extends js.Object {
  /**
    * The host:port pattern for listen operations.
    * *:* are allowed
    */
  var listen: js.UndefOr[String | js.Array[String]] = js.native
}

object SocketTcpServerPermission {
  @scala.inline
  def apply(): SocketTcpServerPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketTcpServerPermission]
  }
  @scala.inline
  implicit class SocketTcpServerPermissionOps[Self <: SocketTcpServerPermission] (val x: Self) extends AnyVal {
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
    def setListenVarargs(value: String*): Self = this.set("listen", js.Array(value :_*))
    @scala.inline
    def setListen(value: String | js.Array[String]): Self = this.set("listen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListen: Self = this.set("listen", js.undefined)
  }
  
}


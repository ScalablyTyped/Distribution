package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketUdpPermission extends js.Object {
  /**
    * The host:port pattern for bind operations.
    * *:* are allowed
    */
  var bind: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The host:port pattern for joinGroup operations.
    * *:* are allowed
    */
  var multicastMembership: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The host:port pattern for send operations.
    * *:* are allowed
    */
  var send: js.UndefOr[String | js.Array[String]] = js.native
}

object SocketUdpPermission {
  @scala.inline
  def apply(): SocketUdpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketUdpPermission]
  }
  @scala.inline
  implicit class SocketUdpPermissionOps[Self <: SocketUdpPermission] (val x: Self) extends AnyVal {
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
    def setBindVarargs(value: String*): Self = this.set("bind", js.Array(value :_*))
    @scala.inline
    def setBind(value: String | js.Array[String]): Self = this.set("bind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setMulticastMembershipVarargs(value: String*): Self = this.set("multicastMembership", js.Array(value :_*))
    @scala.inline
    def setMulticastMembership(value: String | js.Array[String]): Self = this.set("multicastMembership", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulticastMembership: Self = this.set("multicastMembership", js.undefined)
    @scala.inline
    def setSendVarargs(value: String*): Self = this.set("send", js.Array(value :_*))
    @scala.inline
    def setSend(value: String | js.Array[String]): Self = this.set("send", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
  }
  
}


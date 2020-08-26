package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionState extends js.Object {
  /**
    * The last time the connection status was updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * The connection status of the tunnel. Valid values are CONNECTED and DISCONNECTED.
    */
  var status: js.UndefOr[ConnectionStatus] = js.native
}

object ConnectionState {
  @scala.inline
  def apply(): ConnectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionState]
  }
  @scala.inline
  implicit class ConnectionStateOps[Self <: ConnectionState] (val x: Self) extends AnyVal {
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
    def setLastUpdatedAt(value: DateType): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setStatus(value: ConnectionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}


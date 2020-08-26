package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionId extends js.Object {
  var connectionId: integer = js.native
}

object ConnectionId {
  @scala.inline
  def apply(connectionId: integer): ConnectionId = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionId]
  }
  @scala.inline
  implicit class ConnectionIdOps[Self <: ConnectionId] (val x: Self) extends AnyVal {
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
    def setConnectionId(value: integer): Self = this.set("connectionId", value.asInstanceOf[js.Any])
  }
  
}


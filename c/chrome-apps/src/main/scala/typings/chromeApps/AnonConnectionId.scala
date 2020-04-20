package typings.chromeApps

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectionId extends js.Object {
  var connectionId: integer
}

object AnonConnectionId {
  @scala.inline
  def apply(connectionId: integer): AnonConnectionId = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectionId]
  }
}


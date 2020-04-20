package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInfo extends js.Object {
  var socketId: Double
}

object CreateInfo {
  @scala.inline
  def apply(socketId: Double): CreateInfo = {
    val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInfo]
  }
}


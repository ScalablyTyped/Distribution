package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInfo extends js.Object {
  var socketId: scala.Double
}

object CreateInfo {
  @scala.inline
  def apply(socketId: scala.Double): CreateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("socketId")(socketId)
    __obj.asInstanceOf[CreateInfo]
  }
}


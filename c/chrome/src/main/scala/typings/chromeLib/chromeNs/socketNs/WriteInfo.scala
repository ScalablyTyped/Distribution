package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteInfo extends js.Object {
  var bytesWritten: scala.Double
}

object WriteInfo {
  @scala.inline
  def apply(bytesWritten: scala.Double): WriteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesWritten")(bytesWritten)
    __obj.asInstanceOf[WriteInfo]
  }
}


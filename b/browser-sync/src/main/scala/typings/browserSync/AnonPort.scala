package typings.browserSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPort extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
}

object AnonPort {
  @scala.inline
  def apply(port: Int | Double = null): AnonPort = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPort]
  }
}


package typings.browserSync.mod

import typings.browserSync.AnonPort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIOptions extends js.Object {
  /** set the default port */
  var port: js.UndefOr[Double] = js.undefined
  /** set the default weinre port */
  var weinre: js.UndefOr[AnonPort] = js.undefined
}

object UIOptions {
  @scala.inline
  def apply(port: Int | Double = null, weinre: AnonPort = null): UIOptions = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (weinre != null) __obj.updateDynamic("weinre")(weinre.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIOptions]
  }
}


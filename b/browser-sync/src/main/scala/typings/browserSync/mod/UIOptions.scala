package typings.browserSync.mod

import typings.browserSync.anon.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIOptions extends js.Object {
  /** set the default port */
  var port: js.UndefOr[Double] = js.undefined
  /** set the default weinre port */
  var weinre: js.UndefOr[Port] = js.undefined
}

object UIOptions {
  @scala.inline
  def apply(port: js.UndefOr[Double] = js.undefined, weinre: Port = null): UIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (weinre != null) __obj.updateDynamic("weinre")(weinre.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIOptions]
  }
}


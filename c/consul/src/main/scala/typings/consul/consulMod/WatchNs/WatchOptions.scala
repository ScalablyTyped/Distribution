package typings.consul.consulMod.WatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var key: js.UndefOr[String] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(key: String = null): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[WatchOptions]
  }
}


package typings.chromeDashApps.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectInfo extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ConnectInfo {
  @scala.inline
  def apply(name: String = null): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ConnectInfo]
  }
}


package typings.bunyanConfig.mod

import typings.bunyanConfig.AnonHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamConfiguration extends js.Object {
  var name: String
  var params: js.UndefOr[AnonHost] = js.undefined
}

object StreamConfiguration {
  @scala.inline
  def apply(name: String, params: AnonHost = null): StreamConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfiguration]
  }
}


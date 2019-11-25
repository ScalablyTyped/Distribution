package typings.bunyanDashConfig.bunyanDashConfigMod

import typings.bunyanDashConfig.Anon_Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamConfiguration extends js.Object {
  var name: String
  var params: js.UndefOr[Anon_Host] = js.undefined
}

object StreamConfiguration {
  @scala.inline
  def apply(name: String, params: Anon_Host = null): StreamConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfiguration]
  }
}


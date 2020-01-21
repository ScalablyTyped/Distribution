package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceGlobalRegistration extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object PluginServiceGlobalRegistration {
  @scala.inline
  def apply(id: String = null): PluginServiceGlobalRegistration = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginServiceGlobalRegistration]
  }
}


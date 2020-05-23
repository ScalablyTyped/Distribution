package typings.ddTrace.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Integration extends js.Object {
  /** Whether to enable the plugin.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The service name to be used for this plugin.
    */
  var service: js.UndefOr[String] = js.undefined
}

object Integration {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, service: String = null): Integration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integration]
  }
}


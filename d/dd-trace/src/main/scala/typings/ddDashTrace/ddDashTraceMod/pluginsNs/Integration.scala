package typings.ddDashTrace.ddDashTraceMod.pluginsNs

import typings.ddDashTrace.Anon_Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Integration extends js.Object {
  /**
    * Trace Analytics configuration.
    * @default false
    */
  var analytics: js.UndefOr[Boolean | Anon_Enabled] = js.undefined
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
  def apply(
    analytics: Boolean | Anon_Enabled = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    service: String = null
  ): Integration = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[Integration]
  }
}


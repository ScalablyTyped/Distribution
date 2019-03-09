package typings
package ddDashTraceLib.ddDashTraceMod.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Integration extends js.Object {
  /**
    * Trace Analytics configuration.
    * @default false
    */
  var analytics: js.UndefOr[scala.Boolean | ddDashTraceLib.Anon_Enabled] = js.undefined
  /** Whether to enable the plugin.
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The service name to be used for this plugin.
    */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object Integration {
  @scala.inline
  def apply(
    analytics: scala.Boolean | ddDashTraceLib.Anon_Enabled = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    service: java.lang.String = null
  ): Integration = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[Integration]
  }
}


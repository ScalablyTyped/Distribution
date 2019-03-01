package typings
package consulLib.consulMod.ConsulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsulOptions extends js.Object {
  var ca: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var defaults: js.UndefOr[CommonOptions] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String] = js.undefined
  var promisify: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object ConsulOptions {
  @scala.inline
  def apply(
    ca: js.Array[java.lang.String] = null,
    defaults: CommonOptions = null,
    host: java.lang.String = null,
    port: java.lang.String = null,
    promisify: scala.Boolean | js.Function = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): ConsulOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port)
    if (promisify != null) __obj.updateDynamic("promisify")(promisify.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[ConsulOptions]
  }
}


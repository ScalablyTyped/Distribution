package typings.consul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsulOptions extends js.Object {
  var ca: js.UndefOr[js.Array[String]] = js.undefined
  var defaults: js.UndefOr[CommonOptions] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var promisify: js.UndefOr[Boolean | js.Function] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object ConsulOptions {
  @scala.inline
  def apply(
    ca: js.Array[String] = null,
    defaults: CommonOptions = null,
    host: String = null,
    port: String = null,
    promisify: Boolean | js.Function = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): ConsulOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (promisify != null) __obj.updateDynamic("promisify")(promisify.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsulOptions]
  }
}


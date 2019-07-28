package typings.cradle.cradleMod

import typings.cradle.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var auth: js.UndefOr[String | Anon_Password] = js.undefined
  var ca: js.UndefOr[String] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var forceSave: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var maxSockets: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var retryTimeout: js.UndefOr[Double] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth: String | Anon_Password = null,
    ca: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    forceSave: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    hostname: String = null,
    maxSockets: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    retries: Int | Double = null,
    retryTimeout: Int | Double = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(forceSave)) __obj.updateDynamic("forceSave")(forceSave)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (retryTimeout != null) __obj.updateDynamic("retryTimeout")(retryTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Options]
  }
}


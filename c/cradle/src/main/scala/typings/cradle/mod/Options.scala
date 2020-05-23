package typings.cradle.mod

import typings.cradle.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var auth: js.UndefOr[String | Password] = js.undefined
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
    auth: String | Password = null,
    ca: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    forceSave: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    hostname: String = null,
    maxSockets: js.UndefOr[Double] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined,
    retryTimeout: js.UndefOr[Double] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSave)) __obj.updateDynamic("forceSave")(forceSave.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryTimeout)) __obj.updateDynamic("retryTimeout")(retryTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


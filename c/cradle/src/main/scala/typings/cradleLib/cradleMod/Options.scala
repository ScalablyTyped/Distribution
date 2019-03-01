package typings
package cradleLib.cradleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var auth: js.UndefOr[java.lang.String | cradleLib.Anon_Password] = js.undefined
  var ca: js.UndefOr[java.lang.String] = js.undefined
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var forceSave: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var retryTimeout: js.UndefOr[scala.Double] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth: java.lang.String | cradleLib.Anon_Password = null,
    ca: java.lang.String = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    forceSave: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    maxSockets: scala.Int | scala.Double = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null,
    retryTimeout: scala.Int | scala.Double = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
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


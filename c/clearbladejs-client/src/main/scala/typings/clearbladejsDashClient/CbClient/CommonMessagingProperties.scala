package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMessagingProperties extends js.Object {
  var cleanSession: js.UndefOr[Boolean] = js.undefined
  var hosts: js.UndefOr[String] = js.undefined
  var onFailure: js.UndefOr[js.Function] = js.undefined
  var onSuccess: js.UndefOr[js.Function] = js.undefined
  var ports: js.UndefOr[String] = js.undefined
  var useSSL: js.UndefOr[Boolean] = js.undefined
}

object CommonMessagingProperties {
  @scala.inline
  def apply(
    cleanSession: js.UndefOr[Boolean] = js.undefined,
    hosts: String = null,
    onFailure: js.Function = null,
    onSuccess: js.Function = null,
    ports: String = null,
    useSSL: js.UndefOr[Boolean] = js.undefined
  ): CommonMessagingProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession)
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL)
    __obj.asInstanceOf[CommonMessagingProperties]
  }
}


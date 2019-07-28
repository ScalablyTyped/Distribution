package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingOptions extends CommonMessagingProperties {
  var qos: js.UndefOr[MessagingQOS] = js.undefined
}

object MessagingOptions {
  @scala.inline
  def apply(
    cleanSession: js.UndefOr[Boolean] = js.undefined,
    hosts: String = null,
    onFailure: js.Function = null,
    onSuccess: js.Function = null,
    ports: String = null,
    qos: MessagingQOS = null,
    useSSL: js.UndefOr[Boolean] = js.undefined
  ): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession)
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    if (qos != null) __obj.updateDynamic("qos")(qos)
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL)
    __obj.asInstanceOf[MessagingOptions]
  }
}


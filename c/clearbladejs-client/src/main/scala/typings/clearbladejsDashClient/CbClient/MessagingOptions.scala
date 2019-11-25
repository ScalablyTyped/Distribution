package typings.clearbladejsDashClient.CbClient

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
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingOptions]
  }
}


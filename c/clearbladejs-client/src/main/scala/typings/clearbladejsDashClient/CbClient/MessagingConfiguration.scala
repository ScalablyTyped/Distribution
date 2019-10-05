package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingConfiguration extends CommonMessagingProperties {
  var password: String
  var userName: String
}

object MessagingConfiguration {
  @scala.inline
  def apply(
    password: String,
    userName: String,
    cleanSession: js.UndefOr[Boolean] = js.undefined,
    hosts: String = null,
    onFailure: js.Function = null,
    onSuccess: js.Function = null,
    ports: String = null,
    useSSL: js.UndefOr[Boolean] = js.undefined
  ): MessagingConfiguration = {
    val __obj = js.Dynamic.literal(password = password, userName = userName)
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession)
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL)
    __obj.asInstanceOf[MessagingConfiguration]
  }
}


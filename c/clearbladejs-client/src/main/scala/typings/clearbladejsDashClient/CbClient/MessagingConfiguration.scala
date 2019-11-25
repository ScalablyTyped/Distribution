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
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingConfiguration]
  }
}


package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingConfiguration extends CommonMessagingProperties {
  var password: java.lang.String
  var userName: java.lang.String
}

object MessagingConfiguration {
  @scala.inline
  def apply(
    password: java.lang.String,
    userName: java.lang.String,
    cleanSession: js.UndefOr[scala.Boolean] = js.undefined,
    hosts: java.lang.String = null,
    onFailure: js.Function = null,
    onSuccess: js.Function = null,
    ports: java.lang.String = null,
    useSSL: js.UndefOr[scala.Boolean] = js.undefined
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


package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var URI: js.UndefOr[java.lang.String] = js.undefined
  var authToken: js.UndefOr[java.lang.String] = js.undefined
  var callTimeout: js.UndefOr[scala.Double] = js.undefined
  var callback: js.UndefOr[CbCallback] = js.undefined
  var defaultQoS: js.UndefOr[MessagingQOS] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var messagingPort: js.UndefOr[scala.Double] = js.undefined
  var messagingURI: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var registerUser: js.UndefOr[scala.Boolean] = js.undefined
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var useUser: js.UndefOr[APIUser] = js.undefined
  var userToken: js.UndefOr[java.lang.String] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    URI: java.lang.String = null,
    authToken: java.lang.String = null,
    callTimeout: scala.Int | scala.Double = null,
    callback: CbCallback = null,
    defaultQoS: MessagingQOS = null,
    email: java.lang.String = null,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    messagingPort: scala.Int | scala.Double = null,
    messagingURI: java.lang.String = null,
    password: java.lang.String = null,
    registerUser: js.UndefOr[scala.Boolean] = js.undefined,
    useUser: APIUser = null,
    userToken: java.lang.String = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey, systemSecret = systemSecret)
    if (URI != null) __obj.updateDynamic("URI")(URI)
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    if (callTimeout != null) __obj.updateDynamic("callTimeout")(callTimeout.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (defaultQoS != null) __obj.updateDynamic("defaultQoS")(defaultQoS)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (messagingPort != null) __obj.updateDynamic("messagingPort")(messagingPort.asInstanceOf[js.Any])
    if (messagingURI != null) __obj.updateDynamic("messagingURI")(messagingURI)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(registerUser)) __obj.updateDynamic("registerUser")(registerUser)
    if (useUser != null) __obj.updateDynamic("useUser")(useUser)
    if (userToken != null) __obj.updateDynamic("userToken")(userToken)
    __obj.asInstanceOf[InitOptions]
  }
}


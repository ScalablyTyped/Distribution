package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var URI: js.UndefOr[String] = js.undefined
  var callTimeout: js.UndefOr[Double] = js.undefined
  var callback: js.UndefOr[CbCallback] = js.undefined
  var defaultQoS: js.UndefOr[MessagingQOS] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var masterSecret: js.UndefOr[String] = js.undefined
  var messagingAuthPort: js.UndefOr[Double] = js.undefined
  var messagingPort: js.UndefOr[Double] = js.undefined
  var messagingURI: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var registerUser: js.UndefOr[Boolean] = js.undefined
  var systemKey: String
  var systemSecret: String
  var useUser: js.UndefOr[APIUser] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    systemKey: String,
    systemSecret: String,
    URI: String = null,
    callTimeout: Int | Double = null,
    callback: (/* error */ Boolean, /* response */ Resp) => Unit = null,
    defaultQoS: MessagingQOS = null,
    email: String = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    masterSecret: String = null,
    messagingAuthPort: Int | Double = null,
    messagingPort: Int | Double = null,
    messagingURI: String = null,
    password: String = null,
    registerUser: js.UndefOr[Boolean] = js.undefined,
    useUser: APIUser = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    if (URI != null) __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    if (callTimeout != null) __obj.updateDynamic("callTimeout")(callTimeout.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (defaultQoS != null) __obj.updateDynamic("defaultQoS")(defaultQoS.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (masterSecret != null) __obj.updateDynamic("masterSecret")(masterSecret.asInstanceOf[js.Any])
    if (messagingAuthPort != null) __obj.updateDynamic("messagingAuthPort")(messagingAuthPort.asInstanceOf[js.Any])
    if (messagingPort != null) __obj.updateDynamic("messagingPort")(messagingPort.asInstanceOf[js.Any])
    if (messagingURI != null) __obj.updateDynamic("messagingURI")(messagingURI.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(registerUser)) __obj.updateDynamic("registerUser")(registerUser.asInstanceOf[js.Any])
    if (useUser != null) __obj.updateDynamic("useUser")(useUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}


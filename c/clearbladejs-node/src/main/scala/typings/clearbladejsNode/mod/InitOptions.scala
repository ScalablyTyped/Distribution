package typings.clearbladejsNode.mod

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
    callTimeout: js.UndefOr[Double] = js.undefined,
    callback: (/* error */ Boolean, /* response */ Resp) => Unit = null,
    defaultQoS: MessagingQOS = null,
    email: String = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    messagingPort: js.UndefOr[Double] = js.undefined,
    messagingURI: String = null,
    password: String = null,
    registerUser: js.UndefOr[Boolean] = js.undefined,
    useUser: APIUser = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    if (URI != null) __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    if (!js.isUndefined(callTimeout)) __obj.updateDynamic("callTimeout")(callTimeout.get.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (defaultQoS != null) __obj.updateDynamic("defaultQoS")(defaultQoS.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messagingPort)) __obj.updateDynamic("messagingPort")(messagingPort.get.asInstanceOf[js.Any])
    if (messagingURI != null) __obj.updateDynamic("messagingURI")(messagingURI.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(registerUser)) __obj.updateDynamic("registerUser")(registerUser.get.asInstanceOf[js.Any])
    if (useUser != null) __obj.updateDynamic("useUser")(useUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}


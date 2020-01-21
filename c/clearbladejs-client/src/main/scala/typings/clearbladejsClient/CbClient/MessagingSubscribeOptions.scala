package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingSubscribeOptions extends js.Object {
  var invocationContext: js.UndefOr[js.Object] = js.undefined
  var onFailure: js.UndefOr[js.Function] = js.undefined
  var onSuccess: js.UndefOr[js.Function] = js.undefined
  var qos: js.UndefOr[MessagingQOS] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object MessagingSubscribeOptions {
  @scala.inline
  def apply(
    invocationContext: js.Object = null,
    onFailure: js.Function = null,
    onSuccess: js.Function = null,
    qos: MessagingQOS = null,
    timeout: Int | Double = null
  ): MessagingSubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess.asInstanceOf[js.Any])
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingSubscribeOptions]
  }
}


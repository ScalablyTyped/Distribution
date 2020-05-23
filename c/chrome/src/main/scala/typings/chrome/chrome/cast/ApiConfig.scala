package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiConfig extends js.Object {
  var autoJoinPolicy: js.UndefOr[AutoJoinPolicy] = js.undefined
  var defaultActionPolicy: DefaultActionPolicy
  var sessionRequest: SessionRequest
  def receiverListener(receiverAvailability: ReceiverAvailability): Unit
  def sessionListener(session: Session): Unit
}

object ApiConfig {
  @scala.inline
  def apply(
    defaultActionPolicy: DefaultActionPolicy,
    receiverListener: ReceiverAvailability => Unit,
    sessionListener: Session => Unit,
    sessionRequest: SessionRequest,
    autoJoinPolicy: AutoJoinPolicy = null
  ): ApiConfig = {
    val __obj = js.Dynamic.literal(defaultActionPolicy = defaultActionPolicy.asInstanceOf[js.Any], receiverListener = js.Any.fromFunction1(receiverListener), sessionListener = js.Any.fromFunction1(sessionListener), sessionRequest = sessionRequest.asInstanceOf[js.Any])
    if (autoJoinPolicy != null) __obj.updateDynamic("autoJoinPolicy")(autoJoinPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiConfig]
  }
}


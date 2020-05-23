package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousNetworkTransactionId extends js.Object {
  var previousNetworkTransactionId: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object PreviousNetworkTransactionId {
  @scala.inline
  def apply(previousNetworkTransactionId: String = null, status: String = null): PreviousNetworkTransactionId = {
    val __obj = js.Dynamic.literal()
    if (previousNetworkTransactionId != null) __obj.updateDynamic("previousNetworkTransactionId")(previousNetworkTransactionId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousNetworkTransactionId]
  }
}


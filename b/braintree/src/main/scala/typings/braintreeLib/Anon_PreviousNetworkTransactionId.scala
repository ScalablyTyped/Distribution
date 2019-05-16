package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreviousNetworkTransactionId extends js.Object {
  var previousNetworkTransactionId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PreviousNetworkTransactionId {
  @scala.inline
  def apply(previousNetworkTransactionId: java.lang.String = null, status: java.lang.String = null): Anon_PreviousNetworkTransactionId = {
    val __obj = js.Dynamic.literal()
    if (previousNetworkTransactionId != null) __obj.updateDynamic("previousNetworkTransactionId")(previousNetworkTransactionId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Anon_PreviousNetworkTransactionId]
  }
}


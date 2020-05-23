package typings.coinbaseCommerceNode.anon

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELAYED
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MANUAL
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MULTIPLE
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OTHER
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OVERPAID
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNDERPAID
import typings.coinbaseCommerceNode.mod.PaymentStatus
import typings.coinbaseCommerceNode.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /**
    * Timeline entry context.
    */
  var context: js.UndefOr[UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER] = js.undefined
  /**
    * Timeline entry status.
    */
  var status: PaymentStatus
  /**
    * Timeline entry timestamp.
    */
  var time: Timestamp
}

object Context {
  @scala.inline
  def apply(
    status: PaymentStatus,
    time: Timestamp,
    context: UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER = null
  ): Context = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}


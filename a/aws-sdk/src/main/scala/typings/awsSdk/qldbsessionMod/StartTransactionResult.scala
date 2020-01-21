package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTransactionResult extends js.Object {
  /**
    * The transaction id of the started transaction.
    */
  var TransactionId: js.UndefOr[typings.awsSdk.qldbsessionMod.TransactionId] = js.native
}

object StartTransactionResult {
  @scala.inline
  def apply(TransactionId: TransactionId = null): StartTransactionResult = {
    val __obj = js.Dynamic.literal()
    if (TransactionId != null) __obj.updateDynamic("TransactionId")(TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTransactionResult]
  }
}


package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitTransactionResponse extends js.Object {
  /**
    * The status of the commit operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.native
}

object CommitTransactionResponse {
  @scala.inline
  def apply(transactionStatus: TransactionStatus = null): CommitTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transactionStatus != null) __obj.updateDynamic("transactionStatus")(transactionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTransactionResponse]
  }
}


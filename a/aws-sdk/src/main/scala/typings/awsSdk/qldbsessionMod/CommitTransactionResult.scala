package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitTransactionResult extends js.Object {
  /**
    * The commit digest of the committed transaction.
    */
  var CommitDigest: js.UndefOr[typings.awsSdk.qldbsessionMod.CommitDigest] = js.native
  /**
    * The transaction id of the committed transaction.
    */
  var TransactionId: js.UndefOr[typings.awsSdk.qldbsessionMod.TransactionId] = js.native
}

object CommitTransactionResult {
  @scala.inline
  def apply(CommitDigest: CommitDigest = null, TransactionId: TransactionId = null): CommitTransactionResult = {
    val __obj = js.Dynamic.literal()
    if (CommitDigest != null) __obj.updateDynamic("CommitDigest")(CommitDigest.asInstanceOf[js.Any])
    if (TransactionId != null) __obj.updateDynamic("TransactionId")(TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTransactionResult]
  }
}


package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitTransactionRequest extends js.Object {
  /**
    * Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest must be passed. QLDB validates CommitDigest and rejects the commit with an error if the digest computed on the client does not match the digest computed by QLDB.
    */
  var CommitDigest: typings.awsSdk.qldbsessionMod.CommitDigest = js.native
  /**
    * Specifies the transaction id of the transaction to commit.
    */
  var TransactionId: typings.awsSdk.qldbsessionMod.TransactionId = js.native
}

object CommitTransactionRequest {
  @scala.inline
  def apply(CommitDigest: CommitDigest, TransactionId: TransactionId): CommitTransactionRequest = {
    val __obj = js.Dynamic.literal(CommitDigest = CommitDigest.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommitTransactionRequest]
  }
}


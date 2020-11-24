package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitTransactionResult extends js.Object {
  
  /**
    * The commit digest of the committed transaction.
    */
  var CommitDigest: js.UndefOr[typings.awsSdk.qldbsessionMod.CommitDigest] = js.native
  
  /**
    * The transaction ID of the committed transaction.
    */
  var TransactionId: js.UndefOr[typings.awsSdk.qldbsessionMod.TransactionId] = js.native
}
object CommitTransactionResult {
  
  @scala.inline
  def apply(): CommitTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTransactionResult]
  }
  
  @scala.inline
  implicit class CommitTransactionResultOps[Self <: CommitTransactionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitDigest(value: CommitDigest): Self = this.set("CommitDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitDigest: Self = this.set("CommitDigest", js.undefined)
    
    @scala.inline
    def setTransactionId(value: TransactionId): Self = this.set("TransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("TransactionId", js.undefined)
  }
}

package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendCommandResult extends js.Object {
  
  /**
    * Contains the details of the aborted transaction.
    */
  var AbortTransaction: js.UndefOr[AbortTransactionResult] = js.native
  
  /**
    * Contains the details of the committed transaction.
    */
  var CommitTransaction: js.UndefOr[CommitTransactionResult] = js.native
  
  /**
    * Contains the details of the ended session.
    */
  var EndSession: js.UndefOr[EndSessionResult] = js.native
  
  /**
    * Contains the details of the executed statement.
    */
  var ExecuteStatement: js.UndefOr[ExecuteStatementResult] = js.native
  
  /**
    * Contains the details of the fetched page.
    */
  var FetchPage: js.UndefOr[FetchPageResult] = js.native
  
  /**
    * Contains the details of the started session that includes a session token. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var StartSession: js.UndefOr[StartSessionResult] = js.native
  
  /**
    * Contains the details of the started transaction.
    */
  var StartTransaction: js.UndefOr[StartTransactionResult] = js.native
}
object SendCommandResult {
  
  @scala.inline
  def apply(): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandResult]
  }
  
  @scala.inline
  implicit class SendCommandResultOps[Self <: SendCommandResult] (val x: Self) extends AnyVal {
    
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
    def setAbortTransaction(value: AbortTransactionResult): Self = this.set("AbortTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortTransaction: Self = this.set("AbortTransaction", js.undefined)
    
    @scala.inline
    def setCommitTransaction(value: CommitTransactionResult): Self = this.set("CommitTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitTransaction: Self = this.set("CommitTransaction", js.undefined)
    
    @scala.inline
    def setEndSession(value: EndSessionResult): Self = this.set("EndSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndSession: Self = this.set("EndSession", js.undefined)
    
    @scala.inline
    def setExecuteStatement(value: ExecuteStatementResult): Self = this.set("ExecuteStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecuteStatement: Self = this.set("ExecuteStatement", js.undefined)
    
    @scala.inline
    def setFetchPage(value: FetchPageResult): Self = this.set("FetchPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchPage: Self = this.set("FetchPage", js.undefined)
    
    @scala.inline
    def setStartSession(value: StartSessionResult): Self = this.set("StartSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartSession: Self = this.set("StartSession", js.undefined)
    
    @scala.inline
    def setStartTransaction(value: StartTransactionResult): Self = this.set("StartTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTransaction: Self = this.set("StartTransaction", js.undefined)
  }
}

package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCommandResult extends StObject {
  
  /**
    * Contains the details of the aborted transaction.
    */
  var AbortTransaction: js.UndefOr[AbortTransactionResult] = js.undefined
  
  /**
    * Contains the details of the committed transaction.
    */
  var CommitTransaction: js.UndefOr[CommitTransactionResult] = js.undefined
  
  /**
    * Contains the details of the ended session.
    */
  var EndSession: js.UndefOr[EndSessionResult] = js.undefined
  
  /**
    * Contains the details of the executed statement.
    */
  var ExecuteStatement: js.UndefOr[ExecuteStatementResult] = js.undefined
  
  /**
    * Contains the details of the fetched page.
    */
  var FetchPage: js.UndefOr[FetchPageResult] = js.undefined
  
  /**
    * Contains the details of the started session that includes a session token. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var StartSession: js.UndefOr[StartSessionResult] = js.undefined
  
  /**
    * Contains the details of the started transaction.
    */
  var StartTransaction: js.UndefOr[StartTransactionResult] = js.undefined
}
object SendCommandResult {
  
  @scala.inline
  def apply(): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandResult]
  }
  
  @scala.inline
  implicit class SendCommandResultMutableBuilder[Self <: SendCommandResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortTransaction(value: AbortTransactionResult): Self = StObject.set(x, "AbortTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortTransactionUndefined: Self = StObject.set(x, "AbortTransaction", js.undefined)
    
    @scala.inline
    def setCommitTransaction(value: CommitTransactionResult): Self = StObject.set(x, "CommitTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTransactionUndefined: Self = StObject.set(x, "CommitTransaction", js.undefined)
    
    @scala.inline
    def setEndSession(value: EndSessionResult): Self = StObject.set(x, "EndSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSessionUndefined: Self = StObject.set(x, "EndSession", js.undefined)
    
    @scala.inline
    def setExecuteStatement(value: ExecuteStatementResult): Self = StObject.set(x, "ExecuteStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteStatementUndefined: Self = StObject.set(x, "ExecuteStatement", js.undefined)
    
    @scala.inline
    def setFetchPage(value: FetchPageResult): Self = StObject.set(x, "FetchPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPageUndefined: Self = StObject.set(x, "FetchPage", js.undefined)
    
    @scala.inline
    def setStartSession(value: StartSessionResult): Self = StObject.set(x, "StartSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSessionUndefined: Self = StObject.set(x, "StartSession", js.undefined)
    
    @scala.inline
    def setStartTransaction(value: StartTransactionResult): Self = StObject.set(x, "StartTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTransactionUndefined: Self = StObject.set(x, "StartTransaction", js.undefined)
  }
}

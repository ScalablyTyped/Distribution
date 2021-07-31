package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCommandRequest extends StObject {
  
  /**
    * Command to abort the current transaction.
    */
  var AbortTransaction: js.UndefOr[AbortTransactionRequest] = js.undefined
  
  /**
    * Command to commit the specified transaction.
    */
  var CommitTransaction: js.UndefOr[CommitTransactionRequest] = js.undefined
  
  /**
    * Command to end the current session.
    */
  var EndSession: js.UndefOr[EndSessionRequest] = js.undefined
  
  /**
    * Command to execute a statement in the specified transaction.
    */
  var ExecuteStatement: js.UndefOr[ExecuteStatementRequest] = js.undefined
  
  /**
    * Command to fetch a page.
    */
  var FetchPage: js.UndefOr[FetchPageRequest] = js.undefined
  
  /**
    * Specifies the session token for the current command. A session token is constant throughout the life of the session. To obtain a session token, run the StartSession command. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var SessionToken: js.UndefOr[typings.awsSdk.qldbsessionMod.SessionToken] = js.undefined
  
  /**
    * Command to start a new session. A session token is obtained as part of the response.
    */
  var StartSession: js.UndefOr[StartSessionRequest] = js.undefined
  
  /**
    * Command to start a new transaction.
    */
  var StartTransaction: js.UndefOr[StartTransactionRequest] = js.undefined
}
object SendCommandRequest {
  
  @scala.inline
  def apply(): SendCommandRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandRequest]
  }
  
  @scala.inline
  implicit class SendCommandRequestMutableBuilder[Self <: SendCommandRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortTransaction(value: AbortTransactionRequest): Self = StObject.set(x, "AbortTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortTransactionUndefined: Self = StObject.set(x, "AbortTransaction", js.undefined)
    
    @scala.inline
    def setCommitTransaction(value: CommitTransactionRequest): Self = StObject.set(x, "CommitTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTransactionUndefined: Self = StObject.set(x, "CommitTransaction", js.undefined)
    
    @scala.inline
    def setEndSession(value: EndSessionRequest): Self = StObject.set(x, "EndSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSessionUndefined: Self = StObject.set(x, "EndSession", js.undefined)
    
    @scala.inline
    def setExecuteStatement(value: ExecuteStatementRequest): Self = StObject.set(x, "ExecuteStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteStatementUndefined: Self = StObject.set(x, "ExecuteStatement", js.undefined)
    
    @scala.inline
    def setFetchPage(value: FetchPageRequest): Self = StObject.set(x, "FetchPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPageUndefined: Self = StObject.set(x, "FetchPage", js.undefined)
    
    @scala.inline
    def setSessionToken(value: SessionToken): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
    
    @scala.inline
    def setStartSession(value: StartSessionRequest): Self = StObject.set(x, "StartSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSessionUndefined: Self = StObject.set(x, "StartSession", js.undefined)
    
    @scala.inline
    def setStartTransaction(value: StartTransactionRequest): Self = StObject.set(x, "StartTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTransactionUndefined: Self = StObject.set(x, "StartTransaction", js.undefined)
  }
}

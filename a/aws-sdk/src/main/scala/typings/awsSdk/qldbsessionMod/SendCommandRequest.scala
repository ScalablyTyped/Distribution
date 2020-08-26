package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCommandRequest extends js.Object {
  /**
    * Command to abort the current transaction.
    */
  var AbortTransaction: js.UndefOr[AbortTransactionRequest] = js.native
  /**
    * Command to commit the specified transaction.
    */
  var CommitTransaction: js.UndefOr[CommitTransactionRequest] = js.native
  /**
    * Command to end the current session.
    */
  var EndSession: js.UndefOr[EndSessionRequest] = js.native
  /**
    * Command to execute a statement in the specified transaction.
    */
  var ExecuteStatement: js.UndefOr[ExecuteStatementRequest] = js.native
  /**
    * Command to fetch a page.
    */
  var FetchPage: js.UndefOr[FetchPageRequest] = js.native
  /**
    * Specifies the session token for the current command. A session token is constant throughout the life of the session. To obtain a session token, run the StartSession command. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var SessionToken: js.UndefOr[typings.awsSdk.qldbsessionMod.SessionToken] = js.native
  /**
    * Command to start a new session. A session token is obtained as part of the response.
    */
  var StartSession: js.UndefOr[StartSessionRequest] = js.native
  /**
    * Command to start a new transaction.
    */
  var StartTransaction: js.UndefOr[StartTransactionRequest] = js.native
}

object SendCommandRequest {
  @scala.inline
  def apply(): SendCommandRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandRequest]
  }
  @scala.inline
  implicit class SendCommandRequestOps[Self <: SendCommandRequest] (val x: Self) extends AnyVal {
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
    def setAbortTransaction(value: AbortTransactionRequest): Self = this.set("AbortTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortTransaction: Self = this.set("AbortTransaction", js.undefined)
    @scala.inline
    def setCommitTransaction(value: CommitTransactionRequest): Self = this.set("CommitTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitTransaction: Self = this.set("CommitTransaction", js.undefined)
    @scala.inline
    def setEndSession(value: EndSessionRequest): Self = this.set("EndSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndSession: Self = this.set("EndSession", js.undefined)
    @scala.inline
    def setExecuteStatement(value: ExecuteStatementRequest): Self = this.set("ExecuteStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecuteStatement: Self = this.set("ExecuteStatement", js.undefined)
    @scala.inline
    def setFetchPage(value: FetchPageRequest): Self = this.set("FetchPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPage: Self = this.set("FetchPage", js.undefined)
    @scala.inline
    def setSessionToken(value: SessionToken): Self = this.set("SessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("SessionToken", js.undefined)
    @scala.inline
    def setStartSession(value: StartSessionRequest): Self = this.set("StartSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartSession: Self = this.set("StartSession", js.undefined)
    @scala.inline
    def setStartTransaction(value: StartTransactionRequest): Self = this.set("StartTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTransaction: Self = this.set("StartTransaction", js.undefined)
  }
  
}


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
  def apply(
    AbortTransaction: AbortTransactionRequest = null,
    CommitTransaction: CommitTransactionRequest = null,
    EndSession: EndSessionRequest = null,
    ExecuteStatement: ExecuteStatementRequest = null,
    FetchPage: FetchPageRequest = null,
    SessionToken: SessionToken = null,
    StartSession: StartSessionRequest = null,
    StartTransaction: StartTransactionRequest = null
  ): SendCommandRequest = {
    val __obj = js.Dynamic.literal()
    if (AbortTransaction != null) __obj.updateDynamic("AbortTransaction")(AbortTransaction.asInstanceOf[js.Any])
    if (CommitTransaction != null) __obj.updateDynamic("CommitTransaction")(CommitTransaction.asInstanceOf[js.Any])
    if (EndSession != null) __obj.updateDynamic("EndSession")(EndSession.asInstanceOf[js.Any])
    if (ExecuteStatement != null) __obj.updateDynamic("ExecuteStatement")(ExecuteStatement.asInstanceOf[js.Any])
    if (FetchPage != null) __obj.updateDynamic("FetchPage")(FetchPage.asInstanceOf[js.Any])
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken.asInstanceOf[js.Any])
    if (StartSession != null) __obj.updateDynamic("StartSession")(StartSession.asInstanceOf[js.Any])
    if (StartTransaction != null) __obj.updateDynamic("StartTransaction")(StartTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCommandRequest]
  }
}


package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginTransactionResponse extends js.Object {
  /**
    * The transaction ID of the transaction started by the call.
    */
  var transactionId: js.UndefOr[Id] = js.native
}

object BeginTransactionResponse {
  @scala.inline
  def apply(transactionId: Id = null): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginTransactionResponse]
  }
}


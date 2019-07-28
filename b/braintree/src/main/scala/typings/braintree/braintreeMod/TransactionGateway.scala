package typings.braintree.braintreeMod

import typings.braintree.Anon_AmountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionGateway extends js.Object {
  def cancelRelease(transactionId: String): js.Promise[Unit] = js.native
  def cloneTransaction(transactionId: String, options: Anon_AmountOptions): js.Promise[Unit] = js.native
  def find(transactionId: String): js.Promise[Transaction] = js.native
  def holdInEscrow(transactionId: String): js.Promise[Transaction] = js.native
  def refund(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def refund(transactionId: String, amount: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def releaseFromEscrow(transactionId: String): js.Promise[Transaction] = js.native
  def sale(request: TransactionRequest): js.Promise[ValidatedResponse[Transaction]] = js.native
  def search(searchFn: js.Any): js.Promise[js.Array[Transaction]] = js.native
  def submitForPartialSettlement(authorizedTransactionId: String, amount: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def submitForSettlement(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def submitForSettlement(transactionId: String, amount: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def void(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
}


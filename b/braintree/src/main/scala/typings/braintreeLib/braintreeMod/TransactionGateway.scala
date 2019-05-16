package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionGateway extends js.Object {
  def cancelRelease(transactionId: java.lang.String): js.Promise[scala.Unit] = js.native
  def cloneTransaction(transactionId: java.lang.String, options: braintreeLib.Anon_AmountOptions): js.Promise[scala.Unit] = js.native
  def find(transactionId: java.lang.String): js.Promise[Transaction] = js.native
  def holdInEscrow(transactionId: java.lang.String): js.Promise[Transaction] = js.native
  def refund(transactionId: java.lang.String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def refund(transactionId: java.lang.String, amount: java.lang.String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def releaseFromEscrow(transactionId: java.lang.String): js.Promise[Transaction] = js.native
  def sale(request: TransactionRequest): js.Promise[ValidatedResponse[Transaction]] = js.native
  def search(searchFn: js.Any): js.Promise[js.Array[Transaction]] = js.native
  def submitForPartialSettlement(authorizedTransactionId: java.lang.String, amount: java.lang.String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def submitForSettlement(transactionId: java.lang.String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def submitForSettlement(transactionId: java.lang.String, amount: java.lang.String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def void(transactionId: java.lang.String): js.Promise[ValidatedResponse[Transaction]] = js.native
}


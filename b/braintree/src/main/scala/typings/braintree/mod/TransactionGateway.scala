package typings.braintree.mod

import typings.braintree.anon.Options
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionGateway extends StObject {
  
  def adjustAuthorization(transactionID: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def adjustAuthorization(transactionID: String, amount: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  
  def cancelRelease(transactionId: String): js.Promise[Unit] = js.native
  
  def cloneTransaction(transactionId: String, options: Options): js.Promise[Unit] = js.native
  
  def find(transactionId: String): js.Promise[Transaction] = js.native
  
  def holdInEscrow(transactionId: String): js.Promise[Transaction] = js.native
  
  def refund(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def refund(transactionId: String, amount: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  
  def releaseFromEscrow(transactionId: String): js.Promise[Transaction] = js.native
  
  def sale(request: TransactionRequest): js.Promise[ValidatedResponse[Transaction]] = js.native
  
  def search(searchFn: TransactionSearchFn): Readable = js.native
  
  def submitForPartialSettlement(authorizedTransactionId: String, amount: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  
  def submitForSettlement(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def submitForSettlement(transactionId: String, amount: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  
  def void(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
}

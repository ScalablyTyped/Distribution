package typings.bitcoinComputerLib.mod

import typings.bitcoinComputerLib.anon.PartialSelectUtxos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wallet extends StObject {
  
  def address: Any = js.native
  
  def broadcast(transaction: Tx): js.Promise[String] = js.native
  
  def chain: Chain = js.native
  
  def derive(): Wallet = js.native
  def derive(subpath: String): Wallet = js.native
  
  /**
    * Given a transaction with inputs and outputs containing data, this function
    * adds extra inputs to fund the transaction and possibly an change output.
    * The included and excluded utxos are used to select the inputs.
    */
  def fund(transaction: Tx): js.Promise[Unit] = js.native
  def fund(transaction: Tx, selectUtxos: PartialSelectUtxos): js.Promise[Unit] = js.native
  
  def fundTx(tx: Any): js.Promise[Unit] = js.native
  def fundTx(tx: Any, selectUtxos: PartialSelectUtxos): js.Promise[Unit] = js.native
  
  def getBalance(): js.Promise[Double] = js.native
  
  def getUtxos(): js.Promise[js.Array[Any]] = js.native
  
  def getUtxosByEffectiveValue(amount: Double): js.Promise[js.Array[Any]] = js.native
  def getUtxosByEffectiveValue(amount: Double, param1: PartialSelectUtxos): js.Promise[js.Array[Any]] = js.native
  
  def hdPrivateKey: Any = js.native
  
  def mnemonic: Any = js.native
  
  def network: Network = js.native
  
  def passphrase: String = js.native
  
  def path: String = js.native
  
  def privateKey: Any = js.native
  
  def publicKey: Any = js.native
  
  val restClient: RestClient = js.native
  
  def send(amount: Double, address: String): js.Promise[String] = js.native
  
  def sign(transaction: Tx): Unit = js.native
  
  def signTx(tx: Any): Unit = js.native
  
  def url: String = js.native
}

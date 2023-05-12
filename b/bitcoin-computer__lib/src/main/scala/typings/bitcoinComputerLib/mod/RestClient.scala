package typings.bitcoinComputerLib.mod

import typings.bitcoinComputerLib.anon.PartialQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestClient extends StObject {
  
  /* private */ var bcn: Any = js.native
  
  def broadcast(txJSON: Any): js.Promise[String] = js.native
  
  val chain: Chain = js.native
  
  def getBalance(address: String): js.Promise[Double] = js.native
  
  def getRawTxs(txIds: js.Array[String]): js.Promise[js.Array[String]] = js.native
  
  def getTransactions(txIds: js.Array[String]): js.Promise[js.Array[Any]] = js.native
  
  def getUtxosByAddress(address: String): js.Promise[js.Array[Any]] = js.native
  
  def idsToRevs(outIds: js.Array[String]): js.Promise[js.Array[String]] = js.native
  
  val mnemonic: Any = js.native
  
  val network: Network = js.native
  
  val passphrase: String = js.native
  
  val path: String = js.native
  
  def privateKey: Any = js.native
  
  def query(param0: PartialQuery): js.Promise[js.Array[String]] = js.native
  
  def rpc(method: String, params: String): js.Promise[Any] = js.native
  
  def url: String = js.native
}

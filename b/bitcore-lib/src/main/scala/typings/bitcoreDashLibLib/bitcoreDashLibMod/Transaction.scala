package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Transaction")
@js.native
class Transaction () extends js.Object {
  def this(serialized: js.Any) = this()
  val hash: java.lang.String = js.native
  val id: java.lang.String = js.native
  var inputs: js.Array[bitcoreDashLibLib.bitcoreDashLibMod.TransactionNs.Input] = js.native
  var nid: java.lang.String = js.native
  var outputs: js.Array[bitcoreDashLibLib.bitcoreDashLibMod.TransactionNs.Output] = js.native
  def addData(value: nodeLib.Buffer): this.type = js.native
  def addInput(input: bitcoreDashLibLib.bitcoreDashLibMod.TransactionNs.Input): this.type = js.native
  def addOutput(output: bitcoreDashLibLib.bitcoreDashLibMod.TransactionNs.Output): this.type = js.native
  def applySignature(sig: bitcoreDashLibLib.bitcoreDashLibMod.cryptoNs.Signature): this.type = js.native
  def change(address: Address): this.type = js.native
  def change(address: java.lang.String): this.type = js.native
  def enableRBF(): this.type = js.native
  def fee(amount: scala.Double): this.type = js.native
  def feePerKb(amount: scala.Double): this.type = js.native
  def from(utxos: js.Array[bitcoreDashLibLib.bitcoreDashLibMod.TransactionNs.UnspentOutput]): this.type = js.native
  def getChangeOutput(): bitcoreDashLibLib.bitcoreDashLibMod.TransactionNs.Output | scala.Null = js.native
  def getFee(): scala.Double = js.native
  def getLockTime(): stdLib.Date | scala.Double = js.native
  def hasWitnesses(): scala.Boolean = js.native
  def inspect(): java.lang.String = js.native
  def isCoinbase(): scala.Boolean = js.native
  def isRBF(): scala.Boolean = js.native
  def lockUntilBlockHeight(height: scala.Double): this.type = js.native
  def lockUntilDate(time: scala.Double): this.type = js.native
  def lockUntilDate(time: stdLib.Date): this.type = js.native
  def serialize(): java.lang.String = js.native
  def sign(privateKey: PrivateKey): this.type = js.native
  def sign(privateKey: java.lang.String): this.type = js.native
  def to(address: Address, amount: scala.Double): this.type = js.native
  def to(address: java.lang.String, amount: scala.Double): this.type = js.native
  def to(address: js.Array[Address], amount: scala.Double): this.type = js.native
  def verify(): java.lang.String | scala.Boolean = js.native
}


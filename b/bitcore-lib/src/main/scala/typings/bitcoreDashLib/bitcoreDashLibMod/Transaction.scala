package typings.bitcoreDashLib.bitcoreDashLibMod

import typings.bitcoreDashLib.bitcoreDashLibMod.TransactionNs.Input
import typings.bitcoreDashLib.bitcoreDashLibMod.TransactionNs.Output
import typings.bitcoreDashLib.bitcoreDashLibMod.TransactionNs.UnspentOutput
import typings.bitcoreDashLib.bitcoreDashLibMod.cryptoNs.Signature
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Transaction")
@js.native
class Transaction () extends js.Object {
  def this(serialized: js.Any) = this()
  val hash: String = js.native
  val id: String = js.native
  var inputs: js.Array[Input] = js.native
  var nid: String = js.native
  var outputs: js.Array[Output] = js.native
  def addData(value: Buffer): this.type = js.native
  def addInput(input: Input): this.type = js.native
  def addOutput(output: Output): this.type = js.native
  def applySignature(sig: Signature): this.type = js.native
  def change(address: String): this.type = js.native
  def change(address: Address): this.type = js.native
  def enableRBF(): this.type = js.native
  def fee(amount: Double): this.type = js.native
  def feePerKb(amount: Double): this.type = js.native
  def from(utxos: js.Array[UnspentOutput]): this.type = js.native
  def getChangeOutput(): Output | Null = js.native
  def getFee(): Double = js.native
  def getLockTime(): Date | Double = js.native
  def hasWitnesses(): Boolean = js.native
  def inspect(): String = js.native
  def isCoinbase(): Boolean = js.native
  def isRBF(): Boolean = js.native
  def lockUntilBlockHeight(height: Double): this.type = js.native
  def lockUntilDate(time: Double): this.type = js.native
  def lockUntilDate(time: Date): this.type = js.native
  def serialize(): String = js.native
  def sign(privateKey: String): this.type = js.native
  def sign(privateKey: PrivateKey): this.type = js.native
  def to(address: String, amount: Double): this.type = js.native
  def to(address: js.Array[Address], amount: Double): this.type = js.native
  def to(address: Address, amount: Double): this.type = js.native
  def verify(): String | Boolean = js.native
}


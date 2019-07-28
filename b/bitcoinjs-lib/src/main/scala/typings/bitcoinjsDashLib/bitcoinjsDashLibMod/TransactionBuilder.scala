package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "TransactionBuilder")
@js.native
class TransactionBuilder () extends js.Object {
  def this(network: Network) = this()
  def this(network: Network, maximumFeeRate: Double) = this()
  def addInput(txhash: String, vout: Double): Double = js.native
  def addInput(txhash: String, vout: Double, sequence: Double): Double = js.native
  def addInput(txhash: String, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
  def addInput(txhash: Transaction, vout: Double): Double = js.native
  def addInput(txhash: Transaction, vout: Double, sequence: Double): Double = js.native
  def addInput(txhash: Transaction, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
  def addInput(txhash: Buffer, vout: Double): Double = js.native
  def addInput(txhash: Buffer, vout: Double, sequence: Double): Double = js.native
  def addInput(txhash: Buffer, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
  def addOutput(scriptPubKey: String, value: Double): Double = js.native
  def addOutput(scriptPubKey: Buffer, value: Double): Double = js.native
  def build(): Transaction = js.native
  def buildIncomplete(): Transaction = js.native
  def setLockTime(locktime: Double): Unit = js.native
  def setVersion(version: Double): Unit = js.native
  /** @since 3.0.0 */
  def sign(vin: Double, keyPair: ECPair): Unit = js.native
  def sign(vin: Double, keyPair: ECPair, redeemScript: Buffer): Unit = js.native
  def sign(vin: Double, keyPair: ECPair, redeemScript: Buffer, hashType: Double): Unit = js.native
  def sign(vin: Double, keyPair: ECPair, redeemScript: Buffer, hashType: Double, witnessValue: Double): Unit = js.native
  def sign(
    vin: Double,
    keyPair: ECPair,
    redeemScript: Buffer,
    hashType: Double,
    witnessValue: Double,
    witnessScript: Buffer
  ): Unit = js.native
}

/* static members */
@JSImport("bitcoinjs-lib", "TransactionBuilder")
@js.native
object TransactionBuilder extends js.Object {
  def fromTransaction(transaction: Transaction, network: Network): TransactionBuilder = js.native
}


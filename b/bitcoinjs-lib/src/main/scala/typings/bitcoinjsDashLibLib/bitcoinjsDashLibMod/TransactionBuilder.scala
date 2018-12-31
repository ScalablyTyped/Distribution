package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "TransactionBuilder")
@js.native
class TransactionBuilder () extends js.Object {
  def this(network: Network) = this()
  def this(network: Network, maximumFeeRate: scala.Double) = this()
  def addInput(txhash: Transaction, vout: scala.Double): scala.Double = js.native
  def addInput(txhash: Transaction, vout: scala.Double, sequence: scala.Double): scala.Double = js.native
  def addInput(txhash: Transaction, vout: scala.Double, sequence: scala.Double, prevOutScript: nodeLib.Buffer): scala.Double = js.native
  def addInput(txhash: java.lang.String, vout: scala.Double): scala.Double = js.native
  def addInput(txhash: java.lang.String, vout: scala.Double, sequence: scala.Double): scala.Double = js.native
  def addInput(
    txhash: java.lang.String,
    vout: scala.Double,
    sequence: scala.Double,
    prevOutScript: nodeLib.Buffer
  ): scala.Double = js.native
  def addInput(txhash: nodeLib.Buffer, vout: scala.Double): scala.Double = js.native
  def addInput(txhash: nodeLib.Buffer, vout: scala.Double, sequence: scala.Double): scala.Double = js.native
  def addInput(txhash: nodeLib.Buffer, vout: scala.Double, sequence: scala.Double, prevOutScript: nodeLib.Buffer): scala.Double = js.native
  def addOutput(scriptPubKey: java.lang.String, value: scala.Double): scala.Double = js.native
  def addOutput(scriptPubKey: nodeLib.Buffer, value: scala.Double): scala.Double = js.native
  def build(): Transaction = js.native
  def buildIncomplete(): Transaction = js.native
  def setLockTime(locktime: scala.Double): scala.Unit = js.native
  def setVersion(version: scala.Double): scala.Unit = js.native
  /** @since 3.0.0 */
  def sign(vin: scala.Double, keyPair: ECPair): scala.Unit = js.native
  def sign(vin: scala.Double, keyPair: ECPair, redeemScript: nodeLib.Buffer): scala.Unit = js.native
  def sign(vin: scala.Double, keyPair: ECPair, redeemScript: nodeLib.Buffer, hashType: scala.Double): scala.Unit = js.native
  def sign(
    vin: scala.Double,
    keyPair: ECPair,
    redeemScript: nodeLib.Buffer,
    hashType: scala.Double,
    witnessValue: scala.Double
  ): scala.Unit = js.native
  def sign(
    vin: scala.Double,
    keyPair: ECPair,
    redeemScript: nodeLib.Buffer,
    hashType: scala.Double,
    witnessValue: scala.Double,
    witnessScript: nodeLib.Buffer
  ): scala.Unit = js.native
}

@JSImport("bitcoinjs-lib", "TransactionBuilder")
@js.native
object TransactionBuilder extends js.Object {
  def fromTransaction(
    transaction: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Transaction,
    network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network
  ): bitcoinjsDashLibLib.bitcoinjsDashLibMod.TransactionBuilder = js.native
}


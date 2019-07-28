package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "Transaction")
@js.native
class Transaction () extends js.Object {
  var ins: js.Array[In] = js.native
  var locktime: Double = js.native
  var outs: js.Array[Out] = js.native
  var version: Double = js.native
  def addInput(hash: Buffer, index: Double): Double = js.native
  def addInput(hash: Buffer, index: Double, sequence: Double): Double = js.native
  def addInput(hash: Buffer, index: Double, sequence: Double, scriptSig: Buffer): Double = js.native
  def addOutput(scriptPubKey: String, value: Double): Double = js.native
  def addOutput(scriptPubKey: Buffer, value: Double): Double = js.native
  def byteLength(): Double = js.native
  def getHash(): Buffer = js.native
  def getId(): String = js.native
  /** @since 3.0.0 */
  def hasWitnesses(): Boolean = js.native
  def hashForSignature(inIndex: Double, prevOutScript: Buffer, hashType: Double): Buffer = js.native
  /** @since 3.0.0 */
  def hashForWitnessV0(inIndex: Double, prevOutScript: Buffer, value: Double, hashType: Double): Buffer = js.native
  def isCoinbase(): Boolean = js.native
  def setInputScript(index: Double, scriptSig: Buffer): Unit = js.native
  /** @since 3.0.0 */
  def setWitness(index: Double, witness: js.Any, args: js.Any*): Unit = js.native
  /** @since 3.0.0 */
  def toBuffer(): Buffer = js.native
  def toBuffer(buffer: Buffer): Buffer = js.native
  def toBuffer(buffer: Buffer, initialOffset: Double): Buffer = js.native
  def toHex(): String = js.native
  /** @since 3.1.0 */
  def virtualSize(): Double = js.native
  /** @since 3.1.0 */
  def weight(): Double = js.native
}

/* static members */
@JSImport("bitcoinjs-lib", "Transaction")
@js.native
object Transaction extends js.Object {
  var ADVANCED_TRANSACTION_FLAG: Double = js.native
  var ADVANCED_TRANSACTION_MARKER: Double = js.native
  var DEFAULT_SEQUENCE: Double = js.native
  var SIGHASH_ALL: Double = js.native
  var SIGHASH_ANYONECANPAY: Double = js.native
  var SIGHASH_NONE: Double = js.native
  var SIGHASH_SINGLE: Double = js.native
  def fromBuffer(buffer: Buffer): Transaction = js.native
  def fromBuffer(buffer: Buffer, __noStrict: Boolean): Transaction = js.native
  def fromHex(hex: String): Transaction = js.native
  def isCoinbaseHash(buffer: Buffer): Boolean = js.native
}


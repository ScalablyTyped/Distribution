package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "Transaction")
@js.native
class Transaction () extends js.Object {
  var ins: js.Array[In] = js.native
  var locktime: scala.Double = js.native
  var outs: js.Array[Out] = js.native
  var version: scala.Double = js.native
  def addInput(hash: nodeLib.Buffer, index: scala.Double): scala.Double = js.native
  def addInput(hash: nodeLib.Buffer, index: scala.Double, sequence: scala.Double): scala.Double = js.native
  def addInput(hash: nodeLib.Buffer, index: scala.Double, sequence: scala.Double, scriptSig: nodeLib.Buffer): scala.Double = js.native
  def addOutput(scriptPubKey: java.lang.String, value: scala.Double): scala.Double = js.native
  def addOutput(scriptPubKey: nodeLib.Buffer, value: scala.Double): scala.Double = js.native
  def byteLength(): scala.Double = js.native
  def getHash(): nodeLib.Buffer = js.native
  def getId(): java.lang.String = js.native
  /** @since 3.0.0 */
  def hasWitnesses(): scala.Boolean = js.native
  def hashForSignature(inIndex: scala.Double, prevOutScript: nodeLib.Buffer, hashType: scala.Double): nodeLib.Buffer = js.native
  /** @since 3.0.0 */
  def hashForWitnessV0(inIndex: scala.Double, prevOutScript: nodeLib.Buffer, value: scala.Double, hashType: scala.Double): nodeLib.Buffer = js.native
  def isCoinbase(): scala.Boolean = js.native
  def setInputScript(index: scala.Double, scriptSig: nodeLib.Buffer): scala.Unit = js.native
  /** @since 3.0.0 */
  def setWitness(index: scala.Double, witness: js.Any, args: js.Any*): scala.Unit = js.native
  /** @since 3.0.0 */
  def toBuffer(): nodeLib.Buffer = js.native
  def toBuffer(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def toBuffer(buffer: nodeLib.Buffer, initialOffset: scala.Double): nodeLib.Buffer = js.native
  def toHex(): java.lang.String = js.native
  /** @since 3.1.0 */
  def virtualSize(): scala.Double = js.native
  /** @since 3.1.0 */
  def weight(): scala.Double = js.native
}

@JSImport("bitcoinjs-lib", "Transaction")
@js.native
object Transaction extends js.Object {
  var ADVANCED_TRANSACTION_FLAG: scala.Double = js.native
  var ADVANCED_TRANSACTION_MARKER: scala.Double = js.native
  var DEFAULT_SEQUENCE: scala.Double = js.native
  var SIGHASH_ALL: scala.Double = js.native
  var SIGHASH_ANYONECANPAY: scala.Double = js.native
  var SIGHASH_NONE: scala.Double = js.native
  var SIGHASH_SINGLE: scala.Double = js.native
  def fromBuffer(buffer: nodeLib.Buffer): bitcoinjsDashLibLib.bitcoinjsDashLibMod.Transaction = js.native
  def fromBuffer(buffer: nodeLib.Buffer, __noStrict: scala.Boolean): bitcoinjsDashLibLib.bitcoinjsDashLibMod.Transaction = js.native
  def fromHex(hex: java.lang.String): bitcoinjsDashLibLib.bitcoinjsDashLibMod.Transaction = js.native
  def isCoinbaseHash(buffer: nodeLib.Buffer): scala.Boolean = js.native
}


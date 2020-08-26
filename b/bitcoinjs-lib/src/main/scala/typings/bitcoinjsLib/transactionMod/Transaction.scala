package typings.bitcoinjsLib.transactionMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/transaction", "Transaction")
@js.native
class Transaction () extends js.Object {
  var __toBuffer: js.Any = js.native
  var ins: js.Array[Input] = js.native
  var locktime: Double = js.native
  var outs: js.Array[Output] = js.native
  var version: Double = js.native
  def addInput(hash: Buffer, index: Double): Double = js.native
  def addInput(hash: Buffer, index: Double, sequence: js.UndefOr[scala.Nothing], scriptSig: Buffer): Double = js.native
  def addInput(hash: Buffer, index: Double, sequence: Double): Double = js.native
  def addInput(hash: Buffer, index: Double, sequence: Double, scriptSig: Buffer): Double = js.native
  def addOutput(scriptPubKey: Buffer, value: Double): Double = js.native
  def byteLength(): Double = js.native
  def byteLength(_ALLOW_WITNESS: Boolean): Double = js.native
  def getHash(): Buffer = js.native
  def getHash(forWitness: Boolean): Buffer = js.native
  def getId(): String = js.native
  def hasWitnesses(): Boolean = js.native
  /**
    * Hash transaction for signing a specific input.
    *
    * Bitcoin uses a different hash for each signed transaction input.
    * This method copies the transaction, makes the necessary changes based on the
    * hashType, and then hashes the result.
    * This hash can then be used to sign the provided transaction input.
    */
  def hashForSignature(inIndex: Double, prevOutScript: Buffer, hashType: Double): Buffer = js.native
  def hashForWitnessV0(inIndex: Double, prevOutScript: Buffer, value: Double, hashType: Double): Buffer = js.native
  def isCoinbase(): Boolean = js.native
  def setInputScript(index: Double, scriptSig: Buffer): Unit = js.native
  def setWitness(index: Double, witness: js.Array[Buffer]): Unit = js.native
  def toBuffer(): Buffer = js.native
  def toBuffer(buffer: js.UndefOr[scala.Nothing], initialOffset: Double): Buffer = js.native
  def toBuffer(buffer: Buffer): Buffer = js.native
  def toBuffer(buffer: Buffer, initialOffset: Double): Buffer = js.native
  def toHex(): String = js.native
  def virtualSize(): Double = js.native
  def weight(): Double = js.native
}

/* static members */
@JSImport("bitcoinjs-lib/types/transaction", "Transaction")
@js.native
object Transaction extends js.Object {
  val ADVANCED_TRANSACTION_FLAG: /* 1 */ Double = js.native
  val ADVANCED_TRANSACTION_MARKER: /* 0 */ Double = js.native
  val DEFAULT_SEQUENCE: /* 4294967295.0 */ Double = js.native
  val SIGHASH_ALL: /* 1 */ Double = js.native
  val SIGHASH_ANYONECANPAY: /* 128 */ Double = js.native
  val SIGHASH_NONE: /* 2 */ Double = js.native
  val SIGHASH_SINGLE: /* 3 */ Double = js.native
  def fromBuffer(buffer: Buffer): Transaction = js.native
  def fromBuffer(buffer: Buffer, _NO_STRICT: Boolean): Transaction = js.native
  def fromHex(hex: String): Transaction = js.native
  def isCoinbaseHash(buffer: Buffer): Boolean = js.native
}


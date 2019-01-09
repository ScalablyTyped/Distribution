package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "script")
@js.native
object scriptNs extends js.Object {
  val multisig: bitcoinjsDashLibLib.Anon_Input = js.native
  val nullData: bitcoinjsDashLibLib.Anon_OutputAnonCheck = js.native
  val pubKey: bitcoinjsDashLibLib.Anon_InputOutput = js.native
  val pubKeyHash: bitcoinjsDashLibLib.Anon_InputOutput = js.native
  val scriptHash: bitcoinjsDashLibLib.Anon_InputOutputAnonAllowIncomplete = js.native
  val witnessCommitment: bitcoinjsDashLibLib.Anon_Output = js.native
  val witnessPubKeyHash: bitcoinjsDashLibLib.Anon_InputOutput = js.native
  val witnessScriptHash: bitcoinjsDashLibLib.Anon_InputOutputAnonAllowIncomplete = js.native
  def classifyInput(script: js.Array[nodeLib.Buffer | scala.Double]): bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.scripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.multisig | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkey | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nonstandard = js.native
  def classifyInput(script: js.Array[nodeLib.Buffer | scala.Double], allowIncomplete: scala.Boolean): bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.scripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.multisig | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkey | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nonstandard = js.native
  def classifyInput(script: nodeLib.Buffer): bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.scripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.multisig | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkey | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nonstandard = js.native
  def classifyInput(script: nodeLib.Buffer, allowIncomplete: scala.Boolean): bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.scripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.multisig | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkey | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nonstandard = js.native
  def classifyOutput(script: js.Array[nodeLib.Buffer | scala.Double]): bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnesspubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnessscripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.scripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.multisig | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkey | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnesscommitment | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nulldata | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nonstandard = js.native
  def classifyOutput(script: nodeLib.Buffer): bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnesspubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnessscripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.scripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.multisig | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.pubkey | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnesscommitment | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nulldata | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nonstandard = js.native
  def classifyWitness(script: js.Array[nodeLib.Buffer | scala.Double], allowIncomplete: scala.Boolean): bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnesspubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnessscripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nonstandard = js.native
  def classifyWitness(script: nodeLib.Buffer, allowIncomplete: scala.Boolean): bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnesspubkeyhash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.witnessscripthash | bitcoinjsDashLibLib.bitcoinjsDashLibLibStrings.nonstandard = js.native
  def compile(chunks: js.Array[nodeLib.Buffer | scala.Double]): nodeLib.Buffer = js.native
  def decompile(buffer: nodeLib.Buffer): js.Array[nodeLib.Buffer | scala.Double] = js.native
  def fromASM(asm: java.lang.String): nodeLib.Buffer = js.native
  def isCanonicalPubKey(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def isCanonicalScriptSignature(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def isDefinedHashType(hashType: js.Any): scala.Boolean = js.native
  def isPushOnly(value: js.Any): scala.Boolean = js.native
  def toASM(chunks: js.Array[nodeLib.Buffer | scala.Double]): java.lang.String = js.native
  def toASM(chunks: nodeLib.Buffer): java.lang.String = js.native
  def toStack(chunks: js.Array[nodeLib.Buffer | scala.Double]): js.Array[nodeLib.Buffer] = js.native
  def toStack(chunks: nodeLib.Buffer): js.Array[nodeLib.Buffer] = js.native
  @JSName("number")
  @js.native
  object numberNs extends js.Object {
    def decode(buffer: nodeLib.Buffer, maxLength: scala.Double, minimal: scala.Boolean): scala.Double = js.native
    def encode(number: scala.Double): nodeLib.Buffer = js.native
  }
  
  @JSName("signature")
  @js.native
  object signatureNs extends js.Object {
    def decode(buffer: nodeLib.Buffer): bitcoinjsDashLibLib.Anon_HashType = js.native
    def encode(signature: nodeLib.Buffer, hashType: scala.Double): nodeLib.Buffer = js.native
  }
  
}


package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.bitcoinjsDashLib.Anon_AllowIncomplete
import typings.bitcoinjsDashLib.Anon_Buffer
import typings.bitcoinjsDashLib.Anon_Check
import typings.bitcoinjsDashLib.Anon_HashType
import typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.nonstandard
import typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.nulldata
import typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.pubkey
import typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.pubkeyhash
import typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.scripthash
import typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.witnesscommitment
import typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.witnesspubkeyhash
import typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.witnessscripthash
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "script")
@js.native
object scriptNs extends js.Object {
  def classifyInput(script: js.Array[Buffer | Double]): pubkeyhash | scripthash | typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.multisig | pubkey | nonstandard = js.native
  def classifyInput(script: js.Array[Buffer | Double], allowIncomplete: Boolean): pubkeyhash | scripthash | typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.multisig | pubkey | nonstandard = js.native
  def classifyInput(script: Buffer): pubkeyhash | scripthash | typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.multisig | pubkey | nonstandard = js.native
  def classifyInput(script: Buffer, allowIncomplete: Boolean): pubkeyhash | scripthash | typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.multisig | pubkey | nonstandard = js.native
  def classifyOutput(script: js.Array[Buffer | Double]): witnesspubkeyhash | witnessscripthash | pubkeyhash | scripthash | typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.multisig | pubkey | witnesscommitment | nulldata | nonstandard = js.native
  def classifyOutput(script: Buffer): witnesspubkeyhash | witnessscripthash | pubkeyhash | scripthash | typings.bitcoinjsDashLib.bitcoinjsDashLibStrings.multisig | pubkey | witnesscommitment | nulldata | nonstandard = js.native
  def classifyWitness(script: js.Array[Buffer | Double], allowIncomplete: Boolean): witnesspubkeyhash | witnessscripthash | nonstandard = js.native
  def classifyWitness(script: Buffer, allowIncomplete: Boolean): witnesspubkeyhash | witnessscripthash | nonstandard = js.native
  def compile(chunks: js.Array[Buffer | Double]): Buffer = js.native
  def decompile(buffer: Buffer): js.Array[Buffer | Double] = js.native
  def fromASM(asm: String): Buffer = js.native
  def isCanonicalPubKey(buffer: Buffer): Boolean = js.native
  def isCanonicalScriptSignature(buffer: Buffer): Boolean = js.native
  def isDefinedHashType(hashType: js.Any): Boolean = js.native
  def isPushOnly(value: js.Any): Boolean = js.native
  def toASM(chunks: js.Array[Buffer | Double]): String = js.native
  def toASM(chunks: Buffer): String = js.native
  def toStack(chunks: js.Array[Buffer | Double]): js.Array[Buffer] = js.native
  def toStack(chunks: Buffer): js.Array[Buffer] = js.native
  @js.native
  object multisig extends js.Object {
    var input: Anon_AllowIncomplete = js.native
    var output: Anon_AllowIncomplete = js.native
  }
  
  @js.native
  object nullData extends js.Object {
    var output: Anon_Check = js.native
  }
  
  @JSName("number")
  @js.native
  object numberNs extends js.Object {
    def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = js.native
    def encode(number: Double): Buffer = js.native
  }
  
  @js.native
  object pubKey extends js.Object {
    var input: Anon_Check = js.native
    var output: Anon_Check = js.native
  }
  
  @js.native
  object pubKeyHash extends js.Object {
    var input: Anon_Check = js.native
    var output: Anon_Check = js.native
  }
  
  @js.native
  object scriptHash extends js.Object {
    var input: Anon_AllowIncomplete = js.native
    var output: Anon_Check = js.native
  }
  
  @JSName("signature")
  @js.native
  object signatureNs extends js.Object {
    def decode(buffer: Buffer): Anon_HashType = js.native
    def encode(signature: Buffer, hashType: Double): Buffer = js.native
  }
  
  @js.native
  object witnessCommitment extends js.Object {
    var output: Anon_Buffer = js.native
  }
  
  @js.native
  object witnessPubKeyHash extends js.Object {
    var input: Anon_Check = js.native
    var output: Anon_Check = js.native
  }
  
  @js.native
  object witnessScriptHash extends js.Object {
    var input: Anon_AllowIncomplete = js.native
    var output: Anon_Check = js.native
  }
  
}


package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Script")
@js.native
object ScriptNs extends js.Object {
  def buildDataOut(data: java.lang.String): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildDataOut(data: java.lang.String, encoding: java.lang.String): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildDataOut(data: nodeLib.Buffer): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildDataOut(data: nodeLib.Buffer, encoding: java.lang.String): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildMultisigIn(
    pubkeys: js.Array[bitcoreDashLibLib.bitcoreDashLibMod.PublicKey],
    threshold: scala.Double,
    signatures: js.Array[nodeLib.Buffer],
    opts: js.Object
  ): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildMultisigOut(
    publicKeys: js.Array[bitcoreDashLibLib.bitcoreDashLibMod.PublicKey],
    threshold: scala.Double,
    opts: js.Object
  ): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildP2SHMultisigIn(
    pubkeys: js.Array[bitcoreDashLibLib.bitcoreDashLibMod.PublicKey],
    threshold: scala.Double,
    signatures: js.Array[nodeLib.Buffer],
    opts: js.Object
  ): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildPublicKeyHashIn(
    publicKey: bitcoreDashLibLib.bitcoreDashLibMod.PublicKey,
    signature: bitcoreDashLibLib.bitcoreDashLibMod.cryptoNs.Signature,
    sigtype: scala.Double
  ): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildPublicKeyHashIn(
    publicKey: bitcoreDashLibLib.bitcoreDashLibMod.PublicKey,
    signature: nodeLib.Buffer,
    sigtype: scala.Double
  ): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildPublicKeyHashOut(address: bitcoreDashLibLib.bitcoreDashLibMod.Address): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildPublicKeyIn(signature: bitcoreDashLibLib.bitcoreDashLibMod.cryptoNs.Signature, sigtype: scala.Double): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildPublicKeyIn(signature: nodeLib.Buffer, sigtype: scala.Double): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildPublicKeyOut(pubkey: bitcoreDashLibLib.bitcoreDashLibMod.PublicKey): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildScriptHashOut(script: bitcoreDashLibLib.bitcoreDashLibMod.Script): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def buildWitnessMultisigOutFromScript(script: bitcoreDashLibLib.bitcoreDashLibMod.Script): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def empty(): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def fromAddress(address: bitcoreDashLibLib.bitcoreDashLibMod.Address): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  def fromAddress(address: java.lang.String): bitcoreDashLibLib.bitcoreDashLibMod.Script = js.native
  @js.native
  object types extends js.Object {
    var DATA_OUT: java.lang.String = js.native
  }
  
}


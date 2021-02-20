package typings.bip32

import typings.bip32.bip32Mod.BIP32Interface
import typings.bip32.bip32Mod.Network
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip32", "fromBase58")
  @js.native
  def fromBase58(inString: String): BIP32Interface = js.native
  @JSImport("bip32", "fromBase58")
  @js.native
  def fromBase58(inString: String, network: Network): BIP32Interface = js.native
  
  @JSImport("bip32", "fromPrivateKey")
  @js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  @JSImport("bip32", "fromPrivateKey")
  @js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
  
  @JSImport("bip32", "fromPublicKey")
  @js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  @JSImport("bip32", "fromPublicKey")
  @js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
  
  @JSImport("bip32", "fromSeed")
  @js.native
  def fromSeed(seed: Buffer): BIP32Interface = js.native
  @JSImport("bip32", "fromSeed")
  @js.native
  def fromSeed(seed: Buffer, network: Network): BIP32Interface = js.native
}

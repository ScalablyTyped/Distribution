package typings.bip32

import typings.bip32.bip32Mod.BIP32Interface
import typings.bip32.bip32Mod.Network
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromBase58(inString: String): BIP32Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase58")(inString.asInstanceOf[js.Any]).asInstanceOf[BIP32Interface]
  @scala.inline
  def fromBase58(inString: String, network: Network): BIP32Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase58")(inString.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[BIP32Interface]
  
  @scala.inline
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any], chainCode.asInstanceOf[js.Any])).asInstanceOf[BIP32Interface]
  @scala.inline
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any], chainCode.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[BIP32Interface]
  
  @scala.inline
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(publicKey.asInstanceOf[js.Any], chainCode.asInstanceOf[js.Any])).asInstanceOf[BIP32Interface]
  @scala.inline
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(publicKey.asInstanceOf[js.Any], chainCode.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[BIP32Interface]
  
  @scala.inline
  def fromSeed(seed: Buffer): BIP32Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[BIP32Interface]
  @scala.inline
  def fromSeed(seed: Buffer, network: Network): BIP32Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(seed.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[BIP32Interface]
}

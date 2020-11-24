package typings.bip32.bip32Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip32/types/bip32", "fromPublicKey")
@js.native
object fromPublicKey extends js.Object {
  
  def apply(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  def apply(publicKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
}

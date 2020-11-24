package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable8
import typings.ethers.mod.ethers.utils.HDNode
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectHdnode.mod.Mnemonic
import typings.ethersprojectWordlists.mod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHDNode
  extends Instantiable8[
      /* constructorGuard */ js.Any, 
      /* privateKey */ String, 
      /* publicKey */ String, 
      /* parentFingerprint */ String, 
      /* chainCode */ String, 
      /* index */ Double, 
      /* depth */ Double, 
      /* mnemonicOrPath */ Mnemonic, 
      HDNode
    ] {
  
  def _fromSeed(seed: BytesLike, mnemonic: Mnemonic): typings.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromExtendedKey(extendedKey: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromMnemonic(mnemonic: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: Wordlist): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: Wordlist): typings.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromSeed(seed: BytesLike): typings.ethersprojectHdnode.mod.HDNode = js.native
}

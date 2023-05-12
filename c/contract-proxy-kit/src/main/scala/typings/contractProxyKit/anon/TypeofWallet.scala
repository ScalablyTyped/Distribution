package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.Wallet
import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesWalletHdwalletMod.HDNodeWallet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWallet
  extends StObject
     with Instantiable1[/* key */ String, Wallet] {
  
  /**
    *  Creates a new random [[HDNodeWallet]] using the avavilable
    *  [cryptographic random source](randomBytes).
    *
    *  If there is no crytographic random source, this will throw.
    */
  def createRandom(): HDNodeWallet = js.native
  def createRandom(provider: Provider): HDNodeWallet = js.native
  
  def fromEncryptedJson(json: String, password: String): js.Promise[HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: String, progress: ProgressCallback): js.Promise[HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet] = js.native
  /**
    *  Creates (asynchronously) a **Wallet** by decrypting the %%json%%
    *  with %%password%%.
    *
    *  If %%progress%% is provided, it is called periodically during
    *  decryption so that any UI can be updated.
    */
  def fromEncryptedJson(json: String, password: js.typedarray.Uint8Array): js.Promise[HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: js.typedarray.Uint8Array, progress: ProgressCallback): js.Promise[HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet] = js.native
  
  def fromEncryptedJsonSync(json: String, password: String): HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet = js.native
  /**
    *  Creates a **Wallet** by decrypting the %%json%% with %%password%%.
    *
    *  The [[fromEncryptedJson]] method is preferred, as this method
    *  will lock up and freeze the UI during decryption, which may take
    *  some time.
    */
  def fromEncryptedJsonSync(json: String, password: js.typedarray.Uint8Array): HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet = js.native
  
  /**
    *  Creates a [[HDNodeWallet]] for %%phrase%%.
    */
  def fromPhrase(phrase: String): HDNodeWallet = js.native
  def fromPhrase(phrase: String, provider: Provider): HDNodeWallet = js.native
}

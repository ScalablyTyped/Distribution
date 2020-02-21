package typings.contractProxyKit

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.Wallet
import typings.ethers.signingKeyMod.SigningKey
import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.ProgressCallback
import typings.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassWallet extends Instantiable1[/* privateKey */ SigningKey, Wallet] {
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typings.ethers.walletWalletMod.Wallet = js.native
  def createRandom(options: js.Any): typings.ethers.walletWalletMod.Wallet = js.native
  def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[typings.ethers.walletWalletMod.Wallet] = js.native
  def fromMnemonic(mnemonic: String): typings.ethers.walletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typings.ethers.walletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typings.ethers.walletWalletMod.Wallet = js.native
}


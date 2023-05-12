package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable7
import typings.ethers.mod.ethers.HDNodeWallet
import typings.ethers.typesCryptoMod.SigningKey
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesWalletHdwalletMod.HDNodeVoidWallet
import typings.ethers.typesWalletMnemonicMod.Mnemonic
import typings.ethers.typesWordlistsMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHDNodeWallet
  extends StObject
     with Instantiable7[
      /* guard */ Any, 
      /* signingKey */ SigningKey, 
      /* parentFingerprint */ String, 
      /* chainCode */ String, 
      /* path */ Null, 
      /* index */ Double, 
      /* depth */ Double, 
      HDNodeWallet
    ] {
  
  /**
    *  Creates a new random HDNode.
    */
  def createRandom(): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def createRandom(password: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def createRandom(password: String, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def createRandom(password: String, path: String, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def createRandom(password: String, path: Unit, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def createRandom(password: Unit, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def createRandom(password: Unit, path: String, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def createRandom(password: Unit, path: Unit, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  
  /**
    *  Creates a new HD Node from %%extendedKey%%.
    *
    *  If the %%extendedKey%% will either have a prefix or ``xpub`` or
    *  ``xpriv``, returning a neutered HD Node ([[HDNodeVoidWallet]])
    *  or full HD Node ([[HDNodeWallet) respectively.
    */
  def fromExtendedKey(extendedKey: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet | HDNodeVoidWallet = js.native
  
  /**
    *  Create am HD Node from %%mnemonic%%.
    */
  def fromMnemonic(mnemonic: Mnemonic): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def fromMnemonic(mnemonic: Mnemonic, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  
  /**
    *  Creates an HD Node from a mnemonic %%phrase%%.
    */
  def fromPhrase(phrase: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def fromPhrase(phrase: String, password: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def fromPhrase(phrase: String, password: String, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def fromPhrase(phrase: String, password: String, path: String, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def fromPhrase(phrase: String, password: String, path: Unit, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def fromPhrase(phrase: String, password: Unit, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def fromPhrase(phrase: String, password: Unit, path: String, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  def fromPhrase(phrase: String, password: Unit, path: Unit, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
  
  /**
    *  Creates an HD Node from a %%seed%%.
    */
  def fromSeed(seed: BytesLike): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = js.native
}

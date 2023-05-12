package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typings.ethers.mod.ethers.Mnemonic
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesWordlistsMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMnemonic
  extends StObject
     with Instantiable3[/* guard */ Any, /* entropy */ String, /* phrase */ String, Mnemonic] {
  
  /**
    *  Returns the phrase for %%mnemonic%%.
    */
  def entropyToPhrase(_entropy: BytesLike): String = js.native
  def entropyToPhrase(_entropy: BytesLike, wordlist: Wordlist): String = js.native
  
  /**
    *  Create a new **Mnemonic** from the %%entropy%%.
    *
    *  The default %%password%% is the empty string and the default
    *  wordlist is the [English wordlists](LangEn).
    */
  def fromEntropy(_entropy: BytesLike): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  def fromEntropy(_entropy: BytesLike, password: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  def fromEntropy(_entropy: BytesLike, password: String, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  def fromEntropy(_entropy: BytesLike, password: Null, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  def fromEntropy(_entropy: BytesLike, password: Unit, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  
  /**
    *  Creates a new Mnemonic for the %%phrase%%.
    *
    *  The default %%password%% is the empty string and the default
    *  wordlist is the [English wordlists](LangEn).
    */
  def fromPhrase(phrase: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  def fromPhrase(phrase: String, password: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  def fromPhrase(phrase: String, password: String, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  def fromPhrase(phrase: String, password: Null, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  def fromPhrase(phrase: String, password: Unit, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = js.native
  
  /**
    *  Returns true if %%phrase%% is a valid [[link-bip-39]] phrase.
    *
    *  This checks all the provided words belong to the %%wordlist%%,
    *  that the length is valid and the checksum is correct.
    */
  def isValidMnemonic(phrase: String): Boolean = js.native
  def isValidMnemonic(phrase: String, wordlist: Wordlist): Boolean = js.native
  
  /**
    *  Returns the entropy for %%phrase%%.
    */
  def phraseToEntropy(phrase: String): String = js.native
  def phraseToEntropy(phrase: String, wordlist: Wordlist): String = js.native
}

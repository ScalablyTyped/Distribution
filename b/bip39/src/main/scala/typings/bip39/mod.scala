package typings.bip39

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip39", "entropyToMnemonic")
  @js.native
  def entropyToMnemonic(entropy: String): String = js.native
  @JSImport("bip39", "entropyToMnemonic")
  @js.native
  def entropyToMnemonic(entropy: String, wordlist: js.Array[String]): String = js.native
  @JSImport("bip39", "entropyToMnemonic")
  @js.native
  def entropyToMnemonic(entropy: Buffer): String = js.native
  @JSImport("bip39", "entropyToMnemonic")
  @js.native
  def entropyToMnemonic(entropy: Buffer, wordlist: js.Array[String]): String = js.native
  
  @JSImport("bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(): String = js.native
  @JSImport("bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(strength: js.UndefOr[scala.Nothing], rng: js.UndefOr[scala.Nothing], wordlist: js.Array[String]): String = js.native
  @JSImport("bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(strength: js.UndefOr[scala.Nothing], rng: js.Function1[/* size */ Double, Buffer]): String = js.native
  @JSImport("bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(
    strength: js.UndefOr[scala.Nothing],
    rng: js.Function1[/* size */ Double, Buffer],
    wordlist: js.Array[String]
  ): String = js.native
  @JSImport("bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(strength: Double): String = js.native
  @JSImport("bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(strength: Double, rng: js.UndefOr[scala.Nothing], wordlist: js.Array[String]): String = js.native
  @JSImport("bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(strength: Double, rng: js.Function1[/* size */ Double, Buffer]): String = js.native
  @JSImport("bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(strength: Double, rng: js.Function1[/* size */ Double, Buffer], wordlist: js.Array[String]): String = js.native
  
  @JSImport("bip39", "getDefaultWordlist")
  @js.native
  def getDefaultWordlist(): String = js.native
  
  @JSImport("bip39", "mnemonicToEntropy")
  @js.native
  def mnemonicToEntropy(mnemonic: String): String = js.native
  @JSImport("bip39", "mnemonicToEntropy")
  @js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: js.Array[String]): String = js.native
  
  @JSImport("bip39", "mnemonicToSeed")
  @js.native
  def mnemonicToSeed(mnemonic: String): js.Promise[Buffer] = js.native
  @JSImport("bip39", "mnemonicToSeed")
  @js.native
  def mnemonicToSeed(mnemonic: String, password: String): js.Promise[Buffer] = js.native
  
  @JSImport("bip39", "mnemonicToSeedSync")
  @js.native
  def mnemonicToSeedSync(mnemonic: String): Buffer = js.native
  @JSImport("bip39", "mnemonicToSeedSync")
  @js.native
  def mnemonicToSeedSync(mnemonic: String, password: String): Buffer = js.native
  
  @JSImport("bip39", "setDefaultWordlist")
  @js.native
  def setDefaultWordlist(language: String): Unit = js.native
  
  @JSImport("bip39", "validateMnemonic")
  @js.native
  def validateMnemonic(mnemonic: String): Boolean = js.native
  @JSImport("bip39", "validateMnemonic")
  @js.native
  def validateMnemonic(mnemonic: String, wordlist: js.Array[String]): Boolean = js.native
}

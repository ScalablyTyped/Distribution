package typings.bip39

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip39", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def entropyToMnemonic(entropy: String): String = js.native
  def entropyToMnemonic(entropy: String, wordlist: js.Array[String]): String = js.native
  def entropyToMnemonic(entropy: Buffer): String = js.native
  def entropyToMnemonic(entropy: Buffer, wordlist: js.Array[String]): String = js.native
  def generateMnemonic(): String = js.native
  def generateMnemonic(strength: js.UndefOr[scala.Nothing], rng: js.UndefOr[scala.Nothing], wordlist: js.Array[String]): String = js.native
  def generateMnemonic(strength: js.UndefOr[scala.Nothing], rng: js.Function1[/* size */ Double, Buffer]): String = js.native
  def generateMnemonic(
    strength: js.UndefOr[scala.Nothing],
    rng: js.Function1[/* size */ Double, Buffer],
    wordlist: js.Array[String]
  ): String = js.native
  def generateMnemonic(strength: Double): String = js.native
  def generateMnemonic(strength: Double, rng: js.UndefOr[scala.Nothing], wordlist: js.Array[String]): String = js.native
  def generateMnemonic(strength: Double, rng: js.Function1[/* size */ Double, Buffer]): String = js.native
  def generateMnemonic(strength: Double, rng: js.Function1[/* size */ Double, Buffer], wordlist: js.Array[String]): String = js.native
  def getDefaultWordlist(): String = js.native
  def mnemonicToEntropy(mnemonic: String): String = js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: js.Array[String]): String = js.native
  def mnemonicToSeed(mnemonic: String): js.Promise[Buffer] = js.native
  def mnemonicToSeed(mnemonic: String, password: String): js.Promise[Buffer] = js.native
  def mnemonicToSeedSync(mnemonic: String): Buffer = js.native
  def mnemonicToSeedSync(mnemonic: String, password: String): Buffer = js.native
  def setDefaultWordlist(language: String): Unit = js.native
  def validateMnemonic(mnemonic: String): Boolean = js.native
  def validateMnemonic(mnemonic: String, wordlist: js.Array[String]): Boolean = js.native
  @js.native
  object wordlists
    extends /* index */ StringDictionary[js.Array[String]]
  
}


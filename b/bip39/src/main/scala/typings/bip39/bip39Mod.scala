package typings.bip39

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip39", JSImport.Namespace)
@js.native
object bip39Mod extends js.Object {
  def entropyToMnemonic(entropyHex: String): String = js.native
  def entropyToMnemonic(entropyHex: String, wordlist: js.Array[String]): String = js.native
  def entropyToMnemonic(entropyHex: Buffer): String = js.native
  def entropyToMnemonic(entropyHex: Buffer, wordlist: js.Array[String]): String = js.native
  def generateMnemonic(): String = js.native
  def generateMnemonic(strength: Double): String = js.native
  def generateMnemonic(strength: Double, rng: js.Function1[/* size */ Double, Buffer]): String = js.native
  def generateMnemonic(strength: Double, rng: js.Function1[/* size */ Double, Buffer], wordlist: js.Array[String]): String = js.native
  def mnemonicToEntropy(mnemonic: String): String = js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: js.Array[String]): String = js.native
  def mnemonicToSeed(mnemonic: String): Buffer = js.native
  def mnemonicToSeed(mnemonic: String, password: String): Buffer = js.native
  def mnemonicToSeedHex(mnemonic: String): String = js.native
  def mnemonicToSeedHex(mnemonic: String, password: String): String = js.native
  def validateMnemonic(mnemonic: String): Boolean = js.native
  def validateMnemonic(mnemonic: String, wordlist: js.Array[String]): Boolean = js.native
  @js.native
  object wordlists extends js.Object {
    var EN: js.Array[String] = js.native
    var JA: js.Array[String] = js.native
    var chinese_simplified: js.Array[String] = js.native
    var chinese_traditional: js.Array[String] = js.native
    var english: js.Array[String] = js.native
    var french: js.Array[String] = js.native
    var italian: js.Array[String] = js.native
    var japanese: js.Array[String] = js.native
    var spanish: js.Array[String] = js.native
  }
  
}


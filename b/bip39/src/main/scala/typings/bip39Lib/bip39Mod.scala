package typings
package bip39Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip39", JSImport.Namespace)
@js.native
object bip39Mod extends js.Object {
  def entropyToMnemonic(entropyHex: java.lang.String): java.lang.String = js.native
  def entropyToMnemonic(entropyHex: java.lang.String, wordlist: js.Array[java.lang.String]): java.lang.String = js.native
  def entropyToMnemonic(entropyHex: nodeLib.Buffer): java.lang.String = js.native
  def entropyToMnemonic(entropyHex: nodeLib.Buffer, wordlist: js.Array[java.lang.String]): java.lang.String = js.native
  def generateMnemonic(): java.lang.String = js.native
  def generateMnemonic(strength: scala.Double): java.lang.String = js.native
  def generateMnemonic(strength: scala.Double, rng: js.Function1[/* size */ scala.Double, nodeLib.Buffer]): java.lang.String = js.native
  def generateMnemonic(
    strength: scala.Double,
    rng: js.Function1[/* size */ scala.Double, nodeLib.Buffer],
    wordlist: js.Array[java.lang.String]
  ): java.lang.String = js.native
  def mnemonicToEntropy(mnemonic: java.lang.String): java.lang.String = js.native
  def mnemonicToEntropy(mnemonic: java.lang.String, wordlist: js.Array[java.lang.String]): java.lang.String = js.native
  def mnemonicToSeed(mnemonic: java.lang.String): nodeLib.Buffer = js.native
  def mnemonicToSeed(mnemonic: java.lang.String, password: java.lang.String): nodeLib.Buffer = js.native
  def mnemonicToSeedHex(mnemonic: java.lang.String): java.lang.String = js.native
  def mnemonicToSeedHex(mnemonic: java.lang.String, password: java.lang.String): java.lang.String = js.native
  def validateMnemonic(mnemonic: java.lang.String): scala.Boolean = js.native
  def validateMnemonic(mnemonic: java.lang.String, wordlist: js.Array[java.lang.String]): scala.Boolean = js.native
  @js.native
  object wordlists extends js.Object {
    var EN: js.Array[java.lang.String] = js.native
    var JA: js.Array[java.lang.String] = js.native
    var chinese_simplified: js.Array[java.lang.String] = js.native
    var chinese_traditional: js.Array[java.lang.String] = js.native
    var english: js.Array[java.lang.String] = js.native
    var french: js.Array[java.lang.String] = js.native
    var italian: js.Array[java.lang.String] = js.native
    var japanese: js.Array[java.lang.String] = js.native
    var spanish: js.Array[java.lang.String] = js.native
  }
  
}


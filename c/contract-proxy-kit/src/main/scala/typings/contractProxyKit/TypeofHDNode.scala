package typings.contractProxyKit

import typings.contractProxyKit.contractProxyKitStrings.mSlash44ApostropheSlash60ApostropheSlash0ApostropheSlash0Slash0
import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.HDNode
import typings.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHDNode extends js.Object {
  val defaultPath: mSlash44ApostropheSlash60ApostropheSlash0ApostropheSlash0Slash0 = js.native
  def entropyToMnemonic(entropy: Arrayish): String = js.native
  def entropyToMnemonic(entropy: Arrayish, wordlist: Wordlist): String = js.native
  def fromMnemonic(mnemonic: String): HDNode = js.native
  def fromMnemonic(mnemonic: String, wordlist: Wordlist): HDNode = js.native
  def fromSeed(seed: Arrayish): HDNode = js.native
  def isValidMnemonic(mnemonic: String): Boolean = js.native
  def isValidMnemonic(mnemonic: String, wordlist: Wordlist): Boolean = js.native
  def mnemonicToEntropy(mnemonic: String): String = js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: Wordlist): String = js.native
  def mnemonicToSeed(mnemonic: String): String = js.native
  def mnemonicToSeed(mnemonic: String, password: String): String = js.native
}


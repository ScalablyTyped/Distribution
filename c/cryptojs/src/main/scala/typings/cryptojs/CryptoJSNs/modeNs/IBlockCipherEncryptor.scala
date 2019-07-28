package typings.cryptojs.CryptoJSNs.modeNs

import typings.cryptojs.CryptoJSNs.libNs.BlockCipherMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockCipherEncryptor extends BlockCipherMode {
  def processBlock(words: js.Array[Double], offset: Double): Unit = js.native
}


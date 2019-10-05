package typings.cryptojs.CryptoJS.mode

import typings.cryptojs.CryptoJS.lib.BlockCipherMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockCipherDecryptor extends BlockCipherMode {
  //exactly as IBlockCipherEncryptor
  def processBlock(words: js.Array[Double], offset: Double): Unit = js.native
}


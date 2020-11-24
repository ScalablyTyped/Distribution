package typings.cryptojs.CryptoJS.mode

import typings.cryptojs.CryptoJS.lib.BlockCipherMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlockCipherEncryptor extends BlockCipherMode {
  
  def processBlock(words: js.Array[Double], offset: Double): Unit = js.native
}

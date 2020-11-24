package typings.cryptojs.CryptoJS.algo

import typings.cryptojs.CryptoJS.lib.CipherParamsData
import typings.cryptojs.CryptoJS.lib.IBlockCipherCfg
import typings.cryptojs.CryptoJS.lib.IStreamCipher
import typings.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlockCipherImpl extends IStreamCipher[IBlockCipherCfg] {
  
  def createDecryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
  
  def createEncryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
  
  def decryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
  
  def encryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
}

package typings.cryptojs.CryptoJSNs.algoNs

import typings.cryptojs.CryptoJSNs.libNs.CipherParamsData
import typings.cryptojs.CryptoJSNs.libNs.IBlockCipherCfg
import typings.cryptojs.CryptoJSNs.libNs.IStreamCipher
import typings.cryptojs.CryptoJSNs.libNs.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockCipherImpl extends IStreamCipher[IBlockCipherCfg] {
  def createDecryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
  def createEncryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
  def decryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
  def encryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
}


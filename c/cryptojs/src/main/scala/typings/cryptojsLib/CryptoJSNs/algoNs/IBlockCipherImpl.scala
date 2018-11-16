package typings
package cryptojsLib.CryptoJSNs.algoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockCipherImpl
  extends cryptojsLib.CryptoJSNs.libNs.IStreamCipher[cryptojsLib.CryptoJSNs.libNs.IBlockCipherCfg] {
  def createDecryptor(key: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: cryptojsLib.CryptoJSNs.libNs.CipherParamsData): IBlockCipherImpl = js.native
  def createEncryptor(key: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: cryptojsLib.CryptoJSNs.libNs.CipherParamsData): IBlockCipherImpl = js.native
  def decryptBlock(M: js.Array[scala.Double], offset: scala.Double): scala.Unit = js.native
  def encryptBlock(M: js.Array[scala.Double], offset: scala.Double): scala.Unit = js.native
}


package typings
package cryptojsLib.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoJSStatic extends js.Object {
  var AES: cryptojsLib.CryptoJSNs.libNs.ICipherHelper[cryptojsLib.CryptoJSNs.libNs.IBlockCipherCfg] = js.native
  var DES: cryptojsLib.CryptoJSNs.libNs.ICipherHelper[cryptojsLib.CryptoJSNs.libNs.IBlockCipherCfg] = js.native
  @JSName("EvpKDF")
  var EvpKDF_Original: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFHelper = js.native
  @JSName("HmacMD5")
  var HmacMD5_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHmacHelper = js.native
  @JSName("HmacRIPEMD160")
  var HmacRIPEMD160_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHmacHelper = js.native
  @JSName("HmacSHA1")
  var HmacSHA1_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHmacHelper = js.native
  @JSName("HmacSHA224")
  var HmacSHA224_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHmacHelper = js.native
  @JSName("HmacSHA256")
  var HmacSHA256_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHmacHelper = js.native
  @JSName("HmacSHA384")
  var HmacSHA384_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHmacHelper = js.native
  @JSName("HmacSHA3")
  var HmacSHA3_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHmacHelper = js.native
  @JSName("HmacSHA512")
  var HmacSHA512_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHmacHelper = js.native
  @JSName("MD5")
  var MD5_Original: cryptojsLib.CryptoJSNs.libNs.HasherHelper = js.native
  @JSName("PBKDF2")
  var PBKDF2_Original: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFHelper = js.native
  var RC4: cryptojsLib.CryptoJSNs.libNs.CipherHelper = js.native
  var RC4Drop: cryptojsLib.CryptoJSNs.libNs.ICipherHelper[js.Object] = js.native
  @JSName("RIPEMD160")
  var RIPEMD160_Original: cryptojsLib.CryptoJSNs.libNs.HasherHelper = js.native
  var Rabbit: cryptojsLib.CryptoJSNs.libNs.CipherHelper = js.native
  var RabbitLegacy: cryptojsLib.CryptoJSNs.libNs.CipherHelper = js.native
  @JSName("SHA1")
  var SHA1_Original: cryptojsLib.CryptoJSNs.libNs.HasherHelper = js.native
  @JSName("SHA224")
  var SHA224_Original: cryptojsLib.CryptoJSNs.libNs.HasherHelper = js.native
  @JSName("SHA256")
  var SHA256_Original: cryptojsLib.CryptoJSNs.libNs.HasherHelper = js.native
  @JSName("SHA384")
  var SHA384_Original: cryptojsLib.CryptoJSNs.libNs.HasherHelper = js.native
  @JSName("SHA3")
  var SHA3_Original: cryptojsLib.CryptoJSNs.libNs.IHasherHelper[cryptojsLib.CryptoJSNs.algoNs.ISHA3Cfg] = js.native
  @JSName("SHA512")
  var SHA512_Original: cryptojsLib.CryptoJSNs.libNs.HasherHelper = js.native
  var TripleDES: cryptojsLib.CryptoJSNs.libNs.ICipherHelper[cryptojsLib.CryptoJSNs.libNs.IBlockCipherCfg] = js.native
  var algo: cryptojsLib.CryptoJSNs.algoNs.AlgoStatic = js.native
  var enc: cryptojsLib.CryptoJSNs.encNs.EncStatic = js.native
  var format: cryptojsLib.CryptoJSNs.formatNs.FormatStatic = js.native
  var kdf: cryptojsLib.CryptoJSNs.kdfNs.KdfStatic = js.native
  var lib: cryptojsLib.CryptoJSNs.libNs.LibStatic = js.native
  var mode: cryptojsLib.CryptoJSNs.modeNs.ModeStatic = js.native
  var pad: cryptojsLib.CryptoJSNs.padNs.PadStatic = js.native
  var x64: cryptojsLib.CryptoJSNs.x64Ns.X64Static = js.native
  def EvpKDF(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def EvpKDF(
    password: cryptojsLib.CryptoJSNs.libNs.WordArray,
    salt: cryptojsLib.CryptoJSNs.libNs.WordArray,
    cfg: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFCfg
  ): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def EvpKDF(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def EvpKDF(
    password: cryptojsLib.CryptoJSNs.libNs.WordArray,
    salt: java.lang.String,
    cfg: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFCfg
  ): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def EvpKDF(password: java.lang.String, salt: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def EvpKDF(
    password: java.lang.String,
    salt: cryptojsLib.CryptoJSNs.libNs.WordArray,
    cfg: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFCfg
  ): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def EvpKDF(password: java.lang.String, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def EvpKDF(password: java.lang.String, salt: java.lang.String, cfg: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFCfg): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacMD5(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacMD5(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacMD5(message: java.lang.String, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacMD5(message: java.lang.String, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacRIPEMD160(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacRIPEMD160(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacRIPEMD160(message: java.lang.String, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacRIPEMD160(message: java.lang.String, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA1(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA1(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA1(message: java.lang.String, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA1(message: java.lang.String, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA224(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA224(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA224(message: java.lang.String, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA224(message: java.lang.String, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA256(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA256(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA256(message: java.lang.String, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA256(message: java.lang.String, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA3(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA3(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA3(message: java.lang.String, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA3(message: java.lang.String, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA384(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA384(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA384(message: java.lang.String, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA384(message: java.lang.String, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA512(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA512(message: cryptojsLib.CryptoJSNs.libNs.WordArray, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA512(message: java.lang.String, key: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def HmacSHA512(message: java.lang.String, key: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def MD5(message: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def MD5(message: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def MD5(message: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def MD5(message: java.lang.String, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def PBKDF2(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def PBKDF2(
    password: cryptojsLib.CryptoJSNs.libNs.WordArray,
    salt: cryptojsLib.CryptoJSNs.libNs.WordArray,
    cfg: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFCfg
  ): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def PBKDF2(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def PBKDF2(
    password: cryptojsLib.CryptoJSNs.libNs.WordArray,
    salt: java.lang.String,
    cfg: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFCfg
  ): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def PBKDF2(password: java.lang.String, salt: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def PBKDF2(
    password: java.lang.String,
    salt: cryptojsLib.CryptoJSNs.libNs.WordArray,
    cfg: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFCfg
  ): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def PBKDF2(password: java.lang.String, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def PBKDF2(password: java.lang.String, salt: java.lang.String, cfg: cryptojsLib.CryptoJSNs.algoNs.IEvpKDFCfg): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def RIPEMD160(message: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def RIPEMD160(message: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def RIPEMD160(message: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def RIPEMD160(message: java.lang.String, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA1(message: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA1(message: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA1(message: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA1(message: java.lang.String, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA224(message: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA224(message: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA224(message: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA224(message: java.lang.String, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA256(message: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA256(message: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA256(message: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA256(message: java.lang.String, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA3(message: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA3(message: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: cryptojsLib.CryptoJSNs.algoNs.ISHA3Cfg): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA3(message: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA3(message: java.lang.String, cfg: cryptojsLib.CryptoJSNs.algoNs.ISHA3Cfg): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA384(message: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA384(message: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA384(message: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA384(message: java.lang.String, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA512(message: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA512(message: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA512(message: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def SHA512(message: java.lang.String, cfg: js.Object): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
}


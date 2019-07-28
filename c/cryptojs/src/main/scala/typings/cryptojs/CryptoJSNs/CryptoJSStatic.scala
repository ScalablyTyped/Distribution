package typings.cryptojs.CryptoJSNs

import typings.cryptojs.CryptoJSNs.algoNs.AlgoStatic
import typings.cryptojs.CryptoJSNs.algoNs.IEvpKDFCfg
import typings.cryptojs.CryptoJSNs.algoNs.IEvpKDFHelper
import typings.cryptojs.CryptoJSNs.algoNs.ISHA3Cfg
import typings.cryptojs.CryptoJSNs.encNs.EncStatic
import typings.cryptojs.CryptoJSNs.formatNs.FormatStatic
import typings.cryptojs.CryptoJSNs.kdfNs.KdfStatic
import typings.cryptojs.CryptoJSNs.libNs.CipherHelper
import typings.cryptojs.CryptoJSNs.libNs.HasherHelper
import typings.cryptojs.CryptoJSNs.libNs.IBlockCipherCfg
import typings.cryptojs.CryptoJSNs.libNs.ICipherHelper
import typings.cryptojs.CryptoJSNs.libNs.IHasherHelper
import typings.cryptojs.CryptoJSNs.libNs.IHasherHmacHelper
import typings.cryptojs.CryptoJSNs.libNs.LibStatic
import typings.cryptojs.CryptoJSNs.libNs.WordArray
import typings.cryptojs.CryptoJSNs.modeNs.ModeStatic
import typings.cryptojs.CryptoJSNs.padNs.PadStatic
import typings.cryptojs.CryptoJSNs.x64Ns.X64Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoJSStatic extends js.Object {
  var AES: ICipherHelper[IBlockCipherCfg] = js.native
  var DES: ICipherHelper[IBlockCipherCfg] = js.native
  @JSName("EvpKDF")
  var EvpKDF_Original: IEvpKDFHelper = js.native
  @JSName("HmacMD5")
  var HmacMD5_Original: IHasherHmacHelper = js.native
  @JSName("HmacRIPEMD160")
  var HmacRIPEMD160_Original: IHasherHmacHelper = js.native
  @JSName("HmacSHA1")
  var HmacSHA1_Original: IHasherHmacHelper = js.native
  @JSName("HmacSHA224")
  var HmacSHA224_Original: IHasherHmacHelper = js.native
  @JSName("HmacSHA256")
  var HmacSHA256_Original: IHasherHmacHelper = js.native
  @JSName("HmacSHA384")
  var HmacSHA384_Original: IHasherHmacHelper = js.native
  @JSName("HmacSHA3")
  var HmacSHA3_Original: IHasherHmacHelper = js.native
  @JSName("HmacSHA512")
  var HmacSHA512_Original: IHasherHmacHelper = js.native
  @JSName("MD5")
  var MD5_Original: HasherHelper = js.native
  @JSName("PBKDF2")
  var PBKDF2_Original: IEvpKDFHelper = js.native
  var RC4: CipherHelper = js.native
  var RC4Drop: ICipherHelper[js.Object] = js.native
  @JSName("RIPEMD160")
  var RIPEMD160_Original: HasherHelper = js.native
  var Rabbit: CipherHelper = js.native
  var RabbitLegacy: CipherHelper = js.native
  @JSName("SHA1")
  var SHA1_Original: HasherHelper = js.native
  @JSName("SHA224")
  var SHA224_Original: HasherHelper = js.native
  @JSName("SHA256")
  var SHA256_Original: HasherHelper = js.native
  @JSName("SHA384")
  var SHA384_Original: HasherHelper = js.native
  @JSName("SHA3")
  var SHA3_Original: IHasherHelper[ISHA3Cfg] = js.native
  @JSName("SHA512")
  var SHA512_Original: HasherHelper = js.native
  var TripleDES: ICipherHelper[IBlockCipherCfg] = js.native
  var algo: AlgoStatic = js.native
  var enc: EncStatic = js.native
  var format: FormatStatic = js.native
  var kdf: KdfStatic = js.native
  var lib: LibStatic = js.native
  var mode: ModeStatic = js.native
  var pad: PadStatic = js.native
  var x64: X64Static = js.native
  def EvpKDF(password: String, salt: String): WordArray = js.native
  def EvpKDF(password: String, salt: String, cfg: IEvpKDFCfg): WordArray = js.native
  def EvpKDF(password: String, salt: WordArray): WordArray = js.native
  def EvpKDF(password: String, salt: WordArray, cfg: IEvpKDFCfg): WordArray = js.native
  def EvpKDF(password: WordArray, salt: String): WordArray = js.native
  def EvpKDF(password: WordArray, salt: String, cfg: IEvpKDFCfg): WordArray = js.native
  def EvpKDF(password: WordArray, salt: WordArray): WordArray = js.native
  def EvpKDF(password: WordArray, salt: WordArray, cfg: IEvpKDFCfg): WordArray = js.native
  def HmacMD5(message: String, key: String): WordArray = js.native
  def HmacMD5(message: String, key: WordArray): WordArray = js.native
  def HmacMD5(message: WordArray, key: String): WordArray = js.native
  def HmacMD5(message: WordArray, key: WordArray): WordArray = js.native
  def HmacRIPEMD160(message: String, key: String): WordArray = js.native
  def HmacRIPEMD160(message: String, key: WordArray): WordArray = js.native
  def HmacRIPEMD160(message: WordArray, key: String): WordArray = js.native
  def HmacRIPEMD160(message: WordArray, key: WordArray): WordArray = js.native
  def HmacSHA1(message: String, key: String): WordArray = js.native
  def HmacSHA1(message: String, key: WordArray): WordArray = js.native
  def HmacSHA1(message: WordArray, key: String): WordArray = js.native
  def HmacSHA1(message: WordArray, key: WordArray): WordArray = js.native
  def HmacSHA224(message: String, key: String): WordArray = js.native
  def HmacSHA224(message: String, key: WordArray): WordArray = js.native
  def HmacSHA224(message: WordArray, key: String): WordArray = js.native
  def HmacSHA224(message: WordArray, key: WordArray): WordArray = js.native
  def HmacSHA256(message: String, key: String): WordArray = js.native
  def HmacSHA256(message: String, key: WordArray): WordArray = js.native
  def HmacSHA256(message: WordArray, key: String): WordArray = js.native
  def HmacSHA256(message: WordArray, key: WordArray): WordArray = js.native
  def HmacSHA3(message: String, key: String): WordArray = js.native
  def HmacSHA3(message: String, key: WordArray): WordArray = js.native
  def HmacSHA3(message: WordArray, key: String): WordArray = js.native
  def HmacSHA3(message: WordArray, key: WordArray): WordArray = js.native
  def HmacSHA384(message: String, key: String): WordArray = js.native
  def HmacSHA384(message: String, key: WordArray): WordArray = js.native
  def HmacSHA384(message: WordArray, key: String): WordArray = js.native
  def HmacSHA384(message: WordArray, key: WordArray): WordArray = js.native
  def HmacSHA512(message: String, key: String): WordArray = js.native
  def HmacSHA512(message: String, key: WordArray): WordArray = js.native
  def HmacSHA512(message: WordArray, key: String): WordArray = js.native
  def HmacSHA512(message: WordArray, key: WordArray): WordArray = js.native
  def MD5(message: String): WordArray = js.native
  def MD5(message: String, cfg: js.Object): WordArray = js.native
  def MD5(message: WordArray): WordArray = js.native
  def MD5(message: WordArray, cfg: js.Object): WordArray = js.native
  def PBKDF2(password: String, salt: String): WordArray = js.native
  def PBKDF2(password: String, salt: String, cfg: IEvpKDFCfg): WordArray = js.native
  def PBKDF2(password: String, salt: WordArray): WordArray = js.native
  def PBKDF2(password: String, salt: WordArray, cfg: IEvpKDFCfg): WordArray = js.native
  def PBKDF2(password: WordArray, salt: String): WordArray = js.native
  def PBKDF2(password: WordArray, salt: String, cfg: IEvpKDFCfg): WordArray = js.native
  def PBKDF2(password: WordArray, salt: WordArray): WordArray = js.native
  def PBKDF2(password: WordArray, salt: WordArray, cfg: IEvpKDFCfg): WordArray = js.native
  def RIPEMD160(message: String): WordArray = js.native
  def RIPEMD160(message: String, cfg: js.Object): WordArray = js.native
  def RIPEMD160(message: WordArray): WordArray = js.native
  def RIPEMD160(message: WordArray, cfg: js.Object): WordArray = js.native
  def SHA1(message: String): WordArray = js.native
  def SHA1(message: String, cfg: js.Object): WordArray = js.native
  def SHA1(message: WordArray): WordArray = js.native
  def SHA1(message: WordArray, cfg: js.Object): WordArray = js.native
  def SHA224(message: String): WordArray = js.native
  def SHA224(message: String, cfg: js.Object): WordArray = js.native
  def SHA224(message: WordArray): WordArray = js.native
  def SHA224(message: WordArray, cfg: js.Object): WordArray = js.native
  def SHA256(message: String): WordArray = js.native
  def SHA256(message: String, cfg: js.Object): WordArray = js.native
  def SHA256(message: WordArray): WordArray = js.native
  def SHA256(message: WordArray, cfg: js.Object): WordArray = js.native
  def SHA3(message: String): WordArray = js.native
  def SHA3(message: String, cfg: ISHA3Cfg): WordArray = js.native
  def SHA3(message: WordArray): WordArray = js.native
  def SHA3(message: WordArray, cfg: ISHA3Cfg): WordArray = js.native
  def SHA384(message: String): WordArray = js.native
  def SHA384(message: String, cfg: js.Object): WordArray = js.native
  def SHA384(message: WordArray): WordArray = js.native
  def SHA384(message: WordArray, cfg: js.Object): WordArray = js.native
  def SHA512(message: String): WordArray = js.native
  def SHA512(message: String, cfg: js.Object): WordArray = js.native
  def SHA512(message: WordArray): WordArray = js.native
  def SHA512(message: WordArray, cfg: js.Object): WordArray = js.native
}


package typings.cryptojs.CryptoJS

import typings.cryptojs.CryptoJS.algo.AlgoStatic
import typings.cryptojs.CryptoJS.algo.IEvpKDFCfg
import typings.cryptojs.CryptoJS.algo.IEvpKDFHelper
import typings.cryptojs.CryptoJS.algo.ISHA3Cfg
import typings.cryptojs.CryptoJS.enc.EncStatic
import typings.cryptojs.CryptoJS.format.FormatStatic
import typings.cryptojs.CryptoJS.kdf.KdfStatic
import typings.cryptojs.CryptoJS.lib.CipherHelper
import typings.cryptojs.CryptoJS.lib.HasherHelper
import typings.cryptojs.CryptoJS.lib.IBlockCipherCfg
import typings.cryptojs.CryptoJS.lib.ICipherHelper
import typings.cryptojs.CryptoJS.lib.IHasherHelper
import typings.cryptojs.CryptoJS.lib.IHasherHmacHelper
import typings.cryptojs.CryptoJS.lib.LibStatic
import typings.cryptojs.CryptoJS.lib.WordArray
import typings.cryptojs.CryptoJS.mode.ModeStatic
import typings.cryptojs.CryptoJS.pad.PadStatic
import typings.cryptojs.CryptoJS.x64.X64Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoJSStatic extends StObject {
  
  var AES: ICipherHelper[IBlockCipherCfg]
  
  var DES: ICipherHelper[IBlockCipherCfg]
  
  def EvpKDF(password: String, salt: String): WordArray
  def EvpKDF(password: String, salt: String, cfg: IEvpKDFCfg): WordArray
  def EvpKDF(password: String, salt: WordArray): WordArray
  def EvpKDF(password: String, salt: WordArray, cfg: IEvpKDFCfg): WordArray
  def EvpKDF(password: WordArray, salt: String): WordArray
  def EvpKDF(password: WordArray, salt: String, cfg: IEvpKDFCfg): WordArray
  def EvpKDF(password: WordArray, salt: WordArray): WordArray
  def EvpKDF(password: WordArray, salt: WordArray, cfg: IEvpKDFCfg): WordArray
  @JSName("EvpKDF")
  var EvpKDF_Original: IEvpKDFHelper
  
  def HmacMD5(message: String, key: String): WordArray
  def HmacMD5(message: String, key: WordArray): WordArray
  def HmacMD5(message: WordArray, key: String): WordArray
  def HmacMD5(message: WordArray, key: WordArray): WordArray
  @JSName("HmacMD5")
  var HmacMD5_Original: IHasherHmacHelper
  
  def HmacRIPEMD160(message: String, key: String): WordArray
  def HmacRIPEMD160(message: String, key: WordArray): WordArray
  def HmacRIPEMD160(message: WordArray, key: String): WordArray
  def HmacRIPEMD160(message: WordArray, key: WordArray): WordArray
  @JSName("HmacRIPEMD160")
  var HmacRIPEMD160_Original: IHasherHmacHelper
  
  def HmacSHA1(message: String, key: String): WordArray
  def HmacSHA1(message: String, key: WordArray): WordArray
  def HmacSHA1(message: WordArray, key: String): WordArray
  def HmacSHA1(message: WordArray, key: WordArray): WordArray
  @JSName("HmacSHA1")
  var HmacSHA1_Original: IHasherHmacHelper
  
  def HmacSHA224(message: String, key: String): WordArray
  def HmacSHA224(message: String, key: WordArray): WordArray
  def HmacSHA224(message: WordArray, key: String): WordArray
  def HmacSHA224(message: WordArray, key: WordArray): WordArray
  @JSName("HmacSHA224")
  var HmacSHA224_Original: IHasherHmacHelper
  
  def HmacSHA256(message: String, key: String): WordArray
  def HmacSHA256(message: String, key: WordArray): WordArray
  def HmacSHA256(message: WordArray, key: String): WordArray
  def HmacSHA256(message: WordArray, key: WordArray): WordArray
  @JSName("HmacSHA256")
  var HmacSHA256_Original: IHasherHmacHelper
  
  def HmacSHA3(message: String, key: String): WordArray
  def HmacSHA3(message: String, key: WordArray): WordArray
  def HmacSHA3(message: WordArray, key: String): WordArray
  def HmacSHA3(message: WordArray, key: WordArray): WordArray
  
  def HmacSHA384(message: String, key: String): WordArray
  def HmacSHA384(message: String, key: WordArray): WordArray
  def HmacSHA384(message: WordArray, key: String): WordArray
  def HmacSHA384(message: WordArray, key: WordArray): WordArray
  @JSName("HmacSHA384")
  var HmacSHA384_Original: IHasherHmacHelper
  
  @JSName("HmacSHA3")
  var HmacSHA3_Original: IHasherHmacHelper
  
  def HmacSHA512(message: String, key: String): WordArray
  def HmacSHA512(message: String, key: WordArray): WordArray
  def HmacSHA512(message: WordArray, key: String): WordArray
  def HmacSHA512(message: WordArray, key: WordArray): WordArray
  @JSName("HmacSHA512")
  var HmacSHA512_Original: IHasherHmacHelper
  
  def MD5(message: String): WordArray
  def MD5(message: String, cfg: js.Object): WordArray
  def MD5(message: WordArray): WordArray
  def MD5(message: WordArray, cfg: js.Object): WordArray
  @JSName("MD5")
  var MD5_Original: HasherHelper
  
  def PBKDF2(password: String, salt: String): WordArray
  def PBKDF2(password: String, salt: String, cfg: IEvpKDFCfg): WordArray
  def PBKDF2(password: String, salt: WordArray): WordArray
  def PBKDF2(password: String, salt: WordArray, cfg: IEvpKDFCfg): WordArray
  def PBKDF2(password: WordArray, salt: String): WordArray
  def PBKDF2(password: WordArray, salt: String, cfg: IEvpKDFCfg): WordArray
  def PBKDF2(password: WordArray, salt: WordArray): WordArray
  def PBKDF2(password: WordArray, salt: WordArray, cfg: IEvpKDFCfg): WordArray
  @JSName("PBKDF2")
  var PBKDF2_Original: IEvpKDFHelper
  
  var RC4: CipherHelper
  
  var RC4Drop: ICipherHelper[js.Object]
  
  def RIPEMD160(message: String): WordArray
  def RIPEMD160(message: String, cfg: js.Object): WordArray
  def RIPEMD160(message: WordArray): WordArray
  def RIPEMD160(message: WordArray, cfg: js.Object): WordArray
  @JSName("RIPEMD160")
  var RIPEMD160_Original: HasherHelper
  
  var Rabbit: CipherHelper
  
  var RabbitLegacy: CipherHelper
  
  def SHA1(message: String): WordArray
  def SHA1(message: String, cfg: js.Object): WordArray
  def SHA1(message: WordArray): WordArray
  def SHA1(message: WordArray, cfg: js.Object): WordArray
  @JSName("SHA1")
  var SHA1_Original: HasherHelper
  
  def SHA224(message: String): WordArray
  def SHA224(message: String, cfg: js.Object): WordArray
  def SHA224(message: WordArray): WordArray
  def SHA224(message: WordArray, cfg: js.Object): WordArray
  @JSName("SHA224")
  var SHA224_Original: HasherHelper
  
  def SHA256(message: String): WordArray
  def SHA256(message: String, cfg: js.Object): WordArray
  def SHA256(message: WordArray): WordArray
  def SHA256(message: WordArray, cfg: js.Object): WordArray
  @JSName("SHA256")
  var SHA256_Original: HasherHelper
  
  def SHA3(message: String): WordArray
  def SHA3(message: String, cfg: ISHA3Cfg): WordArray
  def SHA3(message: WordArray): WordArray
  def SHA3(message: WordArray, cfg: ISHA3Cfg): WordArray
  
  def SHA384(message: String): WordArray
  def SHA384(message: String, cfg: js.Object): WordArray
  def SHA384(message: WordArray): WordArray
  def SHA384(message: WordArray, cfg: js.Object): WordArray
  @JSName("SHA384")
  var SHA384_Original: HasherHelper
  
  @JSName("SHA3")
  var SHA3_Original: IHasherHelper[ISHA3Cfg]
  
  def SHA512(message: String): WordArray
  def SHA512(message: String, cfg: js.Object): WordArray
  def SHA512(message: WordArray): WordArray
  def SHA512(message: WordArray, cfg: js.Object): WordArray
  @JSName("SHA512")
  var SHA512_Original: HasherHelper
  
  var TripleDES: ICipherHelper[IBlockCipherCfg]
  
  var algo: AlgoStatic
  
  var enc: EncStatic
  
  var format: FormatStatic
  
  var kdf: KdfStatic
  
  var lib: LibStatic
  
  var mode: ModeStatic
  
  var pad: PadStatic
  
  var x64: X64Static
}
object CryptoJSStatic {
  
  inline def apply(
    AES: ICipherHelper[IBlockCipherCfg],
    DES: ICipherHelper[IBlockCipherCfg],
    EvpKDF: IEvpKDFHelper,
    HmacMD5: IHasherHmacHelper,
    HmacRIPEMD160: IHasherHmacHelper,
    HmacSHA1: IHasherHmacHelper,
    HmacSHA224: IHasherHmacHelper,
    HmacSHA256: IHasherHmacHelper,
    HmacSHA3: IHasherHmacHelper,
    HmacSHA384: IHasherHmacHelper,
    HmacSHA512: IHasherHmacHelper,
    MD5: HasherHelper,
    PBKDF2: IEvpKDFHelper,
    RC4: CipherHelper,
    RC4Drop: ICipherHelper[js.Object],
    RIPEMD160: HasherHelper,
    Rabbit: CipherHelper,
    RabbitLegacy: CipherHelper,
    SHA1: HasherHelper,
    SHA224: HasherHelper,
    SHA256: HasherHelper,
    SHA3: IHasherHelper[ISHA3Cfg],
    SHA384: HasherHelper,
    SHA512: HasherHelper,
    TripleDES: ICipherHelper[IBlockCipherCfg],
    algo: AlgoStatic,
    enc: EncStatic,
    format: FormatStatic,
    kdf: KdfStatic,
    lib: LibStatic,
    mode: ModeStatic,
    pad: PadStatic,
    x64: X64Static
  ): CryptoJSStatic = {
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], DES = DES.asInstanceOf[js.Any], EvpKDF = EvpKDF.asInstanceOf[js.Any], HmacMD5 = HmacMD5.asInstanceOf[js.Any], HmacRIPEMD160 = HmacRIPEMD160.asInstanceOf[js.Any], HmacSHA1 = HmacSHA1.asInstanceOf[js.Any], HmacSHA224 = HmacSHA224.asInstanceOf[js.Any], HmacSHA256 = HmacSHA256.asInstanceOf[js.Any], HmacSHA3 = HmacSHA3.asInstanceOf[js.Any], HmacSHA384 = HmacSHA384.asInstanceOf[js.Any], HmacSHA512 = HmacSHA512.asInstanceOf[js.Any], MD5 = MD5.asInstanceOf[js.Any], PBKDF2 = PBKDF2.asInstanceOf[js.Any], RC4 = RC4.asInstanceOf[js.Any], RC4Drop = RC4Drop.asInstanceOf[js.Any], RIPEMD160 = RIPEMD160.asInstanceOf[js.Any], Rabbit = Rabbit.asInstanceOf[js.Any], RabbitLegacy = RabbitLegacy.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SHA224 = SHA224.asInstanceOf[js.Any], SHA256 = SHA256.asInstanceOf[js.Any], SHA3 = SHA3.asInstanceOf[js.Any], SHA384 = SHA384.asInstanceOf[js.Any], SHA512 = SHA512.asInstanceOf[js.Any], TripleDES = TripleDES.asInstanceOf[js.Any], algo = algo.asInstanceOf[js.Any], enc = enc.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], x64 = x64.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoJSStatic]
  }
  
  extension [Self <: CryptoJSStatic](x: Self) {
    
    inline def setAES(value: ICipherHelper[IBlockCipherCfg]): Self = StObject.set(x, "AES", value.asInstanceOf[js.Any])
    
    inline def setAlgo(value: AlgoStatic): Self = StObject.set(x, "algo", value.asInstanceOf[js.Any])
    
    inline def setDES(value: ICipherHelper[IBlockCipherCfg]): Self = StObject.set(x, "DES", value.asInstanceOf[js.Any])
    
    inline def setEnc(value: EncStatic): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
    
    inline def setEvpKDF(value: IEvpKDFHelper): Self = StObject.set(x, "EvpKDF", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: FormatStatic): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHmacMD5(value: IHasherHmacHelper): Self = StObject.set(x, "HmacMD5", value.asInstanceOf[js.Any])
    
    inline def setHmacRIPEMD160(value: IHasherHmacHelper): Self = StObject.set(x, "HmacRIPEMD160", value.asInstanceOf[js.Any])
    
    inline def setHmacSHA1(value: IHasherHmacHelper): Self = StObject.set(x, "HmacSHA1", value.asInstanceOf[js.Any])
    
    inline def setHmacSHA224(value: IHasherHmacHelper): Self = StObject.set(x, "HmacSHA224", value.asInstanceOf[js.Any])
    
    inline def setHmacSHA256(value: IHasherHmacHelper): Self = StObject.set(x, "HmacSHA256", value.asInstanceOf[js.Any])
    
    inline def setHmacSHA3(value: IHasherHmacHelper): Self = StObject.set(x, "HmacSHA3", value.asInstanceOf[js.Any])
    
    inline def setHmacSHA384(value: IHasherHmacHelper): Self = StObject.set(x, "HmacSHA384", value.asInstanceOf[js.Any])
    
    inline def setHmacSHA512(value: IHasherHmacHelper): Self = StObject.set(x, "HmacSHA512", value.asInstanceOf[js.Any])
    
    inline def setKdf(value: KdfStatic): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
    
    inline def setLib(value: LibStatic): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    inline def setMD5(value: HasherHelper): Self = StObject.set(x, "MD5", value.asInstanceOf[js.Any])
    
    inline def setMode(value: ModeStatic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPBKDF2(value: IEvpKDFHelper): Self = StObject.set(x, "PBKDF2", value.asInstanceOf[js.Any])
    
    inline def setPad(value: PadStatic): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setRC4(value: CipherHelper): Self = StObject.set(x, "RC4", value.asInstanceOf[js.Any])
    
    inline def setRC4Drop(value: ICipherHelper[js.Object]): Self = StObject.set(x, "RC4Drop", value.asInstanceOf[js.Any])
    
    inline def setRIPEMD160(value: HasherHelper): Self = StObject.set(x, "RIPEMD160", value.asInstanceOf[js.Any])
    
    inline def setRabbit(value: CipherHelper): Self = StObject.set(x, "Rabbit", value.asInstanceOf[js.Any])
    
    inline def setRabbitLegacy(value: CipherHelper): Self = StObject.set(x, "RabbitLegacy", value.asInstanceOf[js.Any])
    
    inline def setSHA1(value: HasherHelper): Self = StObject.set(x, "SHA1", value.asInstanceOf[js.Any])
    
    inline def setSHA224(value: HasherHelper): Self = StObject.set(x, "SHA224", value.asInstanceOf[js.Any])
    
    inline def setSHA256(value: HasherHelper): Self = StObject.set(x, "SHA256", value.asInstanceOf[js.Any])
    
    inline def setSHA3(value: IHasherHelper[ISHA3Cfg]): Self = StObject.set(x, "SHA3", value.asInstanceOf[js.Any])
    
    inline def setSHA384(value: HasherHelper): Self = StObject.set(x, "SHA384", value.asInstanceOf[js.Any])
    
    inline def setSHA512(value: HasherHelper): Self = StObject.set(x, "SHA512", value.asInstanceOf[js.Any])
    
    inline def setTripleDES(value: ICipherHelper[IBlockCipherCfg]): Self = StObject.set(x, "TripleDES", value.asInstanceOf[js.Any])
    
    inline def setX64(value: X64Static): Self = StObject.set(x, "x64", value.asInstanceOf[js.Any])
  }
}

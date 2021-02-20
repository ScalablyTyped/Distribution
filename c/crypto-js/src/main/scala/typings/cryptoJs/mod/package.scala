package typings.cryptoJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def AES: typings.cryptoJs.mod.CipherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AES").asInstanceOf[typings.cryptoJs.mod.CipherHelper]
  
  type CipherParams = typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams
  
  @scala.inline
  def DES: typings.cryptoJs.mod.CipherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DES").asInstanceOf[typings.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def EvpKDF(password: java.lang.String, salt: java.lang.String): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(password: java.lang.String, salt: java.lang.String, cfg: typings.cryptoJs.anon.Hasher): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(password: java.lang.String, salt: typings.cryptoJs.mod.WordArray): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(
    password: java.lang.String,
    salt: typings.cryptoJs.mod.WordArray,
    cfg: typings.cryptoJs.anon.Hasher
  ): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(password: typings.cryptoJs.mod.WordArray, salt: java.lang.String): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(
    password: typings.cryptoJs.mod.WordArray,
    salt: java.lang.String,
    cfg: typings.cryptoJs.anon.Hasher
  ): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(password: typings.cryptoJs.mod.WordArray, salt: typings.cryptoJs.mod.WordArray): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(
    password: typings.cryptoJs.mod.WordArray,
    salt: typings.cryptoJs.mod.WordArray,
    cfg: typings.cryptoJs.anon.Hasher
  ): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  
  type HasherHelper = js.Function2[
    /* message */ typings.cryptoJs.mod.WordArray | java.lang.String, 
    /* cfg */ js.UndefOr[js.Object], 
    typings.cryptoJs.mod.WordArray
  ]
  
  type HmacHasherHelper = js.Function2[
    /* message */ typings.cryptoJs.mod.WordArray | java.lang.String, 
    /* key */ typings.cryptoJs.mod.WordArray | java.lang.String, 
    typings.cryptoJs.mod.WordArray
  ]
  
  @scala.inline
  def HmacMD5: typings.cryptoJs.mod.HmacHasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacMD5").asInstanceOf[typings.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacRIPEMD160: typings.cryptoJs.mod.HmacHasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacRIPEMD160").asInstanceOf[typings.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA1: typings.cryptoJs.mod.HmacHasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA1").asInstanceOf[typings.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA224: typings.cryptoJs.mod.HmacHasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA224").asInstanceOf[typings.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA256: typings.cryptoJs.mod.HmacHasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA256").asInstanceOf[typings.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA3: typings.cryptoJs.mod.HmacHasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA3").asInstanceOf[typings.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA384: typings.cryptoJs.mod.HmacHasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA384").asInstanceOf[typings.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA512: typings.cryptoJs.mod.HmacHasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA512").asInstanceOf[typings.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def MD5: typings.cryptoJs.mod.HasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MD5").asInstanceOf[typings.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def PBKDF2(password: java.lang.String, salt: java.lang.String): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(password: java.lang.String, salt: java.lang.String, cfg: typings.cryptoJs.mod.KDFOption): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(password: java.lang.String, salt: typings.cryptoJs.mod.WordArray): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(
    password: java.lang.String,
    salt: typings.cryptoJs.mod.WordArray,
    cfg: typings.cryptoJs.mod.KDFOption
  ): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(password: typings.cryptoJs.mod.WordArray, salt: java.lang.String): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(
    password: typings.cryptoJs.mod.WordArray,
    salt: java.lang.String,
    cfg: typings.cryptoJs.mod.KDFOption
  ): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(password: typings.cryptoJs.mod.WordArray, salt: typings.cryptoJs.mod.WordArray): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(
    password: typings.cryptoJs.mod.WordArray,
    salt: typings.cryptoJs.mod.WordArray,
    cfg: typings.cryptoJs.mod.KDFOption
  ): typings.cryptoJs.mod.WordArray = (typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.WordArray]
  
  @scala.inline
  def RC4: typings.cryptoJs.mod.CipherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RC4").asInstanceOf[typings.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def RC4Drop: typings.cryptoJs.mod.CipherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RC4Drop").asInstanceOf[typings.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def RIPEMD160: typings.cryptoJs.mod.HasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RIPEMD160").asInstanceOf[typings.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def Rabbit: typings.cryptoJs.mod.CipherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Rabbit").asInstanceOf[typings.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def RabbitLegacy: typings.cryptoJs.mod.CipherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RabbitLegacy").asInstanceOf[typings.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def SHA1: typings.cryptoJs.mod.HasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA1").asInstanceOf[typings.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA224: typings.cryptoJs.mod.HasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA224").asInstanceOf[typings.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA256: typings.cryptoJs.mod.HasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA256").asInstanceOf[typings.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA3: typings.cryptoJs.mod.HasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA3").asInstanceOf[typings.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA384: typings.cryptoJs.mod.HasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA384").asInstanceOf[typings.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA512: typings.cryptoJs.mod.HasherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA512").asInstanceOf[typings.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def TripleDES: typings.cryptoJs.mod.CipherHelper = typings.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TripleDES").asInstanceOf[typings.cryptoJs.mod.CipherHelper]
  
  type WordArray = typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
  
  type X64Word = typings.cryptoJs.mod.global.CryptoJS.x64.Word
}

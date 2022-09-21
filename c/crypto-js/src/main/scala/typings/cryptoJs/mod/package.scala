package typings.cryptoJs.mod

import typings.cryptoJs.mod.^
import typings.cryptoJs.mod.global.CryptoJS.x64.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AES: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("AES").asInstanceOf[CipherHelper]

inline def DES: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("DES").asInstanceOf[CipherHelper]

inline def EvpKDF(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: String, salt: String, cfg: typings.cryptoJs.anon.Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: String, salt: WordArray, cfg: typings.cryptoJs.anon.Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: WordArray, salt: String, cfg: typings.cryptoJs.anon.Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: WordArray, salt: WordArray, cfg: typings.cryptoJs.anon.Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]

inline def HmacMD5: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacMD5").asInstanceOf[HmacHasherHelper]

inline def HmacRIPEMD160: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacRIPEMD160").asInstanceOf[HmacHasherHelper]

inline def HmacSHA1: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA1").asInstanceOf[HmacHasherHelper]

inline def HmacSHA224: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA224").asInstanceOf[HmacHasherHelper]

inline def HmacSHA256: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA256").asInstanceOf[HmacHasherHelper]

inline def HmacSHA3: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA3").asInstanceOf[HmacHasherHelper]

inline def HmacSHA384: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA384").asInstanceOf[HmacHasherHelper]

inline def HmacSHA512: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA512").asInstanceOf[HmacHasherHelper]

inline def MD5: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("MD5").asInstanceOf[HasherHelper]

inline def PBKDF2(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def PBKDF2(password: String, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def PBKDF2(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def PBKDF2(password: String, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def PBKDF2(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def PBKDF2(password: WordArray, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def PBKDF2(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def PBKDF2(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]

inline def RC4: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("RC4").asInstanceOf[CipherHelper]

inline def RC4Drop: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("RC4Drop").asInstanceOf[CipherHelper]

inline def RIPEMD160: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("RIPEMD160").asInstanceOf[HasherHelper]

inline def Rabbit: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("Rabbit").asInstanceOf[CipherHelper]

inline def RabbitLegacy: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("RabbitLegacy").asInstanceOf[CipherHelper]

inline def SHA1: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA1").asInstanceOf[HasherHelper]

inline def SHA224: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA224").asInstanceOf[HasherHelper]

inline def SHA256: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA256").asInstanceOf[HasherHelper]

inline def SHA3: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA3").asInstanceOf[HasherHelper]

inline def SHA384: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA384").asInstanceOf[HasherHelper]

inline def SHA512: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA512").asInstanceOf[HasherHelper]

inline def TripleDES: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("TripleDES").asInstanceOf[CipherHelper]

type CipherParams = typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams

type HasherHelper = js.Function2[/* message */ WordArray | String, /* cfg */ js.UndefOr[js.Object], WordArray]

type HmacHasherHelper = js.Function2[/* message */ WordArray | String, /* key */ WordArray | String, WordArray]

type WordArray = typings.cryptoJs.mod.global.CryptoJS.lib.WordArray

type X64Word = Word

package typings
package cryptoDashJsLib.coreMod.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hashes extends js.Object {
  var AES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.CipherHelper = js.native
  var DES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.CipherHelper = js.native
  var EvpKDF: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.CipherHelper = js.native
  var RC4: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.CipherHelper = js.native
  var RC4Drop: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.CipherHelper = js.native
  var Rabbit: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.CipherHelper = js.native
  var RabbitLegacy: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.CipherHelper = js.native
  var TripleDES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.CipherHelper = js.native
  var algo: cryptoDashJsLib.Anon_DES = js.native
  var enc: cryptoDashJsLib.Anon_Utf8 = js.native
  var format: cryptoDashJsLib.Anon_Hex = js.native
  var lib: cryptoDashJsLib.Anon_WordArray = js.native
  var mode: cryptoDashJsLib.Anon_OFB = js.native
  var pad: cryptoDashJsLib.Anon_Pkcs7 = js.native
  def HmacMD5(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacMD5(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacMD5(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacMD5(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacMD5(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacMD5(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacMD5(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacMD5(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacRIPEMD160(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacRIPEMD160(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacRIPEMD160(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacRIPEMD160(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacRIPEMD160(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacRIPEMD160(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacRIPEMD160(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacRIPEMD160(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA1(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA1(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA1(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA1(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA1(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA1(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA1(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA1(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA224(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA224(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA224(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA224(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA224(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA224(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA224(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA224(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA256(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA256(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA256(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA256(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA256(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA256(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA256(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA256(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA3(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA3(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA3(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA3(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA3(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA3(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA3(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA3(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA384(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA384(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA384(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA384(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA384(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA384(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA384(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA384(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA512(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA512(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA512(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA512(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA512(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA512(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA512(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def HmacSHA512(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def MD5(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def MD5(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def MD5(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def MD5(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def MD5(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def MD5(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def MD5(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def MD5(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def PBKDF2(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def PBKDF2(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def PBKDF2(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def PBKDF2(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def PBKDF2(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def PBKDF2(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def PBKDF2(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def PBKDF2(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def RIPEMD160(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def RIPEMD160(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def RIPEMD160(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def RIPEMD160(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def RIPEMD160(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def RIPEMD160(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def RIPEMD160(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def RIPEMD160(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA1(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA1(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA1(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA1(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA1(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA1(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA1(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA1(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA224(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA224(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA224(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA224(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA224(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA224(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA224(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA224(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA256(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA256(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA256(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA256(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA256(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA256(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA256(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA256(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA3(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA3(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA3(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA3(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA3(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA3(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA3(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA3(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA384(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA384(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA384(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA384(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA384(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA384(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA384(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA384(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA512(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA512(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA512(
    message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    key: java.lang.String,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA512(message: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA512(message: java.lang.String): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA512(
    message: java.lang.String,
    key: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray,
    options: js.Any*
  ): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA512(message: java.lang.String, key: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
  def SHA512(message: java.lang.String, options: js.Any*): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.WordArray = js.native
}


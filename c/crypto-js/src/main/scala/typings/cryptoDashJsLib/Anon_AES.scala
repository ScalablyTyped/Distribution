package typings
package cryptoDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AES extends js.Object {
  var AES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.BlockCipher
  var DES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.BlockCipher
  var EvpKDF: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Base
  var HMAC: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Base
  var MD5: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher
  var PBKDF2: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Base
  var RC4: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.StreamCipher
  var RC4Drop: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.StreamCipher
  var RIPEMD160: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher
  var Rabbit: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.StreamCipher
  var RabbitLegacy: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.StreamCipher
  var SHA1: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher
  var SHA256: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher
  var SHA3: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher
  var SHA384: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher
  var SHA512: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher
  var TripleDES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.BlockCipher
}

object Anon_AES {
  @scala.inline
  def apply(
    AES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.BlockCipher,
    DES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.BlockCipher,
    EvpKDF: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Base,
    HMAC: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Base,
    MD5: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher,
    PBKDF2: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Base,
    RC4: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.StreamCipher,
    RC4Drop: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.StreamCipher,
    RIPEMD160: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher,
    Rabbit: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.StreamCipher,
    RabbitLegacy: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.StreamCipher,
    SHA1: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher,
    SHA256: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher,
    SHA3: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher,
    SHA384: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher,
    SHA512: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Hasher,
    TripleDES: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.BlockCipher
  ): Anon_AES = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AES")(AES)
    __obj.updateDynamic("DES")(DES)
    __obj.updateDynamic("EvpKDF")(EvpKDF)
    __obj.updateDynamic("HMAC")(HMAC)
    __obj.updateDynamic("MD5")(MD5)
    __obj.updateDynamic("PBKDF2")(PBKDF2)
    __obj.updateDynamic("RC4")(RC4)
    __obj.updateDynamic("RC4Drop")(RC4Drop)
    __obj.updateDynamic("RIPEMD160")(RIPEMD160)
    __obj.updateDynamic("Rabbit")(Rabbit)
    __obj.updateDynamic("RabbitLegacy")(RabbitLegacy)
    __obj.updateDynamic("SHA1")(SHA1)
    __obj.updateDynamic("SHA256")(SHA256)
    __obj.updateDynamic("SHA3")(SHA3)
    __obj.updateDynamic("SHA384")(SHA384)
    __obj.updateDynamic("SHA512")(SHA512)
    __obj.updateDynamic("TripleDES")(TripleDES)
    __obj.asInstanceOf[Anon_AES]
  }
}


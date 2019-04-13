package typings
package cryptoDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AES extends js.Object {
  var AES: cryptoDashJsLib.cryptoDashJsMod.BlockCipher
  var DES: cryptoDashJsLib.cryptoDashJsMod.BlockCipher
  var EvpKDF: cryptoDashJsLib.cryptoDashJsMod.Base
  var HMAC: cryptoDashJsLib.cryptoDashJsMod.Base
  var MD5: cryptoDashJsLib.cryptoDashJsMod.Hasher
  var PBKDF2: cryptoDashJsLib.cryptoDashJsMod.Base
  var RC4: cryptoDashJsLib.cryptoDashJsMod.StreamCipher
  var RC4Drop: cryptoDashJsLib.cryptoDashJsMod.StreamCipher
  var RIPEMD160: cryptoDashJsLib.cryptoDashJsMod.Hasher
  var Rabbit: cryptoDashJsLib.cryptoDashJsMod.StreamCipher
  var RabbitLegacy: cryptoDashJsLib.cryptoDashJsMod.StreamCipher
  var SHA1: cryptoDashJsLib.cryptoDashJsMod.Hasher
  var SHA256: cryptoDashJsLib.cryptoDashJsMod.Hasher
  var SHA3: cryptoDashJsLib.cryptoDashJsMod.Hasher
  var SHA384: cryptoDashJsLib.cryptoDashJsMod.Hasher
  var SHA512: cryptoDashJsLib.cryptoDashJsMod.Hasher
  var TripleDES: cryptoDashJsLib.cryptoDashJsMod.BlockCipher
}

object Anon_AES {
  @scala.inline
  def apply(
    AES: cryptoDashJsLib.cryptoDashJsMod.BlockCipher,
    DES: cryptoDashJsLib.cryptoDashJsMod.BlockCipher,
    EvpKDF: cryptoDashJsLib.cryptoDashJsMod.Base,
    HMAC: cryptoDashJsLib.cryptoDashJsMod.Base,
    MD5: cryptoDashJsLib.cryptoDashJsMod.Hasher,
    PBKDF2: cryptoDashJsLib.cryptoDashJsMod.Base,
    RC4: cryptoDashJsLib.cryptoDashJsMod.StreamCipher,
    RC4Drop: cryptoDashJsLib.cryptoDashJsMod.StreamCipher,
    RIPEMD160: cryptoDashJsLib.cryptoDashJsMod.Hasher,
    Rabbit: cryptoDashJsLib.cryptoDashJsMod.StreamCipher,
    RabbitLegacy: cryptoDashJsLib.cryptoDashJsMod.StreamCipher,
    SHA1: cryptoDashJsLib.cryptoDashJsMod.Hasher,
    SHA256: cryptoDashJsLib.cryptoDashJsMod.Hasher,
    SHA3: cryptoDashJsLib.cryptoDashJsMod.Hasher,
    SHA384: cryptoDashJsLib.cryptoDashJsMod.Hasher,
    SHA512: cryptoDashJsLib.cryptoDashJsMod.Hasher,
    TripleDES: cryptoDashJsLib.cryptoDashJsMod.BlockCipher
  ): Anon_AES = {
    val __obj = js.Dynamic.literal(AES = AES, DES = DES, EvpKDF = EvpKDF, HMAC = HMAC, MD5 = MD5, PBKDF2 = PBKDF2, RC4 = RC4, RC4Drop = RC4Drop, RIPEMD160 = RIPEMD160, Rabbit = Rabbit, RabbitLegacy = RabbitLegacy, SHA1 = SHA1, SHA256 = SHA256, SHA3 = SHA3, SHA384 = SHA384, SHA512 = SHA512, TripleDES = TripleDES)
  
    __obj.asInstanceOf[Anon_AES]
  }
}


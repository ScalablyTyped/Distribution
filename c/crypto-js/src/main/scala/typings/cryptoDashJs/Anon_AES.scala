package typings.cryptoDashJs

import typings.cryptoDashJs.cryptoDashJsMod.Base
import typings.cryptoDashJs.cryptoDashJsMod.BlockCipher
import typings.cryptoDashJs.cryptoDashJsMod.Hasher
import typings.cryptoDashJs.cryptoDashJsMod.StreamCipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AES extends js.Object {
  var AES: BlockCipher
  var DES: BlockCipher
  var EvpKDF: Base
  var HMAC: Base
  var MD5: Hasher
  var PBKDF2: Base
  var RC4: StreamCipher
  var RC4Drop: StreamCipher
  var RIPEMD160: Hasher
  var Rabbit: StreamCipher
  var RabbitLegacy: StreamCipher
  var SHA1: Hasher
  var SHA256: Hasher
  var SHA3: Hasher
  var SHA384: Hasher
  var SHA512: Hasher
  var TripleDES: BlockCipher
}

object Anon_AES {
  @scala.inline
  def apply(
    AES: BlockCipher,
    DES: BlockCipher,
    EvpKDF: Base,
    HMAC: Base,
    MD5: Hasher,
    PBKDF2: Base,
    RC4: StreamCipher,
    RC4Drop: StreamCipher,
    RIPEMD160: Hasher,
    Rabbit: StreamCipher,
    RabbitLegacy: StreamCipher,
    SHA1: Hasher,
    SHA256: Hasher,
    SHA3: Hasher,
    SHA384: Hasher,
    SHA512: Hasher,
    TripleDES: BlockCipher
  ): Anon_AES = {
    val __obj = js.Dynamic.literal(AES = AES, DES = DES, EvpKDF = EvpKDF, HMAC = HMAC, MD5 = MD5, PBKDF2 = PBKDF2, RC4 = RC4, RC4Drop = RC4Drop, RIPEMD160 = RIPEMD160, Rabbit = Rabbit, RabbitLegacy = RabbitLegacy, SHA1 = SHA1, SHA256 = SHA256, SHA3 = SHA3, SHA384 = SHA384, SHA512 = SHA512, TripleDES = TripleDES)
  
    __obj.asInstanceOf[Anon_AES]
  }
}


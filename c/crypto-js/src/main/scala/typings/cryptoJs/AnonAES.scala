package typings.cryptoJs

import typings.cryptoJs.mod.Base
import typings.cryptoJs.mod.BlockCipher
import typings.cryptoJs.mod.Hasher
import typings.cryptoJs.mod.StreamCipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAES extends js.Object {
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

object AnonAES {
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
  ): AnonAES = {
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], DES = DES.asInstanceOf[js.Any], EvpKDF = EvpKDF.asInstanceOf[js.Any], HMAC = HMAC.asInstanceOf[js.Any], MD5 = MD5.asInstanceOf[js.Any], PBKDF2 = PBKDF2.asInstanceOf[js.Any], RC4 = RC4.asInstanceOf[js.Any], RC4Drop = RC4Drop.asInstanceOf[js.Any], RIPEMD160 = RIPEMD160.asInstanceOf[js.Any], Rabbit = Rabbit.asInstanceOf[js.Any], RabbitLegacy = RabbitLegacy.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SHA256 = SHA256.asInstanceOf[js.Any], SHA3 = SHA3.asInstanceOf[js.Any], SHA384 = SHA384.asInstanceOf[js.Any], SHA512 = SHA512.asInstanceOf[js.Any], TripleDES = TripleDES.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAES]
  }
}


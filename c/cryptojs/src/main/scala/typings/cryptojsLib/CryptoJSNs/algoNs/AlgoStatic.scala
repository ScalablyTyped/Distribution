package typings
package cryptojsLib.CryptoJSNs.algoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgoStatic extends js.Object {
  var AES: AES
  var DES: DES
  var EvpKDF: EvpKDF
  var HMAC: HMAC
  var MD5: MD5
  var PBKDF2: PBKDF2
  var RC4: RC4
  var RC4Drop: RC4Drop
  var RIPEMD160: RIPEMD160
  var Rabbit: Rabbit
  var RabbitLegacy: RabbitLegacy
  var SHA1: SHA1
  var SHA224: SHA224
  var SHA256: SHA256
  var SHA3: SHA3
  var SHA384: SHA384
  var SHA512: SHA512
  var TripleDES: TripleDES
}

object AlgoStatic {
  @scala.inline
  def apply(
    AES: AES,
    DES: DES,
    EvpKDF: EvpKDF,
    HMAC: HMAC,
    MD5: MD5,
    PBKDF2: PBKDF2,
    RC4: RC4,
    RC4Drop: RC4Drop,
    RIPEMD160: RIPEMD160,
    Rabbit: Rabbit,
    RabbitLegacy: RabbitLegacy,
    SHA1: SHA1,
    SHA224: SHA224,
    SHA256: SHA256,
    SHA3: SHA3,
    SHA384: SHA384,
    SHA512: SHA512,
    TripleDES: TripleDES
  ): AlgoStatic = {
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
    __obj.updateDynamic("SHA224")(SHA224)
    __obj.updateDynamic("SHA256")(SHA256)
    __obj.updateDynamic("SHA3")(SHA3)
    __obj.updateDynamic("SHA384")(SHA384)
    __obj.updateDynamic("SHA512")(SHA512)
    __obj.updateDynamic("TripleDES")(TripleDES)
    __obj.asInstanceOf[AlgoStatic]
  }
}


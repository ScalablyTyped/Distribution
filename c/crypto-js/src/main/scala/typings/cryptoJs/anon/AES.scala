package typings.cryptoJs.anon

import typings.cryptoJs.mod.Base
import typings.cryptoJs.mod.BlockCipher
import typings.cryptoJs.mod.Hasher
import typings.cryptoJs.mod.StreamCipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AES extends js.Object {
  var AES: BlockCipher = js.native
  var DES: BlockCipher = js.native
  var EvpKDF: Base = js.native
  var HMAC: Base = js.native
  var MD5: Hasher = js.native
  var PBKDF2: Base = js.native
  var RC4: StreamCipher = js.native
  var RC4Drop: StreamCipher = js.native
  var RIPEMD160: Hasher = js.native
  var Rabbit: StreamCipher = js.native
  var RabbitLegacy: StreamCipher = js.native
  var SHA1: Hasher = js.native
  var SHA256: Hasher = js.native
  var SHA3: Hasher = js.native
  var SHA384: Hasher = js.native
  var SHA512: Hasher = js.native
  var TripleDES: BlockCipher = js.native
}

object AES {
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
  ): AES = {
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], DES = DES.asInstanceOf[js.Any], EvpKDF = EvpKDF.asInstanceOf[js.Any], HMAC = HMAC.asInstanceOf[js.Any], MD5 = MD5.asInstanceOf[js.Any], PBKDF2 = PBKDF2.asInstanceOf[js.Any], RC4 = RC4.asInstanceOf[js.Any], RC4Drop = RC4Drop.asInstanceOf[js.Any], RIPEMD160 = RIPEMD160.asInstanceOf[js.Any], Rabbit = Rabbit.asInstanceOf[js.Any], RabbitLegacy = RabbitLegacy.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SHA256 = SHA256.asInstanceOf[js.Any], SHA3 = SHA3.asInstanceOf[js.Any], SHA384 = SHA384.asInstanceOf[js.Any], SHA512 = SHA512.asInstanceOf[js.Any], TripleDES = TripleDES.asInstanceOf[js.Any])
    __obj.asInstanceOf[AES]
  }
  @scala.inline
  implicit class AESOps[Self <: AES] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAES(value: BlockCipher): Self = this.set("AES", value.asInstanceOf[js.Any])
    @scala.inline
    def setDES(value: BlockCipher): Self = this.set("DES", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvpKDF(value: Base): Self = this.set("EvpKDF", value.asInstanceOf[js.Any])
    @scala.inline
    def setHMAC(value: Base): Self = this.set("HMAC", value.asInstanceOf[js.Any])
    @scala.inline
    def setMD5(value: Hasher): Self = this.set("MD5", value.asInstanceOf[js.Any])
    @scala.inline
    def setPBKDF2(value: Base): Self = this.set("PBKDF2", value.asInstanceOf[js.Any])
    @scala.inline
    def setRC4(value: StreamCipher): Self = this.set("RC4", value.asInstanceOf[js.Any])
    @scala.inline
    def setRC4Drop(value: StreamCipher): Self = this.set("RC4Drop", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIPEMD160(value: Hasher): Self = this.set("RIPEMD160", value.asInstanceOf[js.Any])
    @scala.inline
    def setRabbit(value: StreamCipher): Self = this.set("Rabbit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRabbitLegacy(value: StreamCipher): Self = this.set("RabbitLegacy", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHA1(value: Hasher): Self = this.set("SHA1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHA256(value: Hasher): Self = this.set("SHA256", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHA3(value: Hasher): Self = this.set("SHA3", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHA384(value: Hasher): Self = this.set("SHA384", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHA512(value: Hasher): Self = this.set("SHA512", value.asInstanceOf[js.Any])
    @scala.inline
    def setTripleDES(value: BlockCipher): Self = this.set("TripleDES", value.asInstanceOf[js.Any])
  }
  
}


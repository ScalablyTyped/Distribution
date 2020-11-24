package typings.cryptojs.CryptoJS.algo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgoStatic extends js.Object {
  
  var AES: typings.cryptojs.CryptoJS.algo.AES = js.native
  
  var DES: typings.cryptojs.CryptoJS.algo.DES = js.native
  
  var EvpKDF: typings.cryptojs.CryptoJS.algo.EvpKDF = js.native
  
  var HMAC: typings.cryptojs.CryptoJS.algo.HMAC = js.native
  
  var MD5: typings.cryptojs.CryptoJS.algo.MD5 = js.native
  
  var PBKDF2: typings.cryptojs.CryptoJS.algo.PBKDF2 = js.native
  
  var RC4: typings.cryptojs.CryptoJS.algo.RC4 = js.native
  
  var RC4Drop: typings.cryptojs.CryptoJS.algo.RC4Drop = js.native
  
  var RIPEMD160: typings.cryptojs.CryptoJS.algo.RIPEMD160 = js.native
  
  var Rabbit: typings.cryptojs.CryptoJS.algo.Rabbit = js.native
  
  var RabbitLegacy: typings.cryptojs.CryptoJS.algo.RabbitLegacy = js.native
  
  var SHA1: typings.cryptojs.CryptoJS.algo.SHA1 = js.native
  
  var SHA224: typings.cryptojs.CryptoJS.algo.SHA224 = js.native
  
  var SHA256: typings.cryptojs.CryptoJS.algo.SHA256 = js.native
  
  var SHA3: typings.cryptojs.CryptoJS.algo.SHA3 = js.native
  
  var SHA384: typings.cryptojs.CryptoJS.algo.SHA384 = js.native
  
  var SHA512: typings.cryptojs.CryptoJS.algo.SHA512 = js.native
  
  var TripleDES: typings.cryptojs.CryptoJS.algo.TripleDES = js.native
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
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], DES = DES.asInstanceOf[js.Any], EvpKDF = EvpKDF.asInstanceOf[js.Any], HMAC = HMAC.asInstanceOf[js.Any], MD5 = MD5.asInstanceOf[js.Any], PBKDF2 = PBKDF2.asInstanceOf[js.Any], RC4 = RC4.asInstanceOf[js.Any], RC4Drop = RC4Drop.asInstanceOf[js.Any], RIPEMD160 = RIPEMD160.asInstanceOf[js.Any], Rabbit = Rabbit.asInstanceOf[js.Any], RabbitLegacy = RabbitLegacy.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SHA224 = SHA224.asInstanceOf[js.Any], SHA256 = SHA256.asInstanceOf[js.Any], SHA3 = SHA3.asInstanceOf[js.Any], SHA384 = SHA384.asInstanceOf[js.Any], SHA512 = SHA512.asInstanceOf[js.Any], TripleDES = TripleDES.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgoStatic]
  }
  
  @scala.inline
  implicit class AlgoStaticOps[Self <: AlgoStatic] (val x: Self) extends AnyVal {
    
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
    def setAES(value: AES): Self = this.set("AES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDES(value: DES): Self = this.set("DES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvpKDF(value: EvpKDF): Self = this.set("EvpKDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHMAC(value: HMAC): Self = this.set("HMAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5(value: MD5): Self = this.set("MD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPBKDF2(value: PBKDF2): Self = this.set("PBKDF2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRC4(value: RC4): Self = this.set("RC4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRC4Drop(value: RC4Drop): Self = this.set("RC4Drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIPEMD160(value: RIPEMD160): Self = this.set("RIPEMD160", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRabbit(value: Rabbit): Self = this.set("Rabbit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRabbitLegacy(value: RabbitLegacy): Self = this.set("RabbitLegacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA1(value: SHA1): Self = this.set("SHA1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA224(value: SHA224): Self = this.set("SHA224", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA256(value: SHA256): Self = this.set("SHA256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA3(value: SHA3): Self = this.set("SHA3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA384(value: SHA384): Self = this.set("SHA384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA512(value: SHA512): Self = this.set("SHA512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripleDES(value: TripleDES): Self = this.set("TripleDES", value.asInstanceOf[js.Any])
  }
}

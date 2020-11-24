package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibStatic extends js.Object {
  
  var Base: typings.cryptojs.CryptoJS.lib.Base = js.native
  
  var CipherParams: typings.cryptojs.CryptoJS.lib.CipherParams = js.native
  
  var PasswordBasedCipher: typings.cryptojs.CryptoJS.lib.PasswordBasedCipher = js.native
  
  var SerializableCipher: typings.cryptojs.CryptoJS.lib.SerializableCipher = js.native
  
  var WordArray: typings.cryptojs.CryptoJS.lib.WordArray = js.native
}
object LibStatic {
  
  @scala.inline
  def apply(
    Base: Base,
    CipherParams: CipherParams,
    PasswordBasedCipher: PasswordBasedCipher,
    SerializableCipher: SerializableCipher,
    WordArray: WordArray
  ): LibStatic = {
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], CipherParams = CipherParams.asInstanceOf[js.Any], PasswordBasedCipher = PasswordBasedCipher.asInstanceOf[js.Any], SerializableCipher = SerializableCipher.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibStatic]
  }
  
  @scala.inline
  implicit class LibStaticOps[Self <: LibStatic] (val x: Self) extends AnyVal {
    
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
    def setBase(value: Base): Self = this.set("Base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherParams(value: CipherParams): Self = this.set("CipherParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBasedCipher(value: PasswordBasedCipher): Self = this.set("PasswordBasedCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializableCipher(value: SerializableCipher): Self = this.set("SerializableCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordArray(value: WordArray): Self = this.set("WordArray", value.asInstanceOf[js.Any])
  }
}

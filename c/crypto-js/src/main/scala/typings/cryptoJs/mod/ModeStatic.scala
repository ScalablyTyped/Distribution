package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModeStatic extends js.Object {
  
  /**
    * Initializes a newly created mode.
    *
    * @param cipher A block cipher instance.
    * @param iv The IV words.
    *
    * @example
    *
    *     var mode = CryptoJS.mode.CBC.Encryptor.create(cipher, iv.words);
    */
  def create(cipher: Cipher, iv: js.Array[Double]): Mode_ = js.native
}
object ModeStatic {
  
  @scala.inline
  def apply(create: (Cipher, js.Array[Double]) => Mode_): ModeStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[ModeStatic]
  }
  
  @scala.inline
  implicit class ModeStaticOps[Self <: ModeStatic] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: (Cipher, js.Array[Double]) => Mode_): Self = this.set("create", js.Any.fromFunction2(value))
  }
}

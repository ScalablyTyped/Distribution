package typings.cryptojs.CryptoJS.kdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KdfStatic extends js.Object {
  
  var OpenSSL: IKdfImpl = js.native
}
object KdfStatic {
  
  @scala.inline
  def apply(OpenSSL: IKdfImpl): KdfStatic = {
    val __obj = js.Dynamic.literal(OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[KdfStatic]
  }
  
  @scala.inline
  implicit class KdfStaticOps[Self <: KdfStatic] (val x: Self) extends AnyVal {
    
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
    def setOpenSSL(value: IKdfImpl): Self = this.set("OpenSSL", value.asInstanceOf[js.Any])
  }
}

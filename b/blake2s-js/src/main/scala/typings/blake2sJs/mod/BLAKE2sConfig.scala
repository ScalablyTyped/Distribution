package typings.blake2sJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BLAKE2sConfig extends js.Object {
  
  var key: js.UndefOr[ByteArray] = js.native
  
  var personalization: js.UndefOr[ByteArray] = js.native
  
  var salt: js.UndefOr[ByteArray] = js.native
}
object BLAKE2sConfig {
  
  @scala.inline
  def apply(): BLAKE2sConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BLAKE2sConfig]
  }
  
  @scala.inline
  implicit class BLAKE2sConfigOps[Self <: BLAKE2sConfig] (val x: Self) extends AnyVal {
    
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
    def setKeyVarargs(value: Double*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: ByteArray): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPersonalizationVarargs(value: Double*): Self = this.set("personalization", js.Array(value :_*))
    
    @scala.inline
    def setPersonalization(value: ByteArray): Self = this.set("personalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalization: Self = this.set("personalization", js.undefined)
    
    @scala.inline
    def setSaltVarargs(value: Double*): Self = this.set("salt", js.Array(value :_*))
    
    @scala.inline
    def setSalt(value: ByteArray): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
  }
}

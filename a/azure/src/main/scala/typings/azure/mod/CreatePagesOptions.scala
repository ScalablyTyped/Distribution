package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePagesOptions extends LeaseAccessConditionsOptions {
  
  var contentMD5: js.UndefOr[String] = js.native
  
  var useTransactionalMD5: js.UndefOr[Boolean] = js.native
}
object CreatePagesOptions {
  
  @scala.inline
  def apply(): CreatePagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePagesOptions]
  }
  
  @scala.inline
  implicit class CreatePagesOptionsOps[Self <: CreatePagesOptions] (val x: Self) extends AnyVal {
    
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
    def setContentMD5(value: String): Self = this.set("contentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMD5: Self = this.set("contentMD5", js.undefined)
    
    @scala.inline
    def setUseTransactionalMD5(value: Boolean): Self = this.set("useTransactionalMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTransactionalMD5: Self = this.set("useTransactionalMD5", js.undefined)
  }
}

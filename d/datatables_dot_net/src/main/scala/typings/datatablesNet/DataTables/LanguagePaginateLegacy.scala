package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguagePaginateLegacy extends js.Object {
  
  var sFirst: js.UndefOr[String] = js.native
  
  var sLast: js.UndefOr[String] = js.native
  
  var sNext: js.UndefOr[String] = js.native
  
  var sPrevious: js.UndefOr[String] = js.native
}
object LanguagePaginateLegacy {
  
  @scala.inline
  def apply(): LanguagePaginateLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguagePaginateLegacy]
  }
  
  @scala.inline
  implicit class LanguagePaginateLegacyOps[Self <: LanguagePaginateLegacy] (val x: Self) extends AnyVal {
    
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
    def setSFirst(value: String): Self = this.set("sFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSFirst: Self = this.set("sFirst", js.undefined)
    
    @scala.inline
    def setSLast(value: String): Self = this.set("sLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSLast: Self = this.set("sLast", js.undefined)
    
    @scala.inline
    def setSNext(value: String): Self = this.set("sNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSNext: Self = this.set("sNext", js.undefined)
    
    @scala.inline
    def setSPrevious(value: String): Self = this.set("sPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSPrevious: Self = this.set("sPrevious", js.undefined)
  }
}

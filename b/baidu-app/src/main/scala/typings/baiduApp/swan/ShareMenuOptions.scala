package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareMenuOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var withShareTicket: js.UndefOr[Boolean] = js.native
}
object ShareMenuOptions {
  
  @scala.inline
  def apply(): ShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareMenuOptions]
  }
  
  @scala.inline
  implicit class ShareMenuOptionsOps[Self <: ShareMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setWithShareTicket(value: Boolean): Self = this.set("withShareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithShareTicket: Self = this.set("withShareTicket", js.undefined)
  }
}

package typings.connectFlash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectFlashOptions extends js.Object {
  
  var unsafe: js.UndefOr[Boolean] = js.native
}
object IConnectFlashOptions {
  
  @scala.inline
  def apply(): IConnectFlashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectFlashOptions]
  }
  
  @scala.inline
  implicit class IConnectFlashOptionsOps[Self <: IConnectFlashOptions] (val x: Self) extends AnyVal {
    
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
    def setUnsafe(value: Boolean): Self = this.set("unsafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe: Self = this.set("unsafe", js.undefined)
  }
}

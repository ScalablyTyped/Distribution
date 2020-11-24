package typings.backboneLayoutmanager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutManagerOptions extends js.Object {
  
  var el: js.UndefOr[Boolean] = js.native
  
  var manage: js.UndefOr[Boolean] = js.native
}
object LayoutManagerOptions {
  
  @scala.inline
  def apply(): LayoutManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutManagerOptions]
  }
  
  @scala.inline
  implicit class LayoutManagerOptionsOps[Self <: LayoutManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setEl(value: Boolean): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setManage(value: Boolean): Self = this.set("manage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManage: Self = this.set("manage", js.undefined)
  }
}

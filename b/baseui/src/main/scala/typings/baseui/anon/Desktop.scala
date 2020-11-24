package typings.baseui.anon

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Desktop extends js.Object {
  
  var desktop: js.UndefOr[horizontal | vertical] = js.native
  
  var mobile: js.UndefOr[horizontal | vertical] = js.native
}
object Desktop {
  
  @scala.inline
  def apply(): Desktop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desktop]
  }
  
  @scala.inline
  implicit class DesktopOps[Self <: Desktop] (val x: Self) extends AnyVal {
    
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
    def setDesktop(value: horizontal | vertical): Self = this.set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    
    @scala.inline
    def setMobile(value: horizontal | vertical): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
  }
}

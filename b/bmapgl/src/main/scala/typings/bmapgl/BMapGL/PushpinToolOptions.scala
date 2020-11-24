package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushpinToolOptions extends js.Object {
  
  var cursor: js.UndefOr[String] = js.native
  
  var followText: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[Icon] = js.native
}
object PushpinToolOptions {
  
  @scala.inline
  def apply(): PushpinToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushpinToolOptions]
  }
  
  @scala.inline
  implicit class PushpinToolOptionsOps[Self <: PushpinToolOptions] (val x: Self) extends AnyVal {
    
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setFollowText(value: String): Self = this.set("followText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowText: Self = this.set("followText", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
  }
}

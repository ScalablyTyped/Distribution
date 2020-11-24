package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.removeSubTapp()
@js.native
trait RemoveSubTappConfig extends js.Object {
  
  var close: Boolean = js.native
  
  var remove: Boolean = js.native
  
  var tappID: Double = js.native
}
object RemoveSubTappConfig {
  
  @scala.inline
  def apply(close: Boolean, remove: Boolean, tappID: Double): RemoveSubTappConfig = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], tappID = tappID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSubTappConfig]
  }
  
  @scala.inline
  implicit class RemoveSubTappConfigOps[Self <: RemoveSubTappConfig] (val x: Self) extends AnyVal {
    
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
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTappID(value: Double): Self = this.set("tappID", value.asInstanceOf[js.Any])
  }
}

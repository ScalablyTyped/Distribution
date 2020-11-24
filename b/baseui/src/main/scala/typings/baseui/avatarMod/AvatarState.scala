package typings.baseui.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarState extends js.Object {
  
  var noImageAvailable: Boolean = js.native
}
object AvatarState {
  
  @scala.inline
  def apply(noImageAvailable: Boolean): AvatarState = {
    val __obj = js.Dynamic.literal(noImageAvailable = noImageAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarState]
  }
  
  @scala.inline
  implicit class AvatarStateOps[Self <: AvatarState] (val x: Self) extends AnyVal {
    
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
    def setNoImageAvailable(value: Boolean): Self = this.set("noImageAvailable", value.asInstanceOf[js.Any])
  }
}
